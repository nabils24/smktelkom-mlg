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

package BusV2;


import java.util.Scanner;
public class UJiBusV2 {

   
    public static void main(String[] args) {
        // Buat Kodingan Neng Kene Bro OKE:D 
       
       Scanner input = new Scanner(System.in);
       BusBaru miniBus = new BusBaru(10);
       
        System.out.println("Masukan Jumlah Penumpang");
        int tambah = input.nextInt();
        miniBus.tambahPenumpang(tambah);
        miniBus.ckberat(tambah);
        miniBus.cetak();
        
        
    }

}
