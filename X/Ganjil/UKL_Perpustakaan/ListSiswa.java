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

public class ListSiswa {

    public ArrayList<Siswa> list;

    //Inisialisasi siswa
    public ListSiswa() {
        list = new ArrayList<Siswa>(); 
        list.add(new Siswa("Nabil", "Malang", "123456789", true, 1));//1
        list.add(new Siswa("Panji", "Bali", "123456789", true, 2));//2
        list.add(new Siswa("Samuel", "Cepu", "123456789", true, 3));//3
        list.add(new Siswa("Rasyid", "Siduarjo", "123456789", true, 4));//4
    }

    
    //menampilkan seluruh siswa 
    public void tampilSiswa() {
        System.out.println("\tDaftar Siswa");
        System.out.println("Nama Siswa \tAlamat \tTelepon \tStatus");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getIdSiswa() + " "
                    + list.get(i).getNama() + "\t"
                    + list.get(i).getAlamat() + "\t"
                    + list.get(i).getTelepon() + "\t"
                    + list.get(i).getStatus());
        }
    }

    //menampilkan siswa menurut id
    public Siswa findSiswa(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdSiswa() == id) {
                return list.get(i);
            }
        }
        return null;
    }
    //Cari nama berdasarkan ID
    public String findNamaSiswa(int id) {
        return list.get(id).getNama();
    }
    
    //ubah stat siswa
    public void setStatSiswa(int id,boolean stat) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdSiswa() == id) {
                list.get(i).setStatus(stat);
            }
        }
    }
}
