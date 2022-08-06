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
import java.util.Random;
public class TUGAS_BatuGuntingKertas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random rand = new Random();
       
       int  AI, user;
       while (true){
        AI = rand.nextInt(3);
        if(AI !=0) break;
        }   
       
       //batu=1,gunting=2,kertas=3
        System.out.println("1.Batu\n2.Gunting\n3.Kertas");
        System.out.println("Masukan Pilihan Anda");
        user = input.nextInt();
        
        
        if(user==1){
            if(AI==1){
                System.out.println("SERI");
            }else if(AI==2){
                System.out.println("BOT = Gunting");
                System.out.println("Kamu Menang");
            }else if(AI==3){
                System.out.println("BOT = Kertas");
                System.out.println("Kamu Kalah");
            }
        }else if(user==2){
            if(AI==1){
                System.out.println("BOT = Batu");
                System.out.println("Kamu Kalah");
            }else if(AI==2){
                System.out.println("SERI");
            }else if(AI==3){
                System.out.println("BOT = Kertas");
                System.out.println("Kamu Menang");
            }
         }else if(user==3){
            if(AI==1){
                System.out.println("BOT = Batu");
                System.out.println("Kamu Menang");
            }else if(AI==2){
                System.out.println("BOT = Gunting");
                System.out.println("Kamu Kalah");
            }else if(AI==3){
                System.out.println("SERI");
                
            }   
        
        
         }
        System.out.println("Cek Bot" +AI);
}
}
