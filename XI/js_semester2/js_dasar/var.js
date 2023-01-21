// cara lama dalam pendeklarasian
let nama = 'Nabil'
let umur = '17'
let tb = '168'
let bb = '69'
let status_menikah = false
const port = 24

// perbedaan pendeklarasian ini cara simple
let siswa = {
    nis: "134",
    namaa: "Nabil Sahsada Suratno  "
}

let siswa1 = {
    nama: 'Nabil',
    kelas: 'XIRPL7',
    bb: 61,
    tb: 171
}

// array string
let jurusan = ["rpl", "tkj"]

// array numeric 
let kelas = [10, 11, 12]

// array object
let siswa2 = [
    {
        nama: 'Abi',
        kelas: 'XIRPL7'
    },
    {
        nama: 'Nabil',
        kelas: 'XIRPL7'
    }
]

// tambah array
function tambah() {
    jurusan.push("mm")
    kelas.push(13)
    siswa2.push({
        nama: 'Ipan',
        kelas: 'XIRPL7'
    })
}

// hapus array
function hapus() {

    siswa2.splice(0, 1)
}


// nampilkan array
function tampildata() {
    console.log(jurusan)
    console.log(kelas)
    console.log(siswa2)
}

function mappingSiswa() {
    siswa2.map((item, index) => {
        console.log("Nama : " + item.nama)
        console.log("Kelas : " + item.kelas)
    })
}

let skorp1 = 0
let skorp2 = 0
function rps() {
    let icon = [
        batu = "✊🏼",//0
        gunting = "✌🏼",//1
        kertas = "🖐🏼"//2
    ]

    // Deklarasi DOM
    let player1 = document.getElementById("p1").value
    let player2 = document.getElementById("p2").value
    let skor = document.getElementById("skor").value

    // Deklarasi skor,pemenang
    let pemenang = ""

    if (player1 == icon[0] && player2 == icon[1]) {
        pemenang = "Player 1 Menang!"
    } else if (player1 == icon[0] && player2 == icon[2]) {
        pemenang = "Player 2 Menang!"
    } else if (player1 == icon[1] && player2 == icon[0]) {
        pemenang = "Player 2 Menang!"
    } else if (player1 == icon[1] && player2 == icon[2]) {
        pemenang = "Player 1 Menang!"
    } else if (player1 == icon[2] && player2 == icon[0]) {
        pemenang = "Player 1 Menang!"
    } else if (player1 == icon[2] && player2 == icon[1]) {
        pemenang = "Player 2 Menang!"
    } else if (player1 == player2) {
        pemenang = "Seri!"
    } else {
        pemenang = "Input Salah!"
    }

    //cek skor
    if (pemenang == "Player 1 Menang!") {
        skorp1++;
    } else if (pemenang == "Player 2 Menang!") {
        skorp2++;
    } else if (pemenang == "Seri!") {
        skorp1
        skorp2
    }



    console.log(pemenang)
    document.getElementById("skor").innerHTML = skorp1 + " : " + skorp2
    document.getElementById("pemenang").innerHTML = pemenang

}









