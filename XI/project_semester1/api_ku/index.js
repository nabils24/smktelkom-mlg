import express from "express";
import fs from "fs";

const app = express();
const port = 3000;

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});

app.get("/", (req, res) => {
  // send a response api status 200 and msg "Hello World" for json format
  res.status(200).json({ response: 200, msg: "Error Parameter Not Found" });
});

app.get("/api", (req, res) => {
  // send a response api status 200 and msg "Hello World" for json format
  res.status(200).json({ response: 200, msg: "Error Parameter Not Found" });
});

app.get("/api/me", (req, res) => {
  res.status(200).json({
    response: 200,
    msg: "Success",
    data: {
      name: "Nabil Sahsada Suratno",
      email: "nabilsahsadacode@gmail.com",
      phone: "085930258437",
      skils: "PHP,JS,Framework PHP/JS",
    },
    social: {
      facebook: "https://www.facebook.com/nabilsahsada",
      instagram: "https://www.instagram.com/nabilss24",
      github: "https://github.com/nabils24",
    },
  });
});

app.get("/api/datasiakad/:nama", (req, res) => {
  // get datas from file datasiakad.json using readfile fs and matching with parameters Nama with datas NAMA and return in format json
  fs.readFile("datasiakad.json", "utf8", (err, data) => {
    if (err) {
      res.status(400).json({ response: 400, msg: "Error Parameter Not Found" });
    } else {
      const datas = JSON.parse(data);
      const result = datas.filter((data) => {
        if (data.NAMA === req.params.nama) {
          return data;
        }
      });
      res.status(200).json({ response: 200, msg: "Success", data: result });
    }
  });
});
