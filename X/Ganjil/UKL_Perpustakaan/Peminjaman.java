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


public class Peminjaman {
    private Siswa selectedSiswa;
    private Buku selectedBuku;
    private int banyak;
    private int idbuku;

    public Siswa getSelectedSiswa() {
        return selectedSiswa;
    }

    public void setSelectedSiswa(Siswa selectedSiswa) {
        this.selectedSiswa = selectedSiswa;
    }

    public Buku getSelectedBuku() {
        return selectedBuku;
    }

    public void setSelectedBuku(Buku selectedBuku) {
        this.selectedBuku = selectedBuku;
    }

    public int getBanyak() {
        return banyak;
    }

    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }
    
    public int getidbuku(){
        return idbuku;
    }
    
    
    public Peminjaman(Siswa selectedSiswa, Buku selectedBuku, int banyak, int idbuk) {
        this.selectedSiswa = selectedSiswa;
        this.selectedBuku = selectedBuku;
        this.banyak = banyak;
        this.idbuku = idbuk;
    }
    
    
}
