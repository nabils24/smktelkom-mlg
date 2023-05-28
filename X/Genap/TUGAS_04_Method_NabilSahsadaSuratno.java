/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62859
 */
import java.lang.Math;
import java.util.Scanner;
import java.util.Scanner;
public class TUGAS_04_Method_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    
    public static void max(int a, int b, int c) {
        int maks;
        System.out.println("Nilai Tertinggi Adalah : ");
        maks = Math.max(a, b);
        
        if(c>maks){
            maks = c;
        }
        System.out.println(maks);
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
     int a,b,c;
     
        System.out.println("Masukan Nilai A");
        a = input.nextInt();
        System.out.println("Masukan Nilai B");
        b = input.nextInt();
        System.out.println("Masukan Nilai C");
        c = input.nextInt();
        
        max(a,b,c);
        
    }
    
}
