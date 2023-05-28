<?php
    function getdatasiswa($idsiswa){
        $siswa = array(
            '1' => array(
                'nama' => 'Nabil',
                'alamat' => 'Jl. Tambungan',
                'umur' => '20'
            ),
            '2' => array(
                'nama' => 'Ihsan',
                'alamat' => 'Jl. Raya',
                'umur' => '20'
            ),
            '3' => array(
                'nama' => 'Jelita',
                'alamat' => 'Jl. Raya',
                'umur' => '20'
            ),
        );
        return $siswa[$idsiswa];
    }
    echo '<h1 align="center">'.getdatasiswa(1)['nama'].' '.getdatasiswa(1)['alamat'].'</h1>';

    function fruits(){
        $fruits = array('apple','banana','mango','orange','pineapple','strawberry');
        foreach($fruits as $fruit){
            echo '<li>'.$fruit.'</li>';
        }
    }
?>