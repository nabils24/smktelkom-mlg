<?php
    session_start();
    include 'db.php';
    if($_SESSION['status_login'] != true){
        echo '<script>window.location="login.php"</script>';
    }
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
            <h3>Data Kelas</h3>
            <div class="box">
                <p><a href="tambah-kelas.php">Tambah Data</a></p>
                <table border="1" cellspacing="0" class="table">
                    <thead>
                        <tr>
                            <th width="60px">No</th>
                            <th>Nama Kelas</th>
                            <th>Nama Kelompok</th>
                            <th width="150px">Aksi</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php
                            $no = 1;
                            $kelas= mysqli_query($conn, "SELECT * FROM kelas ORDER BY id_kelas");
                            if(mysqli_num_rows($kelas) >0){
                            while($row = mysqli_fetch_array($kelas)){
                        ?>
                        <tr>
                            
                            <td><?php echo $row['id_kelas']?></td>
                            <td><?php echo $row['nama_kelas']?></td>
                            <td><?php echo $row['kelompok']?></td>
                            <td>
                            <a href="edit-kelas.php?id=<?php echo $row['id_kelas'] ?>">Edit</a> || <a href="
                                proses-hapus.php?idc=<?php echo $row['id_kelas'] ?>" onclick="return confirm('Ingin hapus data ini?')">Hapus</a>
                            </td>
                        </tr>
                        <?php }}else{ ?>
                            <tr>
                                <td colspan="8">Tidak ada data</td>
                            </tr>
                        <?php } ?>
                    </tbody>
                </table>
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