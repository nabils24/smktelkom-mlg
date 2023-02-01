// Init Path
__path = process.cwd();
// End Init Path


// Init Model
const memberModel = require(`./../../models/index`).member

//Init Op
const Op = require(`sequelize`).Op

//init funct

async function store(hasil) {
    try {
        const { name, gender, contact, address } = hasil;
        const data = await memberModel.create({
            name,
            gender,
            contact,
            address,
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

async function update(hasil) {
    try {
        const { id, name, gender, contact, address } = hasil;
        const data = await memberModel.update(
            {
                name,
                gender,
                contact,
                address,
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
        const data = await memberModel.destroy({
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