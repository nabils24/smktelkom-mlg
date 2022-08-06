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
public class TUGAS_2_Percabangan_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Nilai");
        int nilai = input.nextInt();
        
        
        if (nilai >= 90){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat A");
            if(nilai==100){
                System.out.println("Nilai Sempurna");
            }
        }
        else if (nilai >= 80){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat B");
        }
        else if (nilai >= 85){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat C");
        }
        else if (nilai >=70){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat D");
        }
        else {
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat E");
        }

    }
    
}
