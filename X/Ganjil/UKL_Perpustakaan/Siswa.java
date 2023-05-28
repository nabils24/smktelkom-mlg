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


public class Siswa implements Interface{

    private String namaSiswa;
    private String alamat;
    private String telepon;
    private Boolean status;
    private int idbuku;
    private int idSiswa;

    public Siswa(String namaSiswa, String alamat, String telepon, Boolean status,int idSiswa) {
        this.namaSiswa = namaSiswa;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status;
        this.idSiswa = idSiswa;
        this.idbuku = idbuku;
    }
    
    

    public int getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(int idSiswa) {
        this.idSiswa = idSiswa;
    }

    @Override
    public String getNama() {
        return namaSiswa;
    }

    @Override
    public void setNama(String namaSiswa) {
        this.namaSiswa = namaSiswa;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
   
    
}
