<?php
include '../dbconnect.php';

if (isset($_GET['idk'])) {
    $delete = mysqli_query($conn, "DELETE FROM kategori WHERE idkategori = '" . $_GET['idk'] . "'");
    echo '<script>window.location="data-kategori.php"</script>';

}

if (isset($_GET['idp'])) {
    $produk = mysqli_query($conn, "SELECT gambar FROM produk WHERE idproduk = '" . $_GET['idp'] . "' ");
    $p = mysqli_fetch_object($produk);

    unlink('../' . $p->gambar);

    $delete = mysqli_query($conn, "DELETE FROM produk WHERE idproduk = '" . $_GET['idp'] . "' ");
    echo '<script>window.location = "produk.php"</script>';
}
if (isset($_GET['idpem'])) {
    $delete = mysqli_query($conn, "DELETE FROM pembayaran WHERE no = '" . $_GET['idpem'] . "'");
    echo '<script>window.location = "pembayaran.php"</script>';

}
?>