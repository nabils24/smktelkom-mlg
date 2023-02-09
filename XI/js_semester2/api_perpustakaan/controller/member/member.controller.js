// Init Path
__path = process.cwd();
// End Init Path


// Init Model
const memberModel = require(`../../models/index`).member

//Init Library
const multer = require('multer');
const path = require('path');
const fs = require(`fs`);

//Upload
const upload = require(`./upload_photo.controller`).single(`photo`)

//Init Op
const Op = require(`sequelize`).Op

//init funct

async function store(request, response) {
    /** run function upload */
    upload(request, response, async error => {
        /** check if there are errorwhen upload */
        if (error) {
            return response.json({ message: error })
        }
        /** check if file is empty */
        if (!request.file) {
            return response.json({
                message: `Nothing to Upload`

            })
        }
        /** prepare data from request */
        let newMember = {
            name: request.body.name,
            gender: request.body.gender,
            contact: request.body.contact,
            address: request.body.address,
            photo: request.file.filename
        }
        /** execute inserting data to book's table */
        memberModel.create(newMember)
            .then(result => {
                /** if insert's process success */
                return response.json({
                    success: true,
                    data: result,
                    message: `New member has been inserted`
                })
            })
            .catch(error => {
                /** if insert's process failed */
                return response.json({
                    success: false,
                    message: error.message
                })
            })
    })
}


async function index() {
    try {
        const data = await memberModel.findAll();
        let res = {
            status: "success",
            message: "Data berhasil ditampilkan",
            data,
        };
        return res;
    } catch (error) {
        let res = {
            status: "error",
            message: error.message,
        };
        return res;
    }
}

async function showAllbyname(name) {
    try {
        const data = await memberModel.findAll({
            where: {
                name: {
                    [Op.like]: `%${name}%`,
                },
            },
        });
        let res = {
            status: "success",
            message: "Data berhasil ditampilkan",
            data,
        };
        return res;

    } catch (error) {
        let res = {
            status: "error",
            message: error.message,
        };
        return res;
    }

}

async function showByid(id) {
    try {
        const data = await memberModel.findOne({
            where: {
                id: id,
            },
        });
        let res = {
            status: "success",
            message: "Data berhasil ditampilkan",
            data,
        };
        return res;

    } catch (error) {
        let res = {
            status: "error",
            message: error.message,
        };
        return res;
    }

}

async function update(request, response) {
    try {
        upload(request, response, async error => {
            /** check if there are error when upload */
            if (error) {
                return response.json({ message: error })
            }
            /** store selected book ID that will update */
            let id = request.body.id
            /** prepare book's data that will update */
            let member = {
                name: request.body.name,
                gender: request.body.gender,
                contact: request.body.contact,
                address: request.body.address
            }
            /** check if file is not empty,
            * it means update data within reupload file
            */
            if (request.file) {
                /** get selected book's data */
                const selectedMember = await memberModel.findOne({
                    where: { id: id }
                })
                /** get old filename of cover file */
                const oldphotoMember = selectedMember.photo
                /** prepare path of old cover to delete file */
                const pathCover = path.join(__dirname, `./../../asset/photo/`, oldphotoMember)

                /** check file existence */
                if (fs.existsSync(pathCover)) {
                    /** delete old cover file */
                    fs.unlink(pathCover, error =>

                        console.log(error))
                }

                /** add new cover filename to book object */
                member.photo = request.file.filename
            }
            /** execute update data based on defined id book */
            memberModel.update(member, { where: { id: id } })
                .then(result => {
                    /** if update's process success */
                    return response.json({
                        success: true,
                        message: `Data member has been updated`,
                        data: member
                    })
                })
                .catch(error => {
                    /** if update's process fail */
                    return response.json({
                        msg: error.message
                    })
                })
        })

    } catch (error) {
        let res = {
            status: "error",
            message: error.message,
        };
        return res;
    }
}

async function destroy(id) {
    try {
        const data = await memberModel.destroy({
            where: {
                id,
            },
        });
        let res = {
            status: "success",
            message: "Data berhasil dihapus!",
            data,
        };
        if (data == 0) {
            res = {
                status: "error",
                message: "Mungkin ID Ini Tidak ada atau Sudah Terhapus",
            };
        }
        return res;
    } catch (error) {
        let res = {
            status: "error",
            message: error.message,
        };
        return res;
    }
}



module.exports = {
    store,
    index,
    showAllbyname,
    showByid,
    update,
    destroy
}