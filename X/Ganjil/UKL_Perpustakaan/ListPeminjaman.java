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


public class ListPeminjaman {
    public ArrayList<Peminjaman> list;

    public ListPeminjaman() {
        list = new ArrayList<Peminjaman>();
    }
    
    public void tambahPeminjaman(Siswa siswa, Buku buku, int banyak, int idbuk){
        list.add(new Peminjaman(siswa, buku, banyak,idbuk));
        
    }
    public void kurangPeminjaman(int idsiswa){
        list.remove(idsiswa);
        
    }
    public void tampilPeminjaman(){
        System.out.println("\tDaftar Peminjaman : ");
        System.out.println("Nama Siswa \tNama Buku \tJumlah Buku \tidbuku");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSelectedSiswa().getNama()+"\t"+
                    list.get(i).getSelectedBuku().getNamaBuku()+"\t"+
                    list.get(i).getBanyak()+"\t"+list.get(i).getidbuku());
        }
    }
    public void setbanyakpinjamanbuk(int id, int banyakbuk){
        list.get(id).setBanyak(banyakbuk);
    }
                                    
    
    public int getbanyakpinjamanbuku(int id){
        return list.get(id).getBanyak();
    }
    
    public int getidpinjam(int idsiswa){
       return list.get(idsiswa-1).getidbuku(); 
    }
    
}
