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


public class staf extends pegawai{
    // Buat Kodingan Neng Kene Bro OKE:D
    
    private  static  final  int  gajiStaf=50000; 
    private  static  final  int  bonusStaf=10000;

    @Override
    public  int  gaji(){ 
        return  gajiStaf;
    }
    public  int  Bonus(){
        return  bonusStaf;
    }


    
}
