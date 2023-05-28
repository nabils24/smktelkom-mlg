/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62859
 */
public class TUGAS_Method_LuasLimasSegitiga {

    /**
     * @param args the command line arguments
     */
    //1/2*t
    static int segitiga(int t, int a){
        return a*t*1/2;
    }     
    static int limas(int t, int a){
    
        return 4*segitiga(t, a);
        
    }
    public static void main(String[] args) {
        int a=10;
        int t=5;
        int limas = limas(t, a);
        System.out.println(limas);
        
        
    }
    
}
