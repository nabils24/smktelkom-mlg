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
public class TUGAS_ContohUKL_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    
    public static void hitung(int pakai, String nama){ //Void Hitung
    int bayar,tarifTotal;
    
    if(pakai<=10){
    bayar = 2000;
    }else if(pakai<=20){
    bayar = 3000;
    }else if(pakai<=30){
    bayar = 4000;
    }else{
    bayar = 5000;
    }
    if(pakai<=10){
    bayar =  2000;
    }
    tarifTotal = bayar+10000;//uangadmin
    System.out.println("**********************************************************************");
          System.out.println("Jika Pembayaran Dibawah 10(m3) Maka Pembayaran Dianggap 10(m3)!");
          System.out.println("****************************************************************");
          System.out.println("Nama = "+nama);//idPelanggan
          System.out.println("Termasuk Biaya Admin "+"Rp "+bayar+"+"+"Rp 10.000");
          System.out.println("Biaya kamu adalah = "+"Rp "+tarifTotal);
          System.out.println("****************************************************************");
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int id;
       int gol;
       
       String namaanak[]={"Ali","Budi","Dani","Edi","Umar"};//dataID
       
        
        System.out.println("masukkan ID Pelanggan = ");
        id= input.nextInt();
        
        if(id<1||id>namaanak.length){
            System.out.println("ID Tidak Ada");
            System.exit(0);
        }
        System.out.println("Masukan pemakaian (m3) = ");
        int pmk = input.nextInt();
        System.out.println("---------------------------");
        
        
        hitung(pmk,namaanak[id-1]);
        
        

        }
        
        
       
       
    }
    

