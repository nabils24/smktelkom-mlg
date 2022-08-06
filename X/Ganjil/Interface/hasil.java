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

package Interface;


//import.
public class hasil {

   
    public static void main(String[] args) {
            
            line coba = new line(2.5,3,4,5);
            line pertama = new line(3,4,5,6);
            line kedua = new line (3,4,5,6); 
            coba.getLength();
            System.out.println(coba.isGreater(coba, pertama));
            System.out.println(coba.isLess(coba, pertama));
            System.out.println(coba.isEqual(coba, pertama));
            //==
            System.out.println(coba.isGreater(pertama, kedua));
            System.out.println(coba.isLess(pertama, kedua));
            System.out.println(coba.isEqual(pertama, kedua));
    }

}
