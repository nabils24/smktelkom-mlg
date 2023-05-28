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
$cekcardsesuaiuid = mysqli_num_rows($caricart);

@$fetc = mysqli_fetch_array($caricart);

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
	// $q3 = mysqli_query($conn, "delete from cart where orderid='$orderidd'");
	if ($q2) {
		echo "Berhasil hapus
		<meta http-equiv='refresh' content='1; url= cart.php'/>";
	} else {
		echo "Gagal hapus
		<meta http-equiv='refresh' content='1; url= cart.php'/>";
	}
}
?>
<!DOCTYPE html>
<html>

<head>
	<title><?= $name ?> - Keranjang Saya</title>
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
			<h2>Dalam keranjangmu ada : <span><?php echo $itungtrans3 ?> barang</span></h2>
			<div class="checkout-right">
				<table class="timetable_sub">
					<thead>
						<tr>
							<th>No.</th>
							<th>Produk</th>
							<th>Nama Produk</th>
							<th>Jumlah</th>


							<th>Harga Satuan</th>
							<th>Hapus</th>
						</tr>
					</thead>

					<?php
					$brg = mysqli_query($conn, "SELECT * from detailorder d, produk p where orderid='$orderidd' and d.idproduk=p.idproduk order by d.idproduk ASC");
					// brg adalah variabel yang digunakan untuk menampung data dari database yang diambil dari tabel produk dan detailorder yang diurutkan berdasarkan idproduk secara ascending
					$no = 1;
					while ($b = mysqli_fetch_array($brg)) {

						// apa gunanya mysql_fetch_array? untuk mengambil data dari database dan menampilkannya ke dalam bentuk array yang nantinya akan ditampilkan ke dalam bentuk tabel

					?>
						<tr class="rem1">
							<form method="post">
								<td class="invert"><?php echo $no++ ?></td>
								<td class="invert"><a href="product.php?idproduk=<?php echo $b['idproduk'] ?>"><img src="<?php echo $b['gambar'] ?>" width="100px" height="100px" /></a></td>
								<td class="invert"><?php echo $b['namaproduk'] ?></td>
								<td class="invert">
									<div class="quantity">
										<div class="quantity-select">
											<input type="number" name="jumlah" class="form-control" height="100px" value="<?php echo $b['qty'] ?>" \>
										</div>
									</div>
								</td>

								<td class="invert">Rp<?php echo number_format($b['hargaafter']) ?></td>
								<td class="invert">
									<div class="rem">

										<input type="submit" name="update" class="form-control" value="Update" \>
										<input type="hidden" name="idproduknya" value="<?php echo $b['idproduk'] ?>" \>
										<input type="submit" name="hapus" class="form-control" value="Hapus" \>
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
		<div class="checkout-left">
			<div class="checkout-left-basket">
				<h4>Total Harga</h4>
				<ul>
					<?php
					$brg = mysqli_query($conn, "SELECT * from detailorder d, produk p where orderid='$orderidd' and d.idproduk=p.idproduk order by d.idproduk ASC");
					$no = 1;
					$ongkir = 0;
					$jasaapps = 0;
					$subtotal = $ongkir + $jasaapps;
					// subtotal adalah harga ongkir
					while ($b = mysqli_fetch_array($brg)) {
						$hrg = $b['hargaafter'];
						$qtyy = $b['qty'];

						$totalharga = $hrg * $qtyy;
						// totalharga adalah harga produk dikali dengan jumlah produk
						$subtotal += $totalharga;
						// subtotal adalah harga ongkir ditambah dengan total harga
					?>
						<li><?php echo $b['namaproduk'] ?><i> - </i> <span>Rp<?php echo number_format($totalharga) ?> </span></li>
					<?php
					}
					?>
					<span style="font-weight: bold; font-size: 20px;">Total Rp<?php echo number_format($subtotal) ?></span>
					<li></li>
				</ul>
			</div>

			<?php
			if ($itungtrans3 > 0) {
				echo '<div class="checkout-right-basket">
				<a href="index.php"><span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>Continue Shopping</a>
				<a href="checkout.php"><span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span>Checkout</a>
			</div>';
			} else {
				echo '<div class="checkout-right-basket">
				<a  href="index.php"><span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>Continue Shopping</a>
			</div>';
			}
			?>

			<div class="clearfix"> </div>
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


</body>

</html>