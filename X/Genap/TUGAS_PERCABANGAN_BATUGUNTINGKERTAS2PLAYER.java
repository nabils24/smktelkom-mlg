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
public class TUGAS_PERCABANGAN_BATUGUNTINGKERTAS2PLAYER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int user1, user2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Keterangan\n1.Batu\n2.Gunting\n3.Kertas");
        System.out.println("Masukan Pilihan (USER1)");
        user1 = input.nextInt();
        System.out.println("Masukan Pilihan (USER2)");
        user2 = input.nextInt();
        
        //batu=1,gunting=2,kertas=3
        if(user1==1){
            if(user2==1){
                System.out.println("KALIAN SAMA/SERI");
            }else if(user2==2){
                System.out.println("USER 1 MENANG\nUSER 2 KALAH");
            }else if(user2==3){
                System.out.println("USER 2 MENANG\nUSER 1 KALAH");
            }
        }else if(user1==2){
            if(user2==1){
                System.out.println("USER 2 MENANG\nUSER 1 KALAH");
            }else if(user2==2){
                System.out.println("KALIAN SAMA/SERI");
            }else if(user2==3){
                System.out.println("USER 1 MENANG\nUSER 2 KALAH");
            }
    }else if(user1==3){
            if(user2==1){
                System.out.println("USER 1 MENANG\nUSER 2 KALAH");
            }else if(user2==2){
                System.out.println("USER 2 MENANG\nUSER 1 KALAH");
            }else if(user2==3){
                System.out.println("KALIAN SAMA/SERI");
            }
        }
    }
}