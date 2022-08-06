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

package doraemon;

import java.util.ArrayList;



public class Doraemon {

   
    public static void main(String[] args) {
        // Buat Kodingan Neng Kene Bro OKE:D
        
        // membuat objek array list
        ArrayList kantongAjaib = new ArrayList();

        // Mengisi kantong ajaib dengan 5 benda
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234132);
        kantongAjaib.add(true);
        
        //
        kantongAjaib.set(1, "Nabil");
        kantongAjaib.remove(1);
        // menghapus tikus dari kantong ajaib
        

        // Menampilkan isi kantong ajaib
        for (int i = 0; i < kantongAjaib.size(); i++) {
                System.out.print(" "+kantongAjaib.get(i));
        }
        
        // menampilkan banyak isi kantong ajaib
        System.out.println("Kantong ajaib berisi "+ kantongAjaib.size() +" item");
        System.out.println("Keluarkan tikuss "+kantongAjaib.get(2));
        
        
        
    }

}
