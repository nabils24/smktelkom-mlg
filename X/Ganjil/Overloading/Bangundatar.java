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

package Overloading;


public class Bangundatar {
    // Buat Kodingan Neng Kene Bro OKE:D
    
    double luas;
    double a=0.5;
    
    void luas(double panjang , double lebar){
        luas = panjang*lebar;
        System.out.println("luas pertama = "+luas);
    }
    void luas(int panjang, int lebar, int a){
        luas= panjang * lebar*a;
        System.out.println("luas kedua = "+luas);
    }

}
