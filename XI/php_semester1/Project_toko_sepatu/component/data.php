<?php

include 'dbconnect.php';
$detail_website1 = mysqli_query($conn, "select * from detail_website");
$hasil_detail_website = mysqli_fetch_array($detail_website1);
$name = $hasil_detail_website['name'];
$alamat = $hasil_detail_website['alamat'];
$emailwebsite = $hasil_detail_website['email'];
$telp = $hasil_detail_website['telp'];
?>