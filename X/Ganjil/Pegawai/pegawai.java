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

package Pegawai;


public class pegawai {
    // Buat Kodingan Neng Kene Bro OKE:D
    
    String nama;
    String k;
    int ID, gaji, bonus = 2 * gaji;
    String status;
    
    
    public void awal(){
    
        System.out.println("==========================");
        System.out.println("IDENTITAS PEGAWAI");
        System.out.println("==========================");
    
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setK(String k) {
        this.k = k;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
        
    public void cetak(){
        System.out.println("Nama Nya adalah = "+nama);
        System.out.println("Kelaminnya adalah = "+k);
        System.out.println("IDnya adalah = "+ID);
        System.out.println("Gaji nya adalah ="+gaji);
        System.out.println("Jika Rajin maka dapat bonus = "+gaji*2);
       
        
        
    }
}
