<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
    div {
        width: 200px;
        border: 1px solid black;
        padding: 25px;
        margin: 10px;
        float: left;
    }
</style>
</head>
<body>
<?php


$dataProduk = [
    //nama produk, merk, harga, status stok
    ["Galaxy S21", "Samsung", 19000000, true],
    ["Galaxy A71", "Samsung", 6999000, false],
    ["iPhone 12 Pro Max", "Apple", 20999000, true],
    ["iPhone 12 Mini", "Apple", 10999000, false],
];
foreach ($dataProduk as $data) {
    $ketersediaan = "<h4>Stok Habis</h4>";

    if ($data[3]) {
        $ketersediaan = '<h4>Stok Tersedia</h4>' .
            '<button type="button">Order</button>';
    }
    echo '<div>' .
        '<h3>' . $data[1] . '</h3>' .
        '<h2>' . $data[0] . '</h2>' .
        '<h4>Rp ' . $data[2] . '</h4>' .
        $ketersediaan .
        '</div>';
}

?>
</body>
</html>

