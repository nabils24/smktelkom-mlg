<?php
session_start();
include 'dbconnect.php';
include './component/data.php';

$idproduk = $_GET['idproduk'];

if (isset($_POST['addprod'])) {
	// cek user sudah login apa belum, kalau belum akan diarahkan ke file login.php
	if (!isset($_SESSION['log'])) {
		header('location:login.php');
	} else {
		// variable UI = user id
		$ui = $_SESSION['id'];
		$cek = mysqli_query($conn, "select * from cart where userid='$ui' and status='Cart'");
		// Variable cek berguna untuk mengecek dari table cart dengan userid dari $ui dan statusnya adalah Cart
		$liat = mysqli_num_rows($cek);
		// $liat adalah variable untuk mengecek jumlah baris dari $cek
		$f = mysqli_fetch_array($cek);
		// $f adalah variable untuk menampung data menjadi array dari $cek
		@$orid = $f['orderid'];
		// $orid adalah variable untuk menampung data dari $f dengan index orderid

		//mengecek apakah $liat lebih dari 0 atau tidak jika 1 maka hasil TRUE jika 0 maka hasil FALSE
		if ($liat > 0) {


			$cekbrg = mysqli_query($conn, "select * from detailorder where idproduk='$idproduk' and orderid='$orid'");
			//$cekbrg berguna mengecek apakah produk yang di add ke cart sudah ada di cart atau belum
			$liatlg = mysqli_num_rows($cekbrg);
			// $liatlg adalah variable untuk mengecek jumlah baris dari $cekbrg
			$brpbanyak = mysqli_fetch_array($cekbrg);
			// $brpbanyak adalah variable untuk menampung data menjadi array dari $cekbrg
			@$jmlh = $brpbanyak['qty'];
			// $jmlh adalah variable untuk menampung data dari $brpbanyak dengan index qty

			//mengecek apakah $liatlg lebih dari 0 atau tidak jika 1 maka hasil TRUE jika 0 maka hasil FALSE
			if ($liatlg > 0) {
				$i = 1;
				$baru = $jmlh + $i;

				$updateaja = mysqli_query($conn, "update detailorder set qty='$baru' where orderid='$orid' and idproduk='$idproduk'");
				// $updateaja adalah variable untuk mengupdate data dari table detailorder dengan qty dari $baru dan orderid dari $orid dan idproduk dari $idproduk

				//mengecek apakah $updateaja lebih dari 0 atau tidak jika 1 maka hasil TRUE jika 0 maka hasil FALSE
				if ($updateaja) {
					echo " <div class='alert alert-success'>
								Barang sudah pernah dimasukkan ke keranjang, jumlah akan ditambahkan
							  </div>
							  <meta http-equiv='refresh' content='1; url= product.php?idproduk=" . $idproduk . "'/>";
				} else {
					echo "<div class='alert alert-warning'>
								Gagal menambahkan ke keranjang
							  </div>
							  <meta http-equiv='refresh' content='1; url= product.php?idproduk=" . $idproduk . "'/>";
				}
			} else {
				// jika produk belum ada di cart maka akan di insert ke table detailorder

				$tambahdata = mysqli_query($conn, "insert into detailorder (orderid,idproduk,qty) values('$orid','$idproduk','1')");
				// $tambahdata adalah variable untuk menambahkan data ke table detailorder dengan orderid dari $orid, idproduk dari $idproduk dan qty 1
				if ($tambahdata) {
					echo " <div class='alert alert-success'>
								Berhasil menambahkan ke keranjang
							  </div>
							<meta http-equiv='refresh' content='1; url= product.php?idproduk=" . $idproduk . "'/>  ";
				} else {
					echo "<div class='alert alert-warning'>
								Gagal menambahkan ke keranjang
							  </div>
							 <meta http-equiv='refresh' content='1; url= product.php?idproduk=" . $idproduk . "'/> ";
				}
			};
		} else {

			// jika cart kosong maka akan di insert ke table cart dan detailorder
			$oi = crypt(rand(22, 999), time());
			// $oi adalah variable untuk menampung data dari fungsi crypt dengan parameter rand(22,999) dan time() dan dijadikan Order ID/Kode ID

			$bikincart = mysqli_query($conn, "insert into cart (orderid, userid) values('$oi','$ui')");
			// $bikincart adalah variable untuk menambahkan data ke table cart dengan orderid dari $oi dan userid dari $ui

			// mengecek apakah $bikincart lebih dari 0 atau tidak jika 1 maka hasil TRUE jika 0 maka hasil FALSE
			if ($bikincart) {
				$tambahuser = mysqli_query($conn, "insert into detailorder (orderid,idproduk,qty) values('$oi','$idproduk','1')");
				if ($tambahuser) {
					echo " <div class='alert alert-success'>
								Berhasil menambahkan ke keranjang
							  </div>
							<meta http-equiv='refresh' content='1; url= product.php?idproduk=" . $idproduk . "'/>  ";
				} else {
					echo "<div class='alert alert-warning'>
								Gagal menambahkan ke keranjang
							  </div>
							 <meta http-equiv='refresh' content='1; url= product.php?idproduk=" . $idproduk . "'/> ";
				}
			} else {
				echo "gagal bikin cart";
			}
		}
	}
};
?>

