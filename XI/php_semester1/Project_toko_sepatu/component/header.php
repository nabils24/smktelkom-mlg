<!-- header -->
<?php
include 'data.php';
?>

<!-- navigation -->
<div class="navigation-agileits">
	<div class="container">
		<nav class="navbar navbar-default">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header nav_2">
				<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
				<ul class="nav navbar-nav">
					<li class="active"><a href="index.php" class="act">Home</a></li>
					<!-- Mega Menu -->
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Kategori Produk<b class="caret"></b></a>
						<ul class="dropdown-menu multi-column columns-3">
							<div class="row">
								<div class="multi-gd-img mt-3 mb-3 px-3">
									<ul class="multi-column-dropdown">
										<h6>Kategori</h6>

										<?php
										$kat = mysqli_query($conn, "SELECT * from kategori order by idkategori ASC");
										while ($p = mysqli_fetch_array($kat)) {

										?>
											<li><a href="kategori.php?idkategori=<?php echo $p['idkategori'] ?>"><?php echo $p['namakategori'] ?></a></li>

										<?php
										}
										?>
									</ul>
								</div>

							</div>
						</ul>
					</li>
					<li><a href="cart.php">Keranjang Saya</a></li>
					<li><a href="daftarorder.php">Daftar Order</a></li>
				</ul>
				<div class="container" style="margin-top:10px;">

					<div class="agile-login">
						<ul>
							<?php
							if (!isset($_SESSION['log'])) {
								echo '
					<li><a href="registered.php"> Daftar</a></li>
					<li><a href="login.php">Masuk</a></li>
					';
							} else {

								if ($_SESSION['role'] == 'Member') {
									echo '
					<li style="color:white">Halo, ' . $_SESSION["name"] . '
					<li><a href="logout.php">Keluar?</a></li>
					';
								} else {
									echo '
					<li style="color:white">Halo, ' . $_SESSION["name"] . '
					<li><a href="admin">Admin Panel</a></li>
					<li><a href="logout.php">Keluar?</a></li>
					';
								};
							}
							?>

						</ul>
					</div>
					<div class="product_list_header" style="margin-top:-8px;">
						<a href="cart.php"><button class="w3view-cart" type="submit" name="submit" value=""><i class="fa fa-cart-arrow-down" aria-hidden="true"></i></button>
						</a>
					</div>
					<div class="clearfix"> </div>
				</div>

			</div>
		</nav>
	</div>
</div>
<!-- //navigation -->
<!-- //header -->
<div class="logo_products">
	<div class="container">
		<div class="w3ls_logo_products_left1">
			<ul class="phone_email">
				<li><i class="fa fa-phone" aria-hidden="true"></i>Hubungi Kami : <?= $telp ?></li>
			</ul>
		</div>
		<div class="w3ls_logo_products_left">
			<h1><a href="index.php"><?php echo $hasil_detail_website['name'] ?></a></h1>
		</div>
		<div class="w3l_search">
			<form action="search.php" method="post">
				<input type="search" name="Search" placeholder="Cari Sepatu...">
				<button type="submit" class="btn btn-default search" aria-label="Left Align">
					<i class="fa fa-search" aria-hidden="true"> </i>
				</button>
				<div class="clearfix"></div>
			</form>
		</div>

		<div class="clearfix"> </div>
	</div>
</div>
<!-- //header -->