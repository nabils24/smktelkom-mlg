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
            <h3>Tambah Data Produk</h3>
            <div class="box">
                <form action="" method="POST" enctype="multipart/form-data">
                    <select class="input-control" name="kategori" required>
                        <option value="">--- Pilih ---</option>
                        <?php
                            $kategori = mysqli_query($conn, "SELECT* FROM tb_category ORDER BY id_category DESC");
                            while($r = mysqli_fetch_array($kategori)){
                        ?>
                        <option value="<?php echo $r['id_category']?>"><?php echo $r['name_category']?></option>
                        <?php } ?>
                    </select>

                    <input type="text" name="nama" class="input-control" placeholder="Nama Produk" required>
                    <input type="text" name="harga" class="input-control" placeholder="Harga" required>
                    <input type="file" name="gambar" class="input-control" required>
                    <textarea class="input-control" name="desc" placeholder="Deskripsi Produk"></textarea><br>
                    <select class="input-control" name="status">
                        <option value="">--- Pilih ---</option>
                        <option value="1">Aktif</option>
                        <option value="0">Tidak Aktif</option>
                    </select>
                    <input type="submit" name="submit" value="Submit" class="btn">
                </form>
                <?php
                    if(isset($_POST['submit'])){
                        // print_r($_FILES['gambar']);
                        // menampung liputan dari form 
                        $kategori  = $_POST['kategori'];
                        $nama      = $_POST['nama'];
                        $harga     = $_POST['harga'];
                        $deskripsi = $_POST['desc'];
                        $status    = $_POST['status'];


                        // menampung data file yang diupload
                        $filename = $_FILES['gambar']['name'];
                        $tmp_name = $_FILES['gambar']['tmp_name'];

                        $type1 = explode('.', $filename);
                        $type2 = $type1[1];


                        $newname = 'produk'.time().'.'.$type2;
                        // menampung data format file yang diizinkan
                        $type_allowed = array('jpg', 'jpeg', 'png', 'gif');

                        // validasi format file
                        if(!in_array($type2, $type_allowed)){
                            // jika format file tidak ada di dalam array
                            echo '<script>alert("Format file tidak diizinkan")</script>';
                        }else{
                            // jika format file diizinkan 
                            // proses uplad file + insertke database
                            move_uploaded_file($tmp_name, './produk/'.$newname);

                            $insert = mysqli_query($conn, "INSERT INTO tb_product VALUES (
                                        null,
                                        '".$kategori."',
                                        '".$nama."',
                                        '".$harga."',
                                        '".$deskripsi."',
                                        '".$newname."',
                                        '".$status."',
                                        null
                                            )");

                            if($insert){
                                echo '<script>alert("Tambah data berhasil")</script>';
                                echo '<script>window.location="data-buku.php"</script>';                        
                                }else{
                                echo 'gagal '.mysqli_error($conn);
                            }
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
         CKEDITOR.replace( 'desc' );
    </script>
</body>
</html>