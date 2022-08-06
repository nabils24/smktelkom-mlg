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
public class TUGAS_05_Method_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void tambah(int a, int b) {
        int hitung;
        
       hitung = a + b;
       
        System.out.println("Haslnya Adalah:"+ hitung);
        
    }
    
    public static void kali(int a, int b) {
        int hitung;
        
       hitung = a * b;
       
        System.out.println("Haslnya Adalah:"+ hitung);
        
    }
    
    public static void kurang(int a, int b) {
        int hitung;
        
       hitung = a - b;
       
        System.out.println("Haslnya Adalah:"+ hitung);
        
    }
    
    public static void bagi(int a, int b) {
        int hitung;
        
       hitung = a % b;
       
        System.out.println("Haslnya Adalah:"+ hitung);
        
    }
    
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String pilihan = "Null";
         
         System.out.println("Masukan Nilai A");
         int a = input.nextInt();
         
         System.out.println("Masukan Nilai B");
         int b = input.nextInt();
         System.out.println("Masukan Pilihan Aritmatika Anda");
         pilihan = input.next();
         
         
        if(pilihan=="tambah"){
            System.out.println("INI ADALAH ARITMATIKA TAMBAH");
            tambah(a,b);
        
        }else if(pilihan=="-"){
            System.out.println("INI ADLAH ARITMATIKA KURANG");
            kurang(a,b);
        }else if(pilihan=="*"){
        
            System.out.println("INI ADALAH ARITMATIKA KALI");
            kali(a,b);
        }else if(pilihan=="%"){
            System.out.println("INI ADALAH PEMBAGIAN");
            bagi(a,b);
        }
        
        
        }
        
    }
    

