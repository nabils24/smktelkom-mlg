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



public class Bola {

   
    private double phi = 3.14 , jari, diameter, luasPermukaan, volume;
    
    public double getJari(){
        return jari;
    }
    
    
    public void setJari(double newjari){
        jari = newjari;
    }
    
    public double showdiameter(){
    
        diameter = jari * 2;
    
        return diameter;
    }
    
    public double showluasPermukaan(){
    
        luasPermukaan = 4 * phi * jari * 2; 
    
        return luasPermukaan;
    }
    
    public double showvolumme(){
    
        volume =  4/3 * phi * jari * 3; 
    
        return volume;
    }

}
