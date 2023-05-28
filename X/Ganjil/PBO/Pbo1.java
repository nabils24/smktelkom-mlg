package PBO;

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


//import.
public class Pbo1 {
    
    //variable
     String namaku = "nabil";
     int nomor = 1;
     char cars = 'a';
    
    //method
    public String halo(String nama){
    return nama;
    }
    
    //Public main 
    public static void main(String[] args) {
        //Atribut dalam class main
        String nama = "nabil";
        int angka = 1;
        char car2 = 'a';
        //Object
        Pbo1 object = new Pbo1();
        System.out.println("Nama saya "+object.halo("nabil"));
    }
        //Constructor
       public void Pbo1 (String namasaya){
           System.out.println(namasaya);
       }
        
        
        
}
