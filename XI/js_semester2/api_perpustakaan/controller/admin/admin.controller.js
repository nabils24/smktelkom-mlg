// Init Path
__path = process.cwd();
// End Init Path


//init md5
var md5 = require('md5');


// Init Model
const adminModel = require(`../../models/index`).admin

//Init Op
const Op = require(`sequelize`).Op

//init funct

async function store(hasil) {
    try {
        let { name,contact, address, username, password } = hasil;
        let passhash = md5(password)
        const data = await adminModel.create({
            name,
            contact,
            address,
            username,
            password: passhash,
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

async function index() {
    try {
        const data = await adminModel.findAll();
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
        const data = await adminModel.findAll({
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
        const data = await adminModel.findOne({
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

async function update(hasil) {
    try {
        const { id, name,contact, address, username, password } = hasil;
        let passhash = md5(password)
        const data = await adminModel.update(
            {
                name,
                contact,
                address,
                username,
                password: passhash,
            },
            {
                where: {
                    id,
                },
            }
        );
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

async function destroy(id) {
    try {
        const data = await adminModel.destroy({
            where: {
                id,
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



module.exports = {
    store,
    index,
    showAllbyname,
    showByid,
    update,
    destroy
}