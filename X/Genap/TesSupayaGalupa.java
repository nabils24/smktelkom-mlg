
import javax.swing.text.html.HTML;

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


import java.util.Scanner;
public class TesSupayaGalupa {

    static int bayar (int harga1, int harga2) {
        int total;
        
        total = harga1 * harga2 /2 ;
        
        return total;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Buat Kodingan Neng Kene Bro OKE:D
       
        System.out.println("Masukan Harga 1");
        int harga1 = input.nextInt();
        System.out.println("Masukan Harga 2");
        int harga2 = input.nextInt();
        
        //Hasil
        
        System.out.println("Hasil = "+bayar(harga1,harga2));
        
     
    }

}
