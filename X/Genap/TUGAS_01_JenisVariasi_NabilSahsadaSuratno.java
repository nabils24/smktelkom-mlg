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
public class TUGAS_01_JenisVariasi_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    
    
      public static void hitung(int gol, int pakai, String nama) {
        int bayar=0,totalBayar=0;
        
       
       if(gol==1){
        bayar = pakai*1000;      
       }else if(gol==2){
        bayar = pakai*1300;
       }else if(gol==3){
        bayar = pakai*1500;
       }
       if(bayar<50000){
       bayar = 50000;
       }
       totalBayar = bayar+13000;//uang Admin;
      
          System.out.println("****************************************************************");
          System.out.println("Jika Pembayaran Dibawah Rp 50000 Maka Pembayaran Dianggap 50000!");
          System.out.println("****************************************************************");
          System.out.println("Nama = "+nama);
          System.out.println("Termasuk Biaya Admin "+"Rp "+bayar+"+"+"Rp 13.000");
          System.out.println("Biaya kamu adalah = "+"Rp "+totalBayar);
          System.out.println("****************************************************************");
        
      }
      
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int id;
          int gol;
        String namaanak[]={"galuh","indro","jedi","kanu"};
       
        
        System.out.println("masukkan ID = ");
        id= input.nextInt();
        
         if(id<1||id>namaanak.length){
            System.out.println("ID Tidak Ada");
            System.exit(0);
        }
         
        System.out.println("masukkan golongan  = ");
        gol=input.nextInt();
        
        System.out.println("Masukan pemakaian kwh = ");
        int pmk = input.nextInt();
        System.out.println("---------------------------");
  
        //disini
        
        
        hitung(gol,pmk,namaanak[id-1]);
    }
    
 }
    
