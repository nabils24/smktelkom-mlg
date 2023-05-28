<?php
session_start();
include 'db.php';
if ($_SESSION['status_login'] != true) {
    echo '<script>window.location="login.php"</script>';
}
$produk = mysqli_query($conn, "SELECT * FROM tb_product LEFT JOIN tb_category USING (id_category) ORDER BY id_product DESC");
$jumlahproduk = mysqli_num_rows($produk);
$siswa = mysqli_query($conn, "SELECT * FROM siswa ORDER BY id_siswa DESC");
$jumlahsiswa = mysqli_num_rows($siswa);
$kelas = mysqli_query($conn, "SELECT * FROM kelas ORDER BY id_kelas DESC");
$jumlahkelas = mysqli_num_rows($kelas);
?>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Admin - Tambah Buku</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="dashboard.php">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fas fa-laugh-wink"></i>
                </div>
                <div class="sidebar-brand-text mx-3">Admin Panel</sup></div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
                <a class="nav-link" href="dashboard.php">
                    <i class="fas fa-fw fa-tachometer-alt"></i>
                    <span>Dashboard</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
                CRUD
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <?php
            include 'component/sideitem_tambahdata.php';
            ?>

            <!-- Nav Item - Utilities Collapse Menu -->
            <?php
            include 'component/sideitem_editpages.php';
            ?>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>

            <!-- Sidebar Message -->
            

        </ul>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>


                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                        <li class="nav-item dropdown no-arrow d-sm-none">
                            <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-search fa-fw"></i>
                            </a>
                            <!-- Dropdown - Messages -->
                            <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                                aria-labelledby="searchDropdown">
                                <form class="form-inline mr-auto w-100 navbar-search">
                                    <div class="input-group">
                                        <input type="text" class="form-control bg-light border-0 small"
                                            placeholder="Search for..." aria-label="Search"
                                            aria-describedby="basic-addon2">
                                        <div class="input-group-append">
                                            <button class="btn btn-primary" type="button">
                                                <i class="fas fa-search fa-sm"></i>
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </li>

                        <div class="topbar-divider d-none d-sm-block"></div>

                        <!-- Nav Item - User Information -->
                        <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline text-gray-600 small"><?php echo $_SESSION['nama_admin'] ?></span>
                                <img class="img-profile rounded-circle" src="img/undraw_profile.svg">
                            </a>
                            <!-- Dropdown - User Information -->
                            <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Profile
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Settings
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Activity Log
                                </a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Logout
                                </a>
                            </div>
                        </li>

                    </ul>

                </nav>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Tambah Buku</h1>
                    </div>
                    <!-- Content Row -->
                    <div class="row">
                    <form class="user" method="POST" enctype="multipart/form-data">
                                <div class="form-group">
                                    <select class="form-select" name="kategori" required>
                                        <option value="">--- Pilih ---</option>
                                        <?php
                                            $kategori = mysqli_query($conn, "SELECT* FROM tb_category ORDER BY id_category DESC");
                                            while($r = mysqli_fetch_array($kategori)){
                                        ?>
                                        <option value="<?php echo $r['id_category']?>"><?php echo $r['name_category']?></option>
                                        <?php } ?>
                                    </select>
                                </div>
                                <div class="form-group">
                                        <input type="text" class="form-control" id="exampleFirstName"
                                            placeholder="Nama Buku" name="nama">
                                </div>
                                
                                <div class="form-group">
                                <div class="form-floating">
                                    <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 100px" name="desc" ></textarea>
                                    <label for="floatingTextarea2" >Deskripsi Buku</label>
                                </div>
                                </div>
                                <div class="form-group">
                                    <input type="number" class="form-control" id="exampleInputEmail"
                                        placeholder="harga Buku" name="harga">
                                </div>
                                <div class="form-group">
                                    <div class="mb-3">
                                        <input type="file" class="form-control" aria-label="file example" name="gambar" required>
                                        <div class="invalid-feedback">Wajib!</div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <select class="form-select" name="status">
                                        <option value="">--- Pilih ---</option>
                                        <option value="1">Aktif</option>
                                        <option value="0">Tidak Aktif</option>
                                    </select>
                                </div>
                                <input type="submit" name="submit" value="Submit" class="btn btn-primary btn-user">
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


                                    $newname = 'gambar'.time().'.'.$type2;
                                    // menampung data format file yang diizinkan
                                    $type_allowed = array('jpg', 'jpeg', 'png', 'gif');

                                    // validasi format file
                                    if(!in_array($type2, $type_allowed)){
                                        // jika format file tidak ada di dalam array
                                        echo '<script>alert("Format file tidak diizinkan")</script>';
                                    }else{
                                        // jika format file diizinkan 
                                        // proses uplad file + insertke database
                                        move_uploaded_file($tmp_name, './image_upload/'.$newname);

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
                                            echo '<script>window.location="dashboard.php"</script>';                        
                                            }else{
                                            echo 'gagal '.mysqli_error($conn);
                                        }
                                    }
                                }
                            ?>
                    </div>

                   

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->

            <!-- Footer -->
            <footer class="sticky-footer bg-white">
                <div class="container my-auto">
                    <div class="copyright text-center my-auto">
                        <span>Copyright &copy; Your Website 2021</span>
                    </div>
                </div>
            </footer>
            <!-- End of Footer -->

        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

    <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
        aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                <div class="modal-body">Apakah Kamu yakin ingin logout?</div>
                <div class="modal-footer">
                    <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                    <a class="btn btn-primary" href="logout.php">Logout</a>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="vendor/chart.js/Chart.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="js/demo/chart-area-demo.js"></script>
    <script src="js/demo/chart-pie-demo.js"></script>

</body>

</html>