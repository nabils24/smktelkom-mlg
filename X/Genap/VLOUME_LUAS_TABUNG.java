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
public class VLOUME_LUAS_TABUNG {
     public static void main(String[] args) throws Exception {
         // Header;
         Scanner input = new Scanner(System.in);
         int Jari, Tinggi;
         System.out.println("MENGHITUNG VOLUME TABUNG");
         System.out.println("========================");
         
         // Input Jari dan Tinggi;
         System.out.println("Masukan Jari-Jari ");
         Jari = input.nextInt();
         System.out.println("Masukan Tinggi Tabung ");
         Tinggi = input.nextInt();
         
         //Menghitung Hasil;
         
         System.out.println("Volume tabung adalah : " + Tinggi*Jari*Jari*22/7);
         
     }
}