<!DOCTYPE html>
<html>

<head>
	<title><?php echo $name ?> - Produk</title>
	<!-- for-mobile-apps -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Tokopekita, Richard's Lab" />
	<script type="application/x-javascript">
		addEventListener("load", function() {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- //for-mobile-apps -->
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<!-- font-awesome icons -->
	<link href="css/font-awesome.css" rel="stylesheet">
	<!-- //font-awesome icons -->
	<!-- js -->
	<script src="js/jquery-1.11.1.min.js"></script>
	<!-- //js -->
	<link href='//fonts.googleapis.com/css?family=Raleway:400,100,100italic,200,200italic,300,400italic,500,500italic,600,600italic,700,700italic,800,800italic,900,900italic' rel='stylesheet' type='text/css'>
	<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
	<!-- start-smoth-scrolling -->
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();
				$('html,body').animate({
					scrollTop: $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- start-smoth-scrolling -->
</head>

<body>
	<!-- header -->
	<?php
	include "./component/header.php";
	?>
	<!-- //header -->

	<!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
				<li><a href="index.php"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active"><?php
									$p = mysqli_fetch_array(mysqli_query($conn, "Select * from produk where idproduk='$idproduk'"));
									echo $p['namaproduk'];
									?></li>
			</ol>
		</div>
	</div>
	<!-- //breadcrumbs -->
	<div class="products">
		<div class="container">
			<div class="agileinfo_single">

				<div class="col-md-4 agileinfo_single_left">
					<img id="example" src="<?php echo $p['gambar'] ?>" alt=" " class="img-responsive">
				</div>
				<div class="col-md-8 agileinfo_single_right">
					<h2><?php echo $p['namaproduk'] ?></h2>
					<div class="rating1">
						<span class="starRating">
							<?php
							$bintang = '<i class="fa fa-star blue-star" aria-hidden="true"></i>';
							$rate = $p['rate'];

							for ($n = 1; $n <= $rate; $n++) {
								echo '<i class="fa fa-star blue-star" aria-hidden="true"></i>';
							};
							?>
						</span>
					</div>
					<div class="w3agile_description">
						<h4>Deskripsi :</h4>
						<p><?php echo $p['deskripsi'] ?></p>
					</div>
					<div class="snipcart-item block">
						<div class="snipcart-thumb agileinfo_single_right_snipcart">
							<h4 class="m-sing">Rp<?php echo number_format($p['hargaafter']) ?> <span>Rp<?php echo number_format($p['hargabefore']) ?></span></h4>
						</div>
						<div class="snipcart-details agileinfo_single_right_details">
							<form action="#" method="post">
								<fieldset>
									<input type="hidden" name="idprod" value="<?php echo $idproduk ?>">
									<input type="submit" name="addprod" value="Add to cart" class="button">
								</fieldset>
							</form>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>

	<!-- //footer -->
	<?php
	include "./component/footer.php";
	?>
	<!-- //footer -->
	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- top-header and slider -->
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {

			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 4000,
				easingType: 'linear'
			};


			$().UItoTop({
				easingType: 'easeOutQuart'
			});

		});
	</script>
	<!-- //here ends scrolling icon -->

	<!-- main slider-banner -->
	<script src="js/skdslider.min.js"></script>
	<link href="css/skdslider.css" rel="stylesheet">
	<script type="text/javascript">
		jQuery(document).ready(function() {
			jQuery('#demo1').skdslider({
				'delay': 5000,
				'animationSpeed': 2000,
				'showNextPrev': true,
				'showPlayButton': true,
				'autoSlide': true,
				'animationType': 'fading'
			});

			jQuery('#responsive').change(function() {
				$('#responsive_wrapper').width(jQuery(this).val());
			});

		});
	</script>
	<!-- //main slider-banner -->
</body>

</html>