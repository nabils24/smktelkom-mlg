<?php

// isi nama host, username mysql, dan password mysql anda
$conn = mysqli_connect("localhost", "root", "", "db_tokosepatu");
// apa gunanya mysqli_connect? untuk menghubungkan database dengan php dan mengambil data dari database yang nantinya akan ditampilkan ke dalam bentuk tabel

if (!$conn) {
	echo "gagal koneksi db";
}
else {


}
;

?>