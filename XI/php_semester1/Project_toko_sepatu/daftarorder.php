<?php
session_start();
include 'dbconnect.php';
include './component/data.php';


if (!isset($_SESSION['log'])) {
	header('location:login.php');
} else {
};

$uid = $_SESSION['id'];
$caricart = mysqli_query($conn, "select * from cart where userid='$uid' and status='Cart'");
$fetc = mysqli_fetch_array($caricart);
@$orderidd = $fetc['orderid'];
$itungtrans = mysqli_query($conn, "select count(detailid) as jumlahtrans from detailorder where orderid='$orderidd'");
$itungtrans2 = mysqli_fetch_assoc($itungtrans);
$itungtrans3 = $itungtrans2['jumlahtrans'];





if (isset($_POST["update"])) {
	$kode = $_POST['idproduknya'];
	$jumlah = $_POST['jumlah'];
	$q1 = mysqli_query($conn, "update detailorder set qty='$jumlah' where idproduk='$kode' and orderid='$orderidd'");
	if ($q1) {
		echo "Berhasil Update Cart
		<meta http-equiv='refresh' content='1; url= cart.php'/>";
	} else {
		echo "Gagal update cart
		<meta http-equiv='refresh' content='1; url= cart.php'/>";
	}
} else if (isset($_POST["hapus"])) {
	$kode = $_POST['idproduknya'];
	$q2 = mysqli_query($conn, "delete from detailorder where idproduk='$kode' and orderid='$orderidd'");
	if ($q2) {
		echo "Berhasil Hapus <meta http-equiv='refresh' content='1; url= cart.php'/>";
	} else {
		echo "Gagal Hapus <meta http-equiv='refresh' content='1; url= cart.php'/>";
	}
}
?>
<!DOCTYPE html>
<html>

<head>
	<title><?= $name ?> - Daftar Belanja</title>
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

	<!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1">
				<li><a href="index.php"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Checkout</li>
			</ol>
		</div>
	</div>
	<!-- //breadcrumbs -->
	<!-- checkout -->
	<div class="checkout">
		<div class="container">
			<h2>Kamu memiliki <span><?php echo $itungtrans3 ?> transaksi</span></h2>
			<div class="checkout-right">
				<table class="timetable_sub">
					<thead>
						<tr>
							<th>No.</th>
							<th>Kode Order</th>
							<th>Tanggal Order</th>
							<th>Total</th>
							<th>Status</th>
						</tr>
					</thead>

					<?php

					$brg = mysqli_query($conn, "SELECT DISTINCT(idcart), c.orderid, c.tglorder, c.status from cart c, detailorder d where c.userid='$uid' and d.orderid=c.orderid and c.status!='Cart' order by tglorder DESC");
					$no = 1;
					while ($b = mysqli_fetch_array($brg)) {

					?>
						<tr class="rem1">
							<form method="post">
								<td class="invert"><?php echo $no++ ?></td>
								<td class="invert"><a href="order.php?id=<?php echo $b['orderid'] ?>"><?php echo $b['orderid'] ?></a></td>

								<td class="invert"><?php echo $b['tglorder'] ?></td>
								<td class="invert">

									Rp<?php
										$ongkir = 0;
										$jasaapps = 0;
										$subtotal = $ongkir + $jasaapps;
										$ordid = $b['orderid'];
										$result1 = mysqli_query($conn, "SELECT SUM(qty*hargaafter)+$subtotal AS count FROM detailorder d, produk p where d.orderid='$ordid' and p.idproduk=d.idproduk order by d.idproduk ASC");
										$cekrow = mysqli_num_rows($result1);
										$row1 = mysqli_fetch_assoc($result1);
										$count = $row1['count'];
										if ($cekrow > 0) {
											echo number_format($count);
										} else {
											echo 'No data';
										} ?>

								</td>

								<td class="invert">
									<div class="rem">
										<?php
										if ($b['status'] == 'Payment') {
											echo '
								<a href="konfirmasi.php?id=' . $b['orderid'] . '" class="form-control btn-primary">
								Konfirmasi Pembayaran
								</a>
								';
										} else if ($b['status'] == 'Diproses') {
											echo 'Pesanan Diproses (Pembayaran Diterima)';
										} else if ($b['status'] == 'Pengiriman') {
											echo 'Pesanan Dikirim';
										} else if ($b['status'] == 'Sampai') {
											echo 'Pesanan Sudah Sampai';
										} else if ($b['status'] == 'Selesai') {
											echo 'Pesanan Selesai';
										} else {
											echo 'Konfirmasi diterima';
										}

										?>
							</form>
			</div>
			<script>
				$(document).ready(function(c) {
					$('.close1').on('click', function(c) {
						$('.rem1').fadeOut('slow', function(c) {
							$('.rem1').remove();
						});
					});
				});
			</script>
			</td>
			</tr>
		<?php
					}
		?>

		<!--quantity-->
		<script>
			$('.value-plus').on('click', function() {
				var divUpd = $(this).parent().find('.value'),
					newVal = parseInt(divUpd.text(), 10) + 1;
				divUpd.text(newVal);
			});

			$('.value-minus').on('click', function() {
				var divUpd = $(this).parent().find('.value'),
					newVal = parseInt(divUpd.text(), 10) - 1;
				if (newVal >= 1) divUpd.text(newVal);
			});
		</script>
		<!--quantity-->
		</table>
		</div>
	</div>
	</div>
	<!-- //checkout -->
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