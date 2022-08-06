// __  __            __           ___                     
///\ \/\ \          /\ \      __ /\_ \                    
//\ \ `\\ \     __  \ \ \____/\_\\//\ \     ____    ____  
// \ \ , ` \  /'__`\ \ \ '__`\/\ \ \ \ \   /',__\  /',__\ 
//  \ \ \`\ \/\ \L\.\_\ \ \L\ \ \ \ \_\ \_/\__, `\/\__, `\
//   \ \_\ \_\ \__/.\_\\ \_,__/\ \_\/\____\/\____/\/\____/
//    \/_/\/_/\/__/\/_/ \/___/  \/_/\/____/\/___/  \/___/ 

///////////////////////////////////
//Author : Nabil Sahsada Suratno///
//Mode : Java Main Class        ///
//Youtube : NabilGames          ///
///////////////////////////////////

package Mobil;

import java.util.Scanner;

public class main {
     public static void main(String[] args) {
        
        // membuat objek Mobil
        Tonyota tonyota = new Tonyota();
        dahanyatsu dahanyatsu = new dahanyatsu();

        // membuat objek user Mobil
        caruser nabil = new caruser(tonyota);
        caruser panji = new caruser(dahanyatsu);
        

        System.out.println("===SILAHKAN PILIH KENDARAAN===");
        System.out.println("[1]Tonyota\n[2]Dahanyatsu\n");
        Scanner input = new Scanner(System.in);
        String pilhMobil; 
        System.out.print("Pilih aksi> ");
        pilhMobil = input.nextLine();
        
        switch(pilhMobil){
            case "1":
                while (true) {                    
                System.out.println("===APLIKASI INTERFACE TONYOTA===");
                System.out.println("[1]Nyalakan Mesin\n[2]Matikan Mesin\n[3]Speed UP\n[4]Speed Down\n[5]Keluar");
                System.out.print("Pilih aksi> ");
                String isi;
                isi = input.nextLine();
                switch(isi){
                    case "1":
                        tonyota.engineOn();
                        break;
                    case "2":
                        tonyota.engineOff();
                        break;
                    case "3":
                        tonyota.speedUp();
                        break;
                    case "4":
                        tonyota.speedDown();
                        break;
                    case "5":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Kamu Salah memilih AKSI!");
                    }   
                }
            case "2":
                while (true) {                    
                    System.out.println("===APLIKASI INTERFACE DAHANYATSU===");
                System.out.println("[1]Nyalakan Mesin\n[2]Matikan Mesin\n[3]Speed UP\n[4]Speed Down\n[5]Keluar");
                System.out.print("Pilih aksi> ");
                String isi;
                isi = input.nextLine();
                switch(isi){
                    case "1":
                        dahanyatsu.engineOn();
                        break;
                    case "2":
                        dahanyatsu.engineOff();
                        break;
                    case "3":
                        dahanyatsu.speedUp();
                        break;
                    case "4":
                        dahanyatsu.speedDown();
                        break;
                    case "5":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Kamu Salah memilih AKSI!");
                    }   
                }
            default:
                System.out.println("Kamu salah memilih AKSI!");
                
        
        }
       

    }

}
