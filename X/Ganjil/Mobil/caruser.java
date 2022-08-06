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

package Mobil;


public class caruser {
    // Buat Kodingan Neng Kene Bro OKE:D
    
    private Mobil mobil;

    public caruser(Mobil mobil) {
        this.mobil = mobil;
    }
    
    void turnOnCar(){
        this.mobil.engineOn();
    }
    
    void turnOffCar(){
        this.mobil.engineOff();
    }
    
    void speedUp(){
        this.mobil.speedUp();
    }
    
    void speedDown(){
        this.mobil.speedDown();
    }
}
