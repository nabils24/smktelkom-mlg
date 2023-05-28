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
public class TUGAS_1_CariSegitiga_NabilSahsadaSuratno {
 
    public static void main(String[] args) {
     int panjangSisi1, panjangSisi2, panjangSisi3;
      Scanner input = new Scanner(System.in);
      System.out.println("====================================================");
        System.out.println("Masukan Panjang Sisi Segitiga");
        panjangSisi1 = input.nextInt();
        System.out.println("Masukan Panjang Sisi Segitiga");
        panjangSisi2 = input.nextInt();
        System.out.println("Masukan Panjang Sisi Segitiga");
        panjangSisi3 = input.nextInt();
        
        if(panjangSisi1==panjangSisi2&&panjangSisi2==panjangSisi3){
           System.out.println("Ini Adalah Segitiga Sama Sisi");
        
            
        }else if(panjangSisi1==panjangSisi2){
            System.out.println("Ini Adalah Segitiga Sama Kaki");
            
        }else{
        System.out.println("Ini Adalah Segitiga Sembarang");
        }
        System.out.println("====================================================");
    }
    
}
