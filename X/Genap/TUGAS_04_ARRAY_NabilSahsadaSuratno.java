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
public class TUGAS_04_ARRAY_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       String nama[]={"dea","nabil","samuel"};
       
        System.out.println("Masukan Angka Pilihan Anda");
        int nilai=input.nextInt();
        
        if(nilai<=4){
            System.out.println(nama[nilai]);
        }else{
            System.out.println("Data Tidak Ditemukan");
        }
    }
    
}
