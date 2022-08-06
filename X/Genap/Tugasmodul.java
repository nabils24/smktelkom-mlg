/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62859
 */
import java.util.Scanner;
        
public class Tugasmodul {

    
    public static void main(String[] args) {
        //Logika
        Scanner input = new Scanner(System.in);
        String nama, kelas;
        int panjang, lebar, luas;
       
        //Nilai Nama dan Kelas
        nama = "Nabil Sahsada Suratno";
        kelas = "XRPL4";
        
        // Output Nilai Nama
        System.out.println("Nama :"+nama);
        System.out.println("Kelas :"+kelas);
      
        //input
        
        System.out.println("Masukan Nilai Panjang");
        panjang = input.nextInt();
        System.out.println("Masukan Nilai Lebar : ");
        lebar = input.nextInt();
        
        // Perhitungan
        
        luas = panjang * lebar;
        
        // output
        
        System.out.println("Luas Lapangan Sepakbola Adalah :"+luas);
        
    }
    
}
