<?php
    session_start();
    include 'db.php';
    if($_SESSION['status_login'] != true){
        echo '<script>window.location="login.php"</script>';
    }

    $query = mysqli_query($conn, "SELECT * FROM tb_admin WHERE id_admin = '".$_SESSION['id']."'");
    $d = mysqli_fetch_object($query);
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
            <h3>Profil</h3>
            <div class="box">
                <form action="" method="POST">
                    <input type="text" name="nama" placeholder="Nama Lengkap" class="input-control" value="<?php echo $d->nama_siswa ?>" required>
                    <input type="text" name="user" placeholder="Username" class="input-control" value="<?php echo $d->username ?>" required>
                    <input type="text" name="nohp" placeholder="No HP" class="input-control" value="<?php echo $d->telp_siswa ?>" required>
                    <input type="text" name="email" placeholder="Email" class="input-control" value="<?php echo $d->email_siswa ?>" required>
                    <input type="text" name="alamat" placeholder="Alamat" class="input-control" value="<?php echo $d->alamat_siswa ?>" required>
                    <input type="submit" name="submit" value="Ubah Profil" class="btn">
                </form>
                <?php
                    if(isset($_POST['submit'])){

                       $nama   = ucwords($_POST['nama']);
                       $user   = $_POST['user']; 
                       $nohp   = $_POST['hp']; 
                       $email  = $_POST['email']; 
                       $alamat = ucwords($_POST['alamat']); 
 
                       $update = mysqli_query($conn, "UPDATE tb_admin SET
                                        admin_name = '".$name."',
                                        username = '".$user."',
                                        telp_admin = '".$nohp."',
                                        email_admin = '".$email."',
                                        alamat_admin = '".$alamat."' 
                                        WHERE id_admin = '".$d->id_admin."'");

                        if($update){
                            echo '<script>alert(Ubah data berhasil)</script>';
                            echo '<script>window.location="profil.php"</script>';
                        }else{
                            echo 'gagal '.mysqli_error($conn);
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