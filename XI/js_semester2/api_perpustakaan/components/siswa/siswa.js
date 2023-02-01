// Init Path
__path = process.cwd();
// End Init Path

// Init Var Express JS, Cors, Secure, Request, Axios, Dotenv, Fs
var express = require("express");
var secure = require("ssl-express-www");
var cors = require("cors");
var request = require("request");
var axios = require("axios");
var fetch = require("node-fetch");
var dotenv = require("dotenv").config();
var fs = require("fs");

// Init Router
var router = express.Router();

// init controller



//router
router.get("/", function (req, res) {
  res.send("API Siswa");
});

router.post("/", function (req, res) {

});

router.delete("/:id", function(req, res){

});
