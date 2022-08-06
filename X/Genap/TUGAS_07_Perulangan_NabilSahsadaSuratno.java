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
public class TUGAS_07_Perulangan_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String lagi = "Y", nama;
    
    while(lagi.equals("Y")){
               
        System.out.println("Masukan Nama  = ");
        nama =input.next();
        System.out.println("Masukan Nilai = ");
        int nilai=input.nextInt();
     
        if(nilai>=400){
         System.out.println("Error - NILAI TERLALU BESAR");
         break;
        }else{
        System.out.println("Nama = "+nama);
        System.out.println("Jumlah nilai = "+nilai);
        System.out.println("Apakah Anda Masih ada data lagi yang ingin di masukan? (Y/T) ?");
        Scanner ulang = new Scanner(System.in);
        lagi = ulang.nextLine().toUpperCase();
        System.out.println("OK");}
     }   
        
                    System.out.println("Terima Kasih By Nabilss");
       }
    }
    

