<?php
function nilai(){
    if($nilai > 90){
        echo "Grade A+";
    }elseif($nilai > 80 && $nilai <= 90){
        echo "Grade A";
    }elseif($nilai > 70 && $nilai <= 80){
        echo "Grade B+";
    }elseif($nilai > 60 && $nilai <= 70){
        echo "Grade B";
    }elseif($nilai > 50 && $nilai <= 60){
        echo "Grade C+";
    }elseif($nilai > 40 && $nilai <= 50){
        echo "Grade C";
    }elseif($nilai > 30 && $nilai <= 40){
        echo "Grade D";
    }elseif($nilai <= 30 ){
        echo "Grade E";
    }else{
        echo "Nilai tidak valid";
    }
}
nilai();
?>