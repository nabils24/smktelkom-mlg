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


public class dahanyatsu implements Mobil{
    // Buat Kodingan Neng Kene Bro OKE:D
   
    private int speed;
    private boolean isPowerOn;
    private int MAX_SPEED = 120,MIN_SPEED = 0;
    
    public dahanyatsu() {
        // set volume awal
        this.speed = 0;
    }

    
    @Override
    public void engineOn() {
        isPowerOn = true;
        System.out.println("Mobil Menyala");
        System.out.println("Selamat datang dimobil dahanyatsu");
    }

    
    @Override
    public void engineOff() {
        isPowerOn = false;
        System.out.println("Mobil Mati");
    }

  
    public void speedUp() {
        if (isPowerOn) {
            if (this.speed == MAX_SPEED ) {
                System.out.println("Speed Sudah MAKS!!");
                System.out.println("sudah " + this.getSpeed()+ "%");
            } else {
                this.speed += 10;
                System.out.println("Speed Sekarang adalah : " + this.getSpeed());
            }
        } else {
            System.out.println("Nyalakan mesin terlebih dahulu");
        }
    }

   
    public void speedDown() {
        if (isPowerOn) {
            if (this.speed == MIN_SPEED) {
                System.out.println("sudah  = 0%");
            } else {
                this.speed -= 10;
                System.out.println("Speed Sekarang adalah: " + this.getSpeed());
            }
        } else {
            System.out.println("Nyalakan mesin terlebih dahulu");
        }
    }

    public int getSpeed() {
        return this.speed;
    }
    
}
