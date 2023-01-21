<?php
session_start();
include 'dbconnect.php';
?>
<?php
$detail_website1 = mysqli_query($conn, "select * from detail_website");
$hasil_detail_website = mysqli_fetch_array($detail_website1);
?>

<!DOCTYPE html>
<html>

<head>
	<title><?php echo $hasil_detail_website['name'] ?> - Jual Sepatu</title>
	<!-- for-mobile-apps -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Falenda Flora, Ruben Agung Santoso" />
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
	<?php
	include './component/header.php';
	?>


	<!-- //top-header and slider -->
	<!-- top-brands -->
	<div class="top-brands">
		<div class="container">
			<h2>Produk Sepatu Kami</h2>
			<div class="grid_3 grid_5">
				<div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">
					<div id="myTabContent" class="tab-content">
						<div role="tabpanel" class="tab-pane fade in active" id="expeditions" aria-labelledby="expeditions-tab">
							<div class="agile-tp">
								<h5>Mau cari sepatu apa?
									<?php
									if (!isset($_SESSION['name'])) {
									} else {
										echo '' . $_SESSION['name'] . '!';
									}
									?>
								</h5>
							</div>
							<div class="agile_top_brands_grids">

								<?php
								$brgs = mysqli_query($conn, "SELECT * from produk order by idproduk ASC");
								$no = 1;
								while ($p = mysqli_fetch_array($brgs)) {

								?>
									<div class="col-md-4 top_brand_left">
										<div class="hover14 column" style="margin-bottom:30px;">
											<div class="agile_top_brand_left_grid">

												<div class="agile_top_brand_left_grid1">
													<figure class="">
														<div class="snipcart-item block">
															<div class="snipcart-thumb">
																<a href="product.php?idproduk=<?php echo $p['idproduk'] ?>"><img title=" " alt=" " src="<?php echo $p['gambar'] ?>" width="200px" height="200px" /></a>
																<p><?php echo $p['namaproduk'] ?></p>
																<div class="stars">
																	<?php
																	$bintang = '<i class="fa fa-star blue-star" aria-hidden="true"></i>';
																	$rate = $p['rate'];

																	for ($n = 1; $n <= $rate; $n++) {
																		echo '<i class="fa fa-star blue-star" aria-hidden="true"></i>';
																	};
																	?>
																</div>
																<h4>Rp<?php echo number_format($p['hargaafter']) ?> <span>Rp<?php echo number_format($p['hargabefore']) ?></span></h4>
															</div>
															<div class="snipcart-details top_brand_home_details">
																<fieldset>
																	<a href="product.php?idproduk=<?php echo $p['idproduk'] ?>"><input type="submit" class="button" value="Lihat Produk" /></a>
																</fieldset>
															</div>
														</div>
													</figure>
												</div>
											</div>
										</div>
									</div>
								<?php
								}
								?>


								<div class="clearfix"> </div>
							</div>
						</div>


					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- //top-brands -->





	<?php
	include './component/footer.php';
	?>
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