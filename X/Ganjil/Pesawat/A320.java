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

package Pesawat;


public class A320 extends Boeing_737_800{
Pesawat pesawat = new Pesawat();
private int kecepatanPesawat,kecepatanUdara;
private String fasilitas;
String nama;


//Airbus A302 Series    
    public void a320(){
      pesawat.setJenisPesawat("AIRBUS A320");
      pesawat.setMesin(2);
      pesawat.setJmlhPenumpang(200);
    }
    
     public void a320(int kecepatanUdara){
        this.kecepatanUdara = kecepatanUdara;
           
    }
    
@Override
    public void kelebihan(int kecepatan, String fasilitas){
        this.kecepatanPesawat = kecepatan;
        this.fasilitas = fasilitas;        
    }
  
    public void get(){
        System.out.println("=============================================="+pesawat.getJenisPesawat()+"================================================");
        System.out.println("Jenis Pesawat Ini adalah \t\t= "+pesawat.getJenisPesawat());
        System.out.println("Pesawat Ini memiliki \t\t= "+pesawat.getMesin()+" Mesin");
        System.out.println("Pesawat Ini Memilki Jenis Mesin \t= "+super.jenisMesin);
        System.out.println("Pesawat Ini memiliki kursi sejumlah \t= "+pesawat.getJmlhPenumpang());
        System.out.println("Pesawat Ini memiliki kecepatan diudara adalah \t= "+this.kecepatanUdara);
        System.out.println("Pesawat Ini memiliki kecepetan didarat adalah \t= "+this.kecepatanPesawat);
        System.out.println("Pesawat Ini memiliki fasilitas yaitu \t= "+this.fasilitas);
        System.out.println("==============================================================================================");
    }
    


    
}
