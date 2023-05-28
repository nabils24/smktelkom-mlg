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
public class Volume_Limas {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Header;
         Scanner input = new Scanner(System.in);
         int lebar, tinggi, volume, panjang;
         System.out.println("MENGHITUNG VOLUME LIMAS");
         System.out.println("========================");
         
         // Input volume limas;
         System.out.println("Masukan Lebar limas ");
         lebar = input.nextInt();
         System.out.println("Masukan Tinggi Limas");
         tinggi = input.nextInt();
         System.out.println("Masukan Panjang Limas ");
         panjang = input.nextInt();
         
         //Menghitung Hasil;
         volume = (((panjang * lebar) * 1/2)* tinggi)* 1/3;
                 
         // Output
         System.out.println("Volume Limas = "+ volume);
         
      
    }
    
}

