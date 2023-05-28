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

public class Member implements User {

    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Member(){
        this.namaMember.add("nabil");
        this.alamat.add("bunulrejo");
        this.telepon.add("082181103061");
        this.saldo.add(500000);
        
        this.namaMember.add("panji");
        this.alamat.add("dau");
        this.telepon.add("082181101223");
        this.saldo.add(500000);
   
    }
    
        public void setSaldo(int saldo){
               this.saldo.add(saldo);
        }
        public int getSaldo(int idMember){
           return this.saldo.get(idMember);
        }
        public void editSaldo(int idMember, int saldo){
            this.saldo.set(idMember, saldo);
        }
        public int getjmlMember(){
           return this.namaMember.size();
        }

    //Setter
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
    }
    public void setTelepon(String Telepon) {
        this.telepon.add(Telepon);
    }
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    //Getter
    public String getNama(int id) {
       return this.namaMember.get(id);
    }
    public String getTelepon(int id) {
       return this.telepon.get(id);
    }
    public String getAlamat(int id) {
       return this.alamat.get(id);
    }
              
        
}   
