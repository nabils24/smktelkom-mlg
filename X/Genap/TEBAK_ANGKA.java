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
import java.util.Random;
public class TEBAK_ANGKA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random rand = new Random();
       
     int nilaiAcak, nilaiIsi;
    
        nilaiAcak = rand.nextInt(10)+1 ;
        
        
      do{
          System.out.println("Masukan Nilai Tebakan Anda");
          nilaiIsi=input.nextInt();
        if(nilaiAcak==nilaiIsi){
            System.out.println("Nilai BETULLL SELAMATTT");
        }else if(nilaiIsi<nilaiAcak){
            System.out.println("Nilai Anda Terlalu Rendah Coba Lagi");
        }else if(nilaiIsi>nilaiAcak){
            System.out.println("Nilai Anda Terlalu Tingi Coba Lagi");
        }
          
      }while(nilaiAcak!=nilaiIsi);{
        
    }
        
     
     
    }
    
}
