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
public class TUGAS_BUATTAGIHANKARTUATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int blnTagihan ,pilihanKartu,tagihan;
       String nama;
        System.out.println("====================================================");
        System.out.println("Masukan Nama Anda");
        nama = input.next();
        System.out.println("Masukan Jumlah Bulanan Tagihan anda = ");
        blnTagihan = input.nextInt();
        System.out.println("Keterangan Kartu\n1. Kartu Platinum\n2. Kartu Gold\n3. Kartu Silver\n4. Kartu Standar");
        System.out.println("Pilih Kartu (ANGKA) = ");
        pilihanKartu = input.nextInt();
        
        System.out.println("====================================================");
        if(pilihanKartu==1){
            tagihan = blnTagihan*20000;
            System.out.println("Nama = "+nama);
            System.out.println("Kartu Platinum");
            System.out.println("Tagihan Bulanan Anda = "+blnTagihan);
            System.out.println("Jumlah Tagihan Anda Adalah = "+tagihan);
        }else if(pilihanKartu==2){
        tagihan = blnTagihan*15000;
            System.out.println("Nama = "+nama);
            System.out.println("Kartu Gold");
            System.out.println("Tagihan Bulanan Anda = "+blnTagihan);
            System.out.println("Jumlah Tagihan Anda Adalah = "+tagihan);
        }else if(pilihanKartu==3){
        tagihan = blnTagihan*10000;
            System.out.println("Nama = "+nama);
            System.out.println("Kartu Silver");
            System.out.println("Tagihan Bulanan Anda = "+blnTagihan);
            System.out.println("Jumlah Tagihan Anda Adalah = "+tagihan);
        }else if(pilihanKartu==4){
        tagihan = blnTagihan*5000;
            System.out.println("Nama = "+nama);
            System.out.println("Kartu Standart");
            System.out.println("Tagihan Bulanan Anda = "+blnTagihan);
            System.out.println("Jumlah Tagihan Anda Adalah = "+tagihan);
        }else{
            System.out.println("Pilihan Tida Tersedia Mohon Pilih Sesuai Keterangan!");
            System.out.println("Keterangan Kartu\n1. Kartu Platinum\n2. Kartu Gold\n3. Kartu Silver\n4. Kartu Standar");
        }
        
        System.out.println("====================================================");
        
        
        
        
    }
    
}
