<?php
session_start();
include 'db.php';
if ($_SESSION['status_login'] != true) {
    echo '<script>window.location="login.php"</script>';
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Perpustakaan</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
    <script src="https://cdn.ckeditor.com/4.19.1/standard/ckeditor.js"></script>
</head>

<body>
    <!-- Header -->
    <?php
include 'component/header.php';
?>
    <!-- Header End -->

    <!-- Content -->
    <div class="section">
        <div class="container">
            <h3>Tambah Data Kelas</h3>
            <div class="box">
                <form action="" method="POST" enctype="multipart/form-data">
                    <input type="text" name="nama" class="input-control" placeholder="Nama Kelas" required>
                    <input type="text" name="kelompok" class="input-control" placeholder="Kelompok kelas" required>
                    <input type="submit" name="submit" value="Submit" class="btn">
                </form>
                <?php
if (isset($_POST['submit'])) {
    // print_r($_FILES['gambar']);
    // menampung liputan dari form
    $idkelas = "";
    $nama_kelas = $_POST['nama'];
    $kelompok = $_POST['kelompok'];


    $insert = mysqli_query($conn, "INSERT INTO kelas VALUES ('','$nama_kelas','$kelompok')");

    if ($insert) {
        echo '<script>alert("Tambah data berhasil")</script>';
        echo '<script>window.location = "data-kelas.php"</script>';
    }
    else {
        echo 'gagal ' . mysqli_error($conn);
    }
}

?>
            </div>
        </div>
    </div>
    <!-- Content End-->

    <!-- Footer -->
    <?php
include 'component/footer.php';
?>
    <!-- Footer -->
    <script>
        CKEDITOR.replace('desc');
    </script>
</body>

</html>