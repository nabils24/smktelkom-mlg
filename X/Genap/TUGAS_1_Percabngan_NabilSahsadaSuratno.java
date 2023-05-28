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
public class TUGAS_1_Percabngan_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umurDewasa=16;
        
        System.out.println("Masukan Umur");
        int umur = input.nextInt();
         
        if (umur > umurDewasa){
            System.out.println("umur anda " +umur);
            System.out.println("memasuki masa dewasa");
        }
        else{
            System.out.println("umur anda " +umur);
            System.out.println("memasuki masa remaja");
        }

        
        
        
        
    }
    
}
