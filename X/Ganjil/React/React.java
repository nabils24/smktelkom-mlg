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


public class React {
    // Buat Kodingan Neng Kene Bro OKE:D
    public int x1, y1, x2, y2;
    
    public React(int x1, int  y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;    
        this.x2 = x2;
        this.y2 = y2;
    }
    public React(int width, int height){
        this(0, 0,width, height);
    
    }
    public React(){
        this(0, 0, 0, 0);
    }
    public void move(int deltax,int deltay){
        x1 += deltax; x2 += deltax;
        y1 += deltay; y2 += deltay;
    }
    public boolean isInside(int x, int y){
        return ((x >= x1)&&(x <= x2)&&(y >= y1)&&(y <= y2));
    }
    public React union(React r){
        return new React
        (   (this.x1 < r.x1) ? this.x1 : r.x1,
            (this.y1 < r.y1) ? this.y1 : r.y1,
            (this.x2 > r.x2) ? this.x2 : r.x2,
            (this.y2 > r.y2) ? this.y2 : r.y2);
    
    }
    public React intersection(React r){
        React result = new React(
            (this.x1 > r.x1) ? this.x1 : r.x1,
            (this.y1 > r.y1) ? this.y1 : r.y1,
            (this.x2 < r.x2) ? this.x2 : r.x2,
            (this.y2 < r.y2) ? this.y2 : r.y2);
        
    
        if(result.x1 > result.x2){
            result.x1 = result.x2 = 0;
        }
        if(result.y1 > result.y2){
            result.y1 = result.y2=0;
        }
        
        return result;
    }
}
