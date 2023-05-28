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

package BangunDatar;


public class persegipanjang extends bangundatar{
    // Buat Kodingan Neng Kene Bro OKE:D
    float panjang, lebar;

    public void luas(){
        float luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang = "+luas);
    }
    public void keliling(){
        float keliling=2*(panjang+lebar);
        System.out.println("Keliling Persegi panjang = " + keliling);
    }

}
