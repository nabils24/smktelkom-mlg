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
public class TUGAS_3_Operator_NabilSahsadaSuratno {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesan,pilih, total;
        double harga=4500.5,Bu;
        
        
        String nama;
        System.out.println("Masukkan nama :");
        nama = input.next();
        System.out.println("Pilihan:\n 1. Mawar (Rp.45.000)\n 2. Melati(Rp.45.000)");
        System.out.println("Masukkan Pilihan :");
        pilih = input.nextInt();
        System.out.println("Jumlah Pesan : ");
        pesan = input.nextInt();
        
        System.out.println("================");
        switch(pilih){
            case 1:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Mawar Ibu Ani");
                System.out.println("Harga : 15.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*4500.5);
            break;
            case 2:
         
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Melati Ibu Ani");
                System.out.println("Harga : 10.000");
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+pesan*4500.5);
                
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
    
   }
}
