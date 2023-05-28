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

package UKL_Perpustakaan;

import java.util.ArrayList;


public class ListPetugas {

    public ArrayList<Petugas> list;

    //Inisialisasi List Petugas
    public ListPetugas() {
        list = new ArrayList<Petugas>(); 
        
        list.add(new Petugas("Nabil", "Malang", "123456789", 1));//1
        list.add(new Petugas("Agas", "Surabaya", "123456789", 2));//2
    }
    
    //tampil for loop petugas
    public void tampilPetugas() {
        System.out.println("\tDaftar Petugas");
        System.out.println("Nama Petugas \tAlamat \tTelepon");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getIdPetugas()+" "+
                    list.get(i).getNama()+"\t"+
                    list.get(i).getAlamat()+"\t"+
                    list.get(i).getTelepon());
        }
        System.out.println("");  
    }
}
