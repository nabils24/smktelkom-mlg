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

package Panji;


public class PanjiGantengsangat {
    // Buat Kodingan Neng Kene Bro OKE:D
    
    String panji,rasyid,cellin;

    public String getPanji() {
        return panji;
    }

    public void setPanji(String panji) {
        this.panji = panji;
    }

    public String getRasyid() {
        return rasyid;
    }

    public void setRasyid(String rasyid) {
        this.rasyid = rasyid;
    }

    public String getCellin() {
        return cellin;
    }

    public void setCellin(String cellin) {
        this.cellin = cellin;
    }
    
    

    public static void main(String[] args) {
        
      
    PanjiGantengsangat panji = new PanjiGantengsangat();  
        
        panji.setPanji("Kaya");
        System.out.println("Panji adalah seorang paling "+panji.getPanji());
        
        
    }
    
    
    
    
    
    
}
