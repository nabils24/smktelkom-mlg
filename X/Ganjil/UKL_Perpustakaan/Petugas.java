
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


public class Petugas implements Interface{
    private String namaKaryawan;
    private String alamat;
    private String telepon;
    private int idPetugas;

    public Petugas(String namaKaryawan, String alamat, String telepon, int idPetugas) {
        this.namaKaryawan = namaKaryawan;
        this.alamat = alamat;
        this.telepon = telepon;
        this.idPetugas = idPetugas;
    }

    @Override
    public String getNama() {
        return namaKaryawan;
    }

    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String getTelepon() {
        return telepon;
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public int getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(int idPetugas) {
        this.idPetugas = idPetugas;
    }
   
    
}
