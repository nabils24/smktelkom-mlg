// Init Path
__path = process.cwd();
// End Init Path

// Init Var Express JS, Cors, Secure, Request, Axios, Dotenv, Fs
var express = require("express");
var secure = require("ssl-express-www");
var cors = require("cors");
var dotenv = require("dotenv").config();
var multerInstance = require('./../controller/buku/upload');

// Init Router
var router = express.Router();

// Init Model
var { memberController, adminController, bukuController } = require("./../controller/index");

// set header api
router.use(function (req, res, next) {
    res.setHeader("X-Powered-By", "Nabils24-Api");
    res.setHeader("X-Developer", "Nabil Sahsada");
    res.setHeader("contact", "nabilsahsadacode@gmail.com");
    next();
});

// router
router.get("/", (req, res) => {
    res.json({
        status: "success",
        message: "Welcome to API",
    });
});

// Api member
// Create
router.post("/member/create", memberController.store);
// Read
router.get("/member/findAll", (req, res) => {
    memberController.index().then((result) => {
        res.status(200).send(result)
    })
})
router.get("/member/findby", (req, res) => {
    if (req.query.id) {
        var id = req.query.id
        memberController.showByid(id).then((result) => {
            res.status(200).send(result)
        })
    } else if (req.query.nama) {
        var nama = req.query.nama
        memberController.showAllbyname(nama).then((result) => {
            res.status(200).send(result)
        })
    }

})
// Update
router.put("/member/update", memberController.update);

// Delete
router.delete("/member/delete", (req, res) => {
    let id = req.query.id
    memberController.destroy(id).then((result) => {
        res.status(200).send(result)
    })
});

// Api admin
// Create
router.post("/admin/create", (req, res) => {
    var post = {
        name: req.body.nama,
        contact: req.body.kontak,
        address: req.body.alamat,
        username: req.body.username,
        password: req.body.password,
    }
    adminController.store(post).then((result) => {
        res.status(200).send(result)
    })
});
// Read
router.get("/admin/findAll", (req, res) => {
    adminController.index().then((result) => {
        res.status(200).send(result)
    })
})
router.get("/admin/findby", (req, res) => {
    if (req.query.id) {
        var id = req.query.id
        adminController.showByid(id).then((result) => {
            res.status(200).send(result)
        })
    } else if (req.query.nama) {
        var nama = req.query.nama
        adminController.showAllbyname(nama).then((result) => {
            res.status(200).send(result)
        })
    }

})
// Update
router.put("/admin/update", (req, res) => {
    var post = {
        id: req.body.id,
        name: req.body.nama,
        contact: req.body.kontak,
        address: req.body.alamat,
        username: req.body.username,
        password: req.body.password,
    }
    adminController.update(post).then((result) => {
        res.status(200).send(result)
    })
});
// Delete
router.delete("/admin/delete", (req, res) => {
    var id = req.body.id
    adminController.destroy(id).then((result) => {
        res.status(200).send(result)
    })
});


// Api buku
// Create
router.post("/buku/create", bukuController.store);
// Read
router.get("/buku/findAll", (req, res) => {
    bukuController.index().then((result) => {
        res.status(200).send(result)
    })
})
router.get("/buku/findby", (req, res) => {
    if (req.query.id) {
        var id = req.query.id
        bukuController.showByid(id).then((result) => {
            res.status(200).send(result)
        })
    } else if (req.query.nama) {
        var nama = req.query.nama
        bukuController.showAllbyname(nama).then((result) => {
            res.status(200).send(result)
        })
    }

})
// Update
router.put("/buku/update", bukuController.update);

// Delete
router.delete("/buku/delete", (req, res) => {
    var id = req.query.id
    bukuController.destroy(id).then((result) => {
        res.status(200).send(result)
    })
});


router.use(function (req, res) {
    res.status(404).json({
        status: 404,
        message: "Not Found",
    });
});


module.exports = router;
