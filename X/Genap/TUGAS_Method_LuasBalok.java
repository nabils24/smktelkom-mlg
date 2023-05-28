/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62859
 */
public class TUGAS_Method_LuasBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int s= 5;
        int p= 20;
        int l=s;
        int luas= luasBalok (p, s, l);
        System.out.println("Hasilnya Adalah "+luas+" m2");
      
    }
    //membuat fungsi luasP()
    static int luasPersegi(int sisi) {
        return sisi * sisi*2;
    }
     //membuat fungsi luasPP()
    static int luasPP ( int panjang, int lebar) {
        
        return lebar *panjang *4;
    }
    //membuat fungsi LB
    static int luasBalok (int panjang, int sisi, int lebar){
        
      return luasPersegi(sisi)+luasPP(lebar, panjang);
              }
}
