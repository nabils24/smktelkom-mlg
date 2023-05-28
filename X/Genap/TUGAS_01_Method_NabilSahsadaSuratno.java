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
public class TUGAS_01_Method_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    
    public static void hitung(int a, int b, int c)
    {
      
        System.out.println("Hasil :"+(a+b+c));
      
    }
  
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);       
       
         System.out.println("Masukan Bilangan I: ");
         int bil = input.nextInt();
         
         System.out.println("Masukan Bilangan II: ");
         int bil2 = input.nextInt();
         
         hitung(bil, bil2, 100);
    }
  
    
}
