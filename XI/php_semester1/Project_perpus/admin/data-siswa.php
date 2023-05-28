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
    <title>Perpustakaan</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
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
            <h3>Produk</h3>
            <div class="box">
                <p><a href="tambah-buku.php">Tambah Data</a></p>
                <table border="1" cellspacing="0" class="table">
                    <thead>
                        <tr>
                            <th width="60px">No</th>
                            <th>Nama Siswa</th>
                            <th>Tanggal lahir siswa</th>
                            <th>Alamat siswa</th>
                            <th>Username</th>
                            <th>Password</th>
                            <th>id kelas</th>

                            <th width="150px">Aksi</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php
                            $no = 1;
                            $siswa = mysqli_query($conn, "SELECT * FROM siswa ORDER BY id_siswa DESC");
                            if(mysqli_num_rows($siswa) >0){
                            while($row = mysqli_fetch_array($siswa)){
                        ?>
                        <tr>
                            <td><?php echo $no++ ?></td>
                            <td><?php echo $row['nama_siswa']?></td>
                            <td><?php echo $row['tgl_lahir_siswa']?></td>
                            <td><?php echo $row['alamat_siswa']?></td>
                            <td><?php echo $row['username']?></td>
                            <td><?php echo $row['password']?></td>
                            <td><?php echo $row['id_kelas']?></td>
                            <td>
                            <a href="edit-buku.php?id=<?php echo $row['id_product'] ?>">Edit</a> || <a href="
                                proses-hapus.php?idp=<?php echo $row['id_product'] ?>" onclick="return confirm('Ingin hapus data ini?')">Hapus</a>
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
    <?php
    include 'component/footer.php';
    ?>
    <!-- Footer -->

</body>
</html>