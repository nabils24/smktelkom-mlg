/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62859
 */;

import java.util.Scanner;

public class VOLUME_RUANG_BALOK {
    
     public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, hasil;
        System.out.println("Program Menghitung Luas Balok");
        System.out.println("=============================");
 
        // Tempat Input;
        System.out.println("Masukan Panjang Balok ");
        panjang = input.nextInt();
        System.out.println("Masukan Lebar balok ");
        lebar = input.nextInt();
        System.out.println("Masukan Tinggi Balok ");
        tinggi = input.nextInt();
 
        // Menghitung Luas Balok;
        hasil =  2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        
        // Menampilkan Hasil
        System.out.println("Luas Balok tersebut adalah: " + hasil);
 
 
    }
}
    

