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
public class TUGAS_5_Percabangan_NabilSahsahdaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String pilih;
        
    Scanner input = new Scanner(System.in);
    
        System.out.println("Masukan Predikat");
        pilih = input.next();
        
        switch(pilih){
            
            case "A":
                System.out.println("Predikat = A");
                System.out.println("Kriteria = Sangat Baik");
                System.out.println("Rata Rata Nilai = 100 - 96");
            break;
            case "A-":
                System.out.println("Predikat = A-");
                System.out.println("Kriteria = Sangat Baik");
                System.out.println("Rata Rata Nilai = 95 - 91");
            break;
            case "B+":
                System.out.println("Predikat = B+");
                System.out.println("Kriteria = Baik");
                System.out.println("Rata Rata Nilai = 90 - 86");
            break;
            case "B":
                System.out.println("Predikat = B");
                System.out.println("Kriteria = Baik");
                System.out.println("Rata Rata Nilai = 85 - 81");
            break;
            case "B-":
                System.out.println("Predikat = B-");
                System.out.println("Kriteria = Baik");
                System.out.println("Rata Rata Nilai = 80 - 75");
            break;
            case "C+":
                System.out.println("Predikat = C+");
                System.out.println("Kriteria = Cukup");
                System.out.println("Rata Rata Nilai = 74 - 70");
            break;
            case "C":
                System.out.println("Predikat = C");
                System.out.println("Kriteria = Cukup");
                System.out.println("Rata Rata Nilai = 69 - 65");
            break;
            case "C-":
                System.out.println("Predikat = C-");
                System.out.println("Kriteria = Cukup");
                System.out.println("Rata Rata Nilai = 64 - 60");
            break;
            case "D+":
                System.out.println("Predikat = D+");
                System.out.println("Kriteria = Kurang");
                System.out.println("Rata Rata Nilai = 59 - 55");
            break;
            case "D":
                System.out.println("Predikat = D");
                System.out.println("Kriteria = Sangat Kurang");
                System.out.println("Rata Rata Nilai = 55 - 0");
            break;
        }        
        
    }
    
}
