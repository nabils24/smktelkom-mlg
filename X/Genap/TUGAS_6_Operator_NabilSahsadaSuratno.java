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
public class TUGAS_6_Operator_NabilSahsadaSuratno {

    public static void main(String[] args) {
       int jmlBarang, hrgSatuan, laptop, hardisk, mouse, pilih;
       Scanner input = new Scanner(System.in);
       
               
       System.out.println("============GUDANG NABIL SAHSADA SURATNO============");
       System.out.println("Keterangan");
       System.out.println("1.Laptop\n2.Hardisk\n3.Mouse");
       System.out.println("Silahkan Pilih");
       pilih = input.nextInt();
       
     switch (pilih){
        
         case 1 :
             System.out.println("Nama Barang = Laptop");
             System.out.println("Jumlah Barang = 7 Barang Tersedia");
             System.out.println("Harga Satuan = Rp 10.000.000.00/Perbarang");
         break;
         
         case 2:
             System.out.println("Nama Barang = Hardisk");
             System.out.println("Jumlah Barang = 11 Barang Tesedia");
             System.out.println("Harga Satuan = Rp 1.500.000.00/Perbarang");
         break;
         
         case 3:
             System.out.println("Nama Barang = Mouse");
             System.out.println("Jumlah Barang = 21 Barang Tersedia");
             System.out.println("Harga Satuan = Rp 150.000.00/Perbarang");
         break;
         default:
                 System.out.println("Pilihan Tidak Tersedia");

    }
     
   }
    
}
     
    
    

