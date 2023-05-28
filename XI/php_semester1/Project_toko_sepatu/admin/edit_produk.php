<?php
session_start();
include '../dbconnect.php';
include './component/data_website.php';

if (isset($_POST['addcategory'])) {
    $namakategori = $_POST['namakategori'];

    $tambahkat = mysqli_query($conn, "insert into kategori (namakategori) values ('$namakategori')");
    if ($tambahkat) {
        echo "
		<meta http-equiv='refresh' content='1; url= kategori.php'/>  ";
    } else {
        echo "
		 <meta http-equiv='refresh' content='1; url= kategori.php'/> ";
    }
};
$produk = mysqli_query($conn, "SELECT * FROM produk WHERE idproduk = '" . $_GET['id'] . "'");
if (mysqli_num_rows($produk) == 0) {
    echo '<script>window.location = "produk.php"</script>';
}
$p = mysqli_fetch_array($produk);
?>

<!doctype html>
<html class="no-js" lang="en">

<head>
    <meta charset="utf-8">
    <link rel="icon" type="image/png" href="../favicon.png">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Kelola Kategori - <?= $name ?></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" type="image/png" href="assets/images/icon/favicon.ico">
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/themify-icons.css">
    <link rel="stylesheet" href="assets/css/metisMenu.css">
    <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
    <link rel="stylesheet" href="assets/css/slicknav.min.css">

    <!-- amchart css -->
    <link rel="stylesheet" href="https://www.amcharts.com/lib/3/plugins/export/export.css" type="text/css" media="all" />
    <!-- Start datatable css -->
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/jquery.dataTables.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.jqueryui.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/1.5.2/css/buttons.dataTables.min.css">

    <!-- others css -->
    <link rel="stylesheet" href="assets/css/typography.css">
    <link rel="stylesheet" href="assets/css/default-css.css">
    <link rel="stylesheet" href="assets/css/styles.css">
    <link rel="stylesheet" href="assets/css/responsive.css">
    <!-- modernizr css -->
    <script src="assets/js/vendor/modernizr-2.8.3.min.js"></script>
</head>

