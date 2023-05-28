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

package polimhorphose;


public class aeroplan extends vehicle{
    // Buat Kodingan Neng Kene Bro OKE:D
    @Override
    public  void  walk(){ 
        System.out.println("Aeroplan  Flying");
    }
    @Override
    public void fuel(){
        System.out.println("fuels");
    }
    public static void main(String[] args) {
        aeroplan  garuda  =  new  aeroplan(); 
        garuda.function();
        garuda.fuel(); 
        garuda.walk();

    }

  
}
