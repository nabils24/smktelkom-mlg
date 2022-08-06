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

package aplikasitokoonlineKelontong;

import java.util.ArrayList;
public class Karyawan implements User{
    // Buat Kodingan Neng Kene Bro OKE:D
    
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    
    public Karyawan(){
        this.namaKaryawan.add("rasyid");
        this.alamat.add("bunulrejo");
        this.telepon.add("082181103061");
        this.jabatan.add(0);
    
    }
        public void setJabatan(int jabatan){
               this.jabatan.add(jabatan);
        }
        public int getJabatan(int jabatan){
             return this.jabatan.get(jabatan);
        }
        
        //Setter
        public void setNama(String Nama){
                this.telepon.add(Nama);
        }
        public void setTelepon(String Telepon){
                this.telepon.add(Telepon);
        }
        public void setAlamat(String Alamat){
                this.telepon.add(Alamat);
        }
        public void setnamaKaryawan(String nmKaryawan){
                this.telepon.add(nmKaryawan);
        }
        
        
        //Getter
        public int getJmlKaryawan(){
            return this.namaKaryawan.size();
        }
        public String getNama(int id){
                return this.getTelepon(id);
        }
        public String getTelepon(int id){
                return this.getTelepon(id);
        }
        public String getAlamat(int id){
                return this.getAlamat(id);
        }
        public String getnamaKaryawan(int id){
                return this.getnamaKaryawan(id);
        }
    
}
