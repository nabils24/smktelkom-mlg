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
class line implements Relation {
    private double  x1;
    private double  x2;
    private double  y1;
    private double  y2;
    
    public line (double x1,double x2,double y1,double y2){ //Ini Constructor
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    
    //X1 = 4
    //X2 = 2
    //Y1 = 3
    //Y2 = 6
  
    //RMs1 = -4
    //rms2 = -9
    //Hasil = -13
    
    public double getLength(){     
        double length=Math.sqrt((x1-x2)*(x2-x1)+(y2-y1)*(y2-y1));
        return length;
    }
    
    @Override
    public boolean isGreater(Object a, Object b){
        double aLen=((line)a).getLength();
        double bLen=((line)b).getLength();
        return (aLen>bLen);
    }
    @Override
    public boolean isLess(Object a, Object b){
        double aLen=((line)a).getLength();
        double bLen=((line)b).getLength();
        return (aLen<bLen);
    }
    @Override
    public boolean isEqual(Object a, Object b){
        double aLen=((line)a).getLength();
        double bLen=((line)b).getLength();
        return (aLen==bLen);
    }


}