<body>
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
    <!-- preloader area start -->
    <div id="preloader">
        <div class="loader"></div>
    </div>
    <!-- preloader area end -->
    <!-- page container area start -->
    <div class="page-container">
        <!-- sidebar menu area start -->
        <?php
        include './component/sidenavbar.php'
        ?>
        <!-- sidebar menu area end -->
        <!-- main content area start -->
        <div class="main-content">
            <!-- header area start -->
            <div class="header-area">
                <div class="row align-items-center">
                    <!-- nav and search button -->
                    <div class="col-md-6 col-sm-8 clearfix">
                        <div class="nav-btn pull-left">
                            <span></span>
                            <span></span>
                            <span></span>
                        </div>
                    </div>
                    <!-- profile info & task notification -->
                    <div class="col-md-6 col-sm-4 clearfix">
                        <ul class="notification-area pull-right">
                            <li>
                                <h3>
                                    <div class="date">
                                        <script type='text/javascript'>
                                            var months = ['Januari', 'Februari', 'Maret', 'April', 'Mei', 'Juni', 'Juli', 'Agustus', 'September', 'Oktober', 'November', 'Desember'];
                                            var myDays = ['Minggu', 'Senin', 'Selasa', 'Rabu', 'Kamis', 'Jumat', 'Sabtu'];
                                            var date = new Date();
                                            var day = date.getDate();
                                            var month = date.getMonth();
                                            var thisDay = date.getDay(),
                                                thisDay = myDays[thisDay];
                                            var yy = date.getYear();
                                            var year = (yy < 1000) ? yy + 1900 : yy;
                                            document.write(thisDay + ', ' + day + ' ' + months[month] + ' ' + year);
                                            //-->
                                        </script></b>
                                    </div>
                                </h3>

                            </li>
                        </ul>
                    </div>
                </div>
            </div>


            <!-- page title area end -->
            <div class="main-content-inner">

                <!-- market value area start -->
                <div class="row mt-5 mb-5">
                    <div class="col-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="d-sm-flex justify-content-between align-items-center mb-3">
                                    <h2>Edit Produk</h2>
                                </div>

                                <form class="user" method="POST" enctype="multipart/form-data">
                                    <div class="form-group">
                                        <select class="form-select" name="kategori" required>
                                            <option value="">--- Kategori ---</option>
                                            <?php
                                            $kategori = mysqli_query($conn, "SELECT* FROM kategori ORDER BY idkategori DESC");
                                            while ($r = mysqli_fetch_array($kategori)) {
                                            ?>
                                                <option value="<?php echo $r['idkategori'] ?>"><?php echo $r['namakategori'] ?></option>
                                            <?php } ?>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" id="exampleFirstName" placeholder="Nama Sepatu" name="nama_produk" value="<?php echo $p['namaproduk'] ?>">
                                    </div>
                                    <div class="form-group">
                                        <div class="form-floating">
                                            <textarea class="form-control" placeholder="Deskripsi Sepatu" id="floatingTextarea2" style="height: 100px" name="desc_produk"><?php echo $p['deskripsi'] ?></textarea>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" id="exampleFirstName" placeholder="rate sepatu" name="rate_produk" value="<?php echo $p['rate'] ?>">
                                    </div>

                                    <div class="form-group">
                                        <input type="number" class="form-control" id="exampleFirstName" placeholder="Harga Awal" name="awal" value="<?php echo $p['hargabefore'] ?>">
                                    </div>
                                    <div class="form-group">
                                        <input type="number" class="form-control" id="exampleFirstName" placeholder="Harga Akhir" name="akhir" value="<?php echo $p['hargaafter'] ?>">
                                    </div>
                                    <img src="../<?php echo $p['gambar'] ?>" alt="sedang memperoses" class="img-thumbnail" width="170px" height="auto">
                                    <div class="form-group">
                                        <input type="file" class="form-control" id="exampleFirstName" placeholder="foto siswa" name="gambar" value="../<?php echo $p['gambar'] ?>">
                                    </div>

                                    <input type="submit" name="submit" value="Submit" class="btn btn-primary btn-user">
                                </form>
                                <?php
                                if (isset($_POST['submit'])) {
                                    $namaproduk = $_POST['nama_produk'];
                                    $deskripsi = $_POST['desc_produk'];
                                    $rate = $_POST['rate_produk'];
                                    $hargabefore = $_POST['awal'];
                                    $hargaafter = $_POST['akhir'];
                                    $kategori = $_POST['kategori'];
                                    $gambar = $_FILES['gambar']['name'];
                                    $tmp = $_FILES['gambar']['tmp_name'];
                                    $fotobaru = "produk/" . date('dmYHis') . $gambar;
                                    $path = "../" . $fotobaru;
                                    if (move_uploaded_file($tmp, $path)) {
                                        $query = "UPDATE produk SET namaproduk='$namaproduk', deskripsi='$deskripsi', rate='$rate', hargabefore='$hargabefore', hargaafter='$hargaafter', gambar='$fotobaru', idkategori='$kategori' WHERE idproduk = '" . $_GET['id'] . "'";
                                        $sql = mysqli_query($conn, $query);
                                        if ($sql) {
                                            echo '<script>alert("Berhasil mengubah data."); document.location="produk.php";</script>';
                                        } else {
                                            echo '<div class="alert alert-warning">Gagal melakukan proses edit data.</div>';
                                        }
                                    } else {
                                        echo '<div class="alert alert-warning">Gagal melakukan proses upload gambar.</div>';
                                    }
                                }
                                ?>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>


    <!-- row area start-->
    </div>
    </div>
    <!-- main content area end -->
    <!-- footer area start-->
    <?php
    include './component/footer.php'
    ?>
    <!-- footer area end-->
    </div>
    <!-- page container area end -->
    <!-- Modal Delete -->
    <div id="myModal_delete" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Hapus Kategori</h4>
                </div>
                <div class="modal-body">
                    <form method="post">
                        <div class="form-group">
                            <label>Nama Kategori</label>
                            <input name="namakategori" type="text" class="form-control" required autofocus>
                        </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Batal</button>
                    <input name="addcategory" type="submit" class="btn btn-primary" value="Tambah">
                </div>
                </form>
            </div>
        </div>
    </div>
    <!-- modal -->


    <!-- modal input -->
    <div id="myModal" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Tambah Kategori</h4>
                </div>
                <div class="modal-body">
                    <form method="post">
                        <div class="form-group">
                            <label>Nama Kategori</label>
                            <input name="namakategori" type="text" class="form-control" required autofocus>
                        </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Batal</button>
                    <input name="addcategory" type="submit" class="btn btn-primary" value="Tambah">
                </div>
                </form>
            </div>
        </div>
    </div>

    <script>
        $(document).ready(function() {
            $('#dataTable3').DataTable({
                dom: 'Bfrtip',
                buttons: [
                    'print'
                ]
            });
        });
    </script>

    <!-- jquery latest version -->
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
    <!-- bootstrap 4 js -->
    <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/owl.carousel.min.js"></script>
    <script src="assets/js/metisMenu.min.js"></script>
    <script src="assets/js/jquery.slimscroll.min.js"></script>
    <script src="assets/js/jquery.slicknav.min.js"></script>
    <!-- Start datatable js -->
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.print.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.js"></script>
    <script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js"></script>
    <script src="https://cdn.datatables.net/responsive/2.2.3/js/dataTables.responsive.min.js"></script>
    <script src="https://cdn.datatables.net/responsive/2.2.3/js/responsive.bootstrap.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js"></script>
    <!-- start chart js -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.2/Chart.min.js"></script>
    <!-- start highcharts js -->
    <script src="https://code.highcharts.com/highcharts.js"></script>
    <!-- start zingchart js -->
    <script src="https://cdn.zingchart.com/zingchart.min.js"></script>
    <script>
        zingchart.MODULESDIR = "https://cdn.zingchart.com/modules/";
        ZC.LICENSE = ["569d52cefae586f634c54f86dc99e6a9", "ee6b7db5b51705a13dc2339db3edaf6d"];
    </script>
    <!-- all line chart activation -->
    <script src="assets/js/line-chart.js"></script>
    <!-- all pie chart -->
    <script src="assets/js/pie-chart.js"></script>
    <!-- others plugins -->
    <script src="assets/js/plugins.js"></script>
    <script src="assets/js/scripts.js"></script>

</body>

</html>