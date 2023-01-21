<?php
$detail_website1 = mysqli_query($conn, "select * from detail_website");
$hasil_detail_website = mysqli_fetch_array($detail_website1);
?>
<!-- //footer -->
<div class="footer">
	<div class="container">
		<div class="w3_footer_grids">
			<div class="col-md-4 w3_footer_grid">
				<h3>Hubungi Kami</h3>

				<ul class="address">
					<li><i class="glyphicon glyphicon-map-marker" aria-hidden="true"></i><?php echo $hasil_detail_website['alamat'] ?></li>
					<li><i class="glyphicon glyphicon-envelope" aria-hidden="true"></i><a href="mailto:<?php echo $hasil_detail_website['email'] ?>"><?php echo $hasil_detail_website['email'] ?></a></li>
					<li><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i><?php echo $hasil_detail_website['telp'] ?></li>
				</ul>
				
			</div>
			<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3951.2772052238256!2d112.64771701469628!3d-7.970277294259541!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x2dd6284f548605b9%3A0x5bf2c74e3f4ec655!2sJl.%20Warinoi%20V%20No.2%2C%20Bunulrejo%2C%20Kec.%20Blimbing%2C%20Kota%20Malang%2C%20Jawa%20Timur%2065126!5e0!3m2!1sid!2sid!4v1666050731188!5m2!1sid!2sid" width="450" height="250" style="border-radius:10px; float: right;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade">
			</iframe>
			<div class="clearfix"></div>
		</div>
	</div>

	<div class="footer-copy">

		<div class="container">
			<p>©<?php echo $hasil_detail_website['name'] ?>, All rights reserved</p>
		</div>
	</div>

</div>

<!-- //footer -->