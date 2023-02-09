// Init Path
__path = process.cwd();
// End Init Path


// Init Model
const bookModel = require(`./../../models/index`).book;

//Init Library
const Op = require(`sequelize`).Op
const multer = require('multer');
const path = require('path');
const fs = require(`fs`);

//Upload
const upload = require(`./upload`).single(`cover`)

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
        let newBook = {
            isbn: request.body.isbn,
            title: request.body.title,
            author: request.body.author,
            publisher: request.body.publisher,
            category: request.body.category,
            stok: request.body.stok,
            cover: request.file.filename
        }
        /** execute inserting data to book's table */
        bookModel.create(newBook)
            .then(result => {
                /** if insert's process success */
                return response.json({
                    success: true,
                    data: result,
                    message: `New book has been inserted`
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
        let data = await bookModel.findAll()
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
        const data = await bookModel.findAll({
            where: {
                title: {
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
        const data = await bookModel.findOne({
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
            let book = {
                isbn: request.body.isbn,
                title: request.body.title,
                author: request.body.author,
                publisher: request.body.publisher,
                category: request.body.category,
                stok: request.body.stok
            }
            /** check if file is not empty,
            * it means update data within reupload file
            */
            if (request.file) {
                /** get selected book's data */
                const selectedBook = await bookModel.findOne({
                    where: { id: id }
                })
                /** get old filename of cover file */
                const oldCoverBook = selectedBook.cover
                /** prepare path of old cover to delete file */
                const pathCover = path.join(__dirname, `./../../asset/cover/`, oldCoverBook)

                /** check file existence */
                if (fs.existsSync(pathCover)) {
                    /** delete old cover file */
                    fs.unlink(pathCover, error =>

                        console.log(error))
                }

                /** add new cover filename to book object */
                book.cover = request.file.filename
            }
            /** execute update data based on defined id book */
            bookModel.update(book, { where: { id: id } })
                .then(result => {
                    /** if update's process success */
                    return response.json({
                        success: true,
                        message: `Data book has been updated`
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
        const data = await bookModel.destroy({
            where: {
                id,
            },
        });
        let res = {
            status: "success",
            message: "Data Berhasil dihapus",
            id: id,
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



module.exports = {
    store,
    index,
    showAllbyname,
    showByid,
    update,
    destroy
}