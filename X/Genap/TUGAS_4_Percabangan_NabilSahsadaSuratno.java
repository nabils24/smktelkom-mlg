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
public class TUGAS_4_Percabangan_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nilai;
    Scanner input = new Scanner(System.in);
    System.out.println("Masukan Nilai =");
    nilai = input.nextInt();
        if (nilai > 95){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat A");
            if(nilai==100){
                System.out.println("sempurna");
            }
        }
        else if (nilai > 80){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat B");
            if(nilai >=89){
                System.out.println("sedikit lagi dapat nilai A");
            }
        }
        else if (nilai > 78){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat C");
        }
        else if (nilai > 75){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat D");
        }
        else {
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat E");
            if (nilai < 60){
                System.out.println("tidak lulus");
            }

    
     }
        
    }
    
}
