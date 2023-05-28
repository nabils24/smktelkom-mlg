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
public class TUGAS_3_Percabangan_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String huruf;
     Scanner input = new Scanner(System.in);
     
     
        System.out.println("Masukan Huruf(KAPITAL)");
        huruf = input.next();
        
        System.out.println("=======================================");
        switch(huruf){
            case "A":
                System.out.println("Predikat nilai A: Sangat baik");
            break;
            case "B":
                System.out.println("Predikat nilai B: Baik");
            break;
            case "C":
                System.out.println("Predikat nilai C: Cukup");
             break;
            case "D":
                System.out.println("Predikat nilai D: Kurang");
            break;
            case "E":
                System.out.println("Predikat nilai E: Sangat Kurang");
            break;
        }
        System.out.println("=======================================");  

        
    }
    
}
