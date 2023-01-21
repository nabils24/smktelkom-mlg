<?php
session_start();
include './component/data.php';
if (!isset($_SESSION['log'])) {
	header('location:login.php');
} else {
};

$idorder = $_GET['id'];

include 'dbconnect.php';

if (isset($_POST['confirm'])) {

	$userid = $_SESSION['id'];
	$veriforderid = mysqli_query($conn, "select * from cart where orderid='$idorder'");
	$fetch = mysqli_fetch_array($veriforderid);
	$liat = mysqli_num_rows($veriforderid);

	if ($fetch > 0) {
		$nama = $_POST['nama'];
		$metode = $_POST['metode'];
		$tanggal = $_POST['tanggal'];

		$foto = $_FILES['gambar']['name'];
		$tmp = $_FILES['gambar']['tmp_name'];
		$fotobaru = date('dmYHis') . $foto;
		$path = "bukti/" . $fotobaru;

		if (move_uploaded_file($tmp, $path)) {

			$kon = mysqli_query($conn, "insert into konfirmasi (orderid, userid, payment, namarekening, tglbayar, foto) 
			values('$idorder','$userid','$metode','$nama','$tanggal', '$fotobaru')");

			if ($kon) {

				$up = mysqli_query($conn, "update cart set status='Confirmed' where orderid='$idorder'");
				$up1 = mysqli_query($conn, "update detailorder set status='Confirmed' where orderid='$idorder'");

				echo " <div class='alert alert-success'>
				Terima kasih telah melakukan konfirmasi, team kami akan melakukan verifikasi.
				Informasi selanjutnya akan dikirim via Email
			  </div>
			<meta http-equiv='refresh' content='3; url= index.php'/>  ";
			} else {
				echo "<div class='alert alert-warning'>
				Gagal Submit, silakan ulangi lagi.
			  </div>
			 <meta http-equiv='refresh' content='3; url= konfirmasi.php'/> ";
			}
		} else {
			echo "<div class='alert alert-warning'>
				Gagal Submit, silakan ulangi lagi.
			  </div>
			 <meta http-equiv='refresh' content='3; url= konfirmasi.php'/> ";
		}
	} else {
		echo "<div class='alert alert-danger'>
			Kode Order tidak ditemukan, harap masukkan kembali dengan benar
		  </div>
		 <meta http-equiv='refresh' content='4; url= konfirmasi.php'/> ";
	}
};

?>

<!DOCTYPE html>
<html>

<head>
	<title><?= $name ?> - Konfirmasi Pembayaran</title>
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
	include './component/header.php';
	?>
	<!-- //header -->

	<!-- //navigation -->
	<!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
				<li><a href="index.php"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Konfirmasi</li>
			</ol>
		</div>
	</div>
	<!-- //breadcrumbs -->
	<!-- register -->
	<div class="register">
		<div class="container">
			<h2>Konfirmasi</h2>
			<div class="login-form-grids">
				<h3>Kode Order</h3>
				<form method="post" enctype="multipart/form-data">
					<strong>
						<input type="text" name="orderid" value="<?php echo $idorder ?>" disabled>
					</strong>
					<h6>Informasi Pembayaran</h6>

					<input type="text" name="nama" placeholder="Nama Pemilik Rekening / Sumber Dana" required>
					<br>
					<h6>Rekening Tujuan</h6>
					<select name="metode" class="form-control">

						<?php
						$metode = mysqli_query($conn, "select * from pembayaran");

						while ($a = mysqli_fetch_array($metode)) {
						?>
							<option value="<?php echo $a['metode'] ?>"><?php echo $a['metode'] ?> | <?php echo $a['norek'] ?></option>
						<?php
						};
						?>

					</select>
					<br>
					<h6>Tanggal Bayar</h6>
					<input type="date" class="form-control" name="tanggal">
					<h6>Bukti Transfer</h6>
					<input type="file" name="gambar" class="form-control" required>
					<input type="submit" name="confirm" value="Kirim">
				</form>
			</div>
			<div class="register-home">
				<a href="index.php">Batal</a>
			</div>
		</div>
	</div>
	<!-- //register -->
	<!-- //footer -->
	<?php
	include './component/footer.php';
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