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
            <h3>Data Buku</h3>
            <div class="box">
                <p><a href="tambah-buku.php">Tambah Data</a></p>
                <table border="1" cellspacing="0" class="table">
                    <thead>
                        <tr>
                            <th width="60px">No</th>
                            <th>Kategori</th>
                            <th>Nama Buku</th>
                            <th>Harga</th>
                            <th>Deskripsi</th>
                            <th>Gambar</th>
                            <th>Status</th>

                            <th width="150px">Aksi</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php
                            $no = 1;
                            $produk = mysqli_query($conn, "SELECT * FROM tb_product LEFT JOIN tb_category USING (id_category) ORDER BY id_product DESC");
                            if(mysqli_num_rows($produk) >0){
                            while($row = mysqli_fetch_array($produk)){
                        ?>
                        <tr>
                            <td><?php echo $no++?></td>
                            <td><?php echo $row['name_category']?></td>
                            <td><?php echo $row['name_product']?></td>
                            <td>Rp. <?php echo number_format($row['price_product']) ?></td>
                            <td><?php echo $row['description_product']?></td>
                            <td><img src="produk/<?php echo $row['image_product'] ?>" width="60px"></td>
                            <td><?php echo ($row['status_product'] == 0)? 'Tidak Aktif':'Aktif'; ?></td>
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