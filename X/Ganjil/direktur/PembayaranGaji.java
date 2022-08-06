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

package direktur;


public class PembayaranGaji {
    // Buat Kodingan Neng Kene Bro OKE:D
    
public  int  hitungGaji(pegawai peg){ 
    int  uang  =  peg.gaji();
    if  (peg  instanceof  Direktur) uang+=((Direktur)peg).tunjangan();

    if  (peg  instanceof  staf) uang+=((staf)peg).Bonus();
    
    if  (peg  instanceof  ceo) uang+=((ceo)peg).Bonus();

    return  uang;
}
public  static  void  main(String[]  args)  { 
    PembayaranGaji  pg  =  new  PembayaranGaji(); 
    staf ali = new staf();
    Direktur  Tony  =  new  Direktur(); 
    ceo Nabil = new ceo();
    System.out.println("Nama Staf = Ali");
    System.out.println("gaji  staf  =  "+pg.hitungGaji(ali));
    System.out.println("Nama Direktur = Tony");
    System.out.println("gaji  direktur  =  "+pg.hitungGaji(Tony));
    System.out.println("Nama CEO =  Nabil");
    System.out.println("gaji CEO = "+pg.hitungGaji(Nabil));
}

    
    
}
