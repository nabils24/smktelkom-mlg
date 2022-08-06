<?php

    $siswa = array(
        '1' => array(
            'nama' => 'Nabil',
            'alamat' => 'Jl. Tambungan',
            'kelas' => 'XIR7',
            'nilai_p' => '85',
            'nilai_k' => '90',
        ),
        '2' => array(
            'nama' => 'Ihsan',
            'alamat' => 'Jl. Raya',                              
            'kelas' => 'XIR7',
            'nilai_p' => '95',
            'nilai_k' => '90',
        ),
        '3' => array(
            'nama' => 'Jelita',
            'alamat' => 'Jl. Raya',
            'kelas' => 'XIR7',
            'nilai_p' => '80',
            'nilai_k' => '95',
        ),
    );
    echo '<br>';
    echo '<table border="1" width="35%" height="35px" align="center">';
    echo '<tr align="center">';
    echo '<td>Index</td>';
    echo '<td>Nama</td>';
    echo '<td>Alamat</td>';
    echo '<td>kelas</td>';
    echo '<td>Nilai_P</td>';
    echo '<td>Nilai_K</td>';
    echo '<td>Rata - Rata</td>';
    echo '</tr>';
    foreach($siswa as $key => $value){
        
        echo '<tr align="center">';
        echo '<td>'.$key.'</td>';
        echo '<td>'.$value['nama'].'</td>';
        echo '<td>'.$value['alamat'].'</td>';
        echo '<td>'.$value['kelas'].'</td>';
        echo '<td>'.$value['nilai_p'].'</td>';
        echo '<td>'.$value['nilai_k'].'</td>';
        $nilai_tambah = $value['nilai_p'] + $value['nilai_k'];
        $nilai_rata2 = $nilai_tambah / 2;
        echo '<td>'.$nilai_rata2.'</td>';
        echo '</tr>';
    }
    echo '</table>';



?>