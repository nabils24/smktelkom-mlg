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

package React;


//import.
public class tes {

   
    public static void main(String[] args) {
        // Buat Kodingan Neng Kene Bro OKE:D
        React uji1 = new React(1,1,4,4);
        React uji2 = new React(2,3,5,6);
        
        System.out.println("2,3 is inside the");
        System.out.println(uji1+" Union "+uji2+" ="+uji1.union(uji2));
        System.out.println(uji1+" Intersection "+uji2+" ="+uji1.intersection(uji2));
        System.out.println(uji1.intersection(uji2)+" Digeser sebanyak (3, 3)");
        uji1.move(3,3);
        uji2.move(3, 3);
    }

}
