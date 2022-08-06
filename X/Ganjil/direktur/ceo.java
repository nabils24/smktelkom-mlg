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

package direktur;


public class ceo extends pegawai{
    // Buat Kodingan Neng Kene Bro OKE:D
    
     private  static  final  int  gajiCeo=90000; 
    private  static  final  int  bonusCeo=100000;

    @Override
    public  int  gaji(){ 
        return  gajiCeo;
    }
    public  int  Bonus(){
        return  bonusCeo;
    }
}
