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

package Bola;


//import.
public class UjiBola {

   
    public static void main(String[] args) {
      
        Bola rumusbola = new Bola();
        
        rumusbola.setJari(20);
        
        System.err.println("Jari Jarinya adalah              = "+rumusbola.getJari());
        System.out.println("Diameter Bola adalah             = "+rumusbola.showdiameter());
        System.out.println("Luas Permukaan Bola adalah       = "+rumusbola.showluasPermukaan());
        System.out.println("volume Bola adalah               = "+rumusbola.showvolumme());
        
        
        
        
    }

}
