<?php
    session_start();
    include 'db.php';
    if($_SESSION['status_login'] != true){
        echo '<script>window.location="login.php"</script>';
    }

    $kelas = mysqli_query($conn, "SELECT * FROM kelas WHERE id_kelas = '".$_GET['id']."'");
    if(mysqli_num_rows($kelas) == 0){
        echo '<script>window.location="data-kelas.php"</script>';

    }
    $k = mysqli_fetch_object($kelas);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TokoOnline</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
</head>
<body>
    <!-- Header -->
    <header>
        <div class="container">
            <h1><a href="dashboard.php">Perpustakaan</a></h1>
            <ul>
                <li><a href="dashboard.php">Dashboard</a></li>
                <li><a href="profil.php">Profil</a></li>
                <li><a href="data-kategori.php">Data Kategori</a></li>
                <li><a href="data-buku.php">Data Buku</a></li>
                <li><a href="data-kelas.php">Data Kelas</a></li>
                <li><a href="keluar.php">Keluar</a></li>

            </ul>
        </div>
    </header>
    <!-- Header End -->

    <!-- Content -->
    <div class="section">
        <div class="container">
            <h3>Edit Data Kategori</h3>
            <div class="box">
                <form action="" method="POST">
                    <input type="text" name="nama" placeholder="Nama Kelas" class="input-control" value="<?php echo $k->nama_kelas ?>" required>
                    <input type="text" name="kelompok" placeholder="Kelompok Kelas" class="input-control" value="<?php echo $k->kelompok ?>" required>     
                    <input type="submit" name="submit" value="Submit" class="btn">
                </form>
                <?php
                    if(isset($_POST['submit'])){
                        $nama_kelas = $_POST['nama'];
                        $kelompok = $_POST['kelompok'];
                        
                        $update = mysqli_query($conn, "UPDATE kelas SET 
                                                nama_kelas = '".$nama_kelas."'
                                                kelompok = '".$kelompok."'
                                                WHERE id_kelas = '".$k->id_kelas."'
                                                ");
                        if($update){
                            echo '<script>alert("Edit data berhasil")</script>';
                            echo '<script>window.location="data-kelas.php"</script>';
                        }else{
                            echo 'gagal' .mysqli_error($conn);
                        }
                    }
                ?>
            </div>
        </div>
    </div>
    <!-- Content End-->

    <!-- Footer -->
    <footer>
        <div class="container">
            <small>Copyright &copy; 2022</small>
        </div>
    </footer>
    <!-- Footer -->

</body>
</html>