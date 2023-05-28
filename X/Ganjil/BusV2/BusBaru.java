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

package BusV2;


//import.
public class BusBaru {

   
    private int penumpang, maxPenumpang, counter, cekBerat;
    
    public BusBaru(int maxPenumpang){
        this.maxPenumpang=maxPenumpang;
        penumpang = 0;
    }

  
   
    public void tambahPenumpang(int penumpang){
        int tambah;
        tambah=this.penumpang;
        if (tambah>=maxPenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=tambah;   
        }
    }

   public void ckberat(int penumpang){
       int tambah;
       tambah=this.penumpang+penumpang;
       if(penumpang>=8){
           System.out.println("Bus Terlalu Berat");
           this.penumpang=tambah;
       }else if(penumpang<=8){
           System.out.println("Aman");
           this.penumpang=tambah;
       } 
   }
    
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxPenumpang);
    }

}