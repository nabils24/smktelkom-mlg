// Init Path
__path = process.cwd();
// End Init Path

// Init Var Express JS, Cors, Secure, Request, Axios, Dotenv, Fs
var express = require("express");
var secure = require("ssl-express-www");
var cors = require("cors");
var dotenv = require("dotenv").config();

// Init Router
var router = express.Router();

// Init Model
var { siswaController, adminController } = require("./../controller/index");

// set header api
router.use(function (req, res, next) {
    res.setHeader("X-Powered-By", "Nabils24-Api");
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
router.post("/member/create", (req, res) => {
    var post = {
        name : req.body.nama,
        gender : req.body.kelamin,
        contact: req.body.kontak,
        address: req.body.alamat,
    }
    siswaController.store(post).then((result) => {
        res.status(200).send(result)
    })
});
// Read
router.get("/member/findAll", (req, res) => {
    siswaController.index().then((result) => {
        res.status(200).send(result)
    })
})
router.get("/member/findby", (req, res) => {
    if (req.query.id) {
        var id = req.query.id
        siswaController.showByid(id).then((result) => {
            res.status(200).send(result)
        })
    } else if (req.query.nama) {
        var nama = req.query.nama
        siswaController.showAllbyname(nama).then((result) => {
            res.status(200).send(result)
        })
    }

})
// Update
router.post("/member/update", (req, res) => {
    var post = {
        id: req.body.id,
        name : req.body.nama,
        gender : req.body.kelamin,
        contact: req.body.kontak,
        address: req.body.alamat,
    }
    siswaController.update(post).then((result) => {
        res.status(200).send(result)
    })
});
// Delete
router.delete("/member/delete", (req, res) => {
    var id =  req.body.id
    siswaController.destroy(id).then((result) => {
        res.status(200).send(result)
    })
});

// Api admin
// Create
router.post("/admin/create", (req, res) => {
    var post = {
        name : req.body.nama,
        contact: req.body.kontak,
        address: req.body.alamat,
        username : req.body.username,
        password : req.body.password,
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
        name : req.body.nama,
        contact: req.body.kontak,
        address: req.body.alamat,
        username : req.body.username,
        password : req.body.password,
    }
    adminController.update(post).then((result) => {
        res.status(200).send(result)
    })
});
// Delete
router.delete("/admin/delete", (req, res) => {
    var id =  req.body.id
    adminController.destroy(id).then((result) => {
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
