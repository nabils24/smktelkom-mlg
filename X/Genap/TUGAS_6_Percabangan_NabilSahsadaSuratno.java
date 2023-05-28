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
public class TUGAS_6_Percabangan_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Jurusan;
        int ranking;
        
        System.out.println("===================================================");
        System.out.println("Masukan Jurusan=");
        Jurusan = input.next();
        System.out.println("Masukan Ranking=");
        ranking = input.nextInt();
        System.out.println("===================================================");
        
        
        switch(Jurusan){
        
            case "RPL":
                if(ranking==1){
                    System.out.println("Selamat Anda Mendapatkan Laptop Core I7");
                
                }else if(ranking==2){
                    System.out.println("Selamat Anda Mendapat Laptop Core I5");
                
                }else if(ranking==3){
                    System.out.println("Selamat Anda Mendapat Laptop Core I3");
                }
                break;
                
            case "MM":
                if(ranking==1){
                    System.out.println("Selamat Anda Mendapatkan Video Cam Professional");
                
                }else if(ranking==2){
                    System.out.println("Selamat Anda Mendapatkan Cam Prosumer");
                
                }else if(ranking==3){
                    System.out.println("Selamat Anda Mendapat PhotoCam");
                }
                break;
        }
        
        
    }
    
}
