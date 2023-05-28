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

public class ListBuku {

    public ArrayList<Buku> list;
    private int stokdefault = 10;

    public ListBuku() {
        //init listbuku
        list = new ArrayList<Buku>();
        list.add(new Buku("Unity3d", stokdefault, 9000, 1));
        list.add(new Buku("C#", stokdefault, 10000, 2));
        list.add(new Buku("Doraemon", stokdefault, 20000, 3));
        list.add(new Buku("Sikancil", stokdefault, 15000, 4));
    }

    public void tampilBuku() {
        System.out.println("\tDaftar Buku");
        System.out.println("Judul Buku \t\tHarga Buku \tStok Buku");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getIdBuku() + " "
                    + list.get(i).getNamaBuku() + "\t\t"
                    + list.get(i).getHarga() + "\t"
                    + list.get(i).getStok());
        }
    }

    //Mencari buku if(buku==true){jalan}
    public Buku findBuku(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdBuku() == id) {
                return list.get(i);
            }
        }
        return null;
    }

    //Mengurangi stok 
    public void kurangiStok(int id, int buku) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdBuku() == id) {
                int currentStok = list.get(i).getStok();
                list.get(i).setStok(currentStok - buku);
            }
        }
    }

    //menambahstokbuku
    public void tambahStok(int id, int buku) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdBuku() == id) {
                int currentStok = list.get(i).getStok();
                list.get(i).setStok(currentStok + buku);
            }
        }
    }

    //mengambil defaul tstok
    public int getdefstok() {
        return this.stokdefault;
    }

    //Mencari nama buku berdsrkan ID
    public String getnamebuku(int id) {
        return list.get(id).getNamaBuku();
    }

    //Mintastokbuku
    public int getstok(int id) {
        return list.get(id - 1).getStok();
    }

}
