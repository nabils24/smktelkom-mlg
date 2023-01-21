<?php
include 'dbconnect.php';
$idorder = $_GET['id'];

$konfirmasi = mysqli_query($conn, "UPDATE detailorder set status ='Sampai' where orderid='$idorder'");
$konfirmasi2 = mysqli_query($conn, "UPDATE cart set status ='Sampai' where orderid='$idorder'");

if ($konfirmasi && $konfirmasi2) {
    echo ' <div class="alert alert-success">
			<center>Pesanan sudah sampai</center>
		  </div>
		<meta http-equiv="refresh" content="2"; url="order.php?id=<?php=' . $idorder . ' ?>/>"';
} else {
}
