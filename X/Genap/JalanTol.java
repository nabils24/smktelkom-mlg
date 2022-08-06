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


import java.util.Scanner;
public class JalanTol {

    
    static int hitung(String ruasMasuk ,String ruasKeluar,int gol){
    int hitung=0;
    int biaya=0;
    if(ruasMasuk.equalsIgnoreCase("WARU")){//1
        if(ruasKeluar.equalsIgnoreCase("SIDUARJO")){
            if(gol==1){
                biaya=6000; 
            }else if(gol==2){
                biaya=9000;
            }else if(gol==3){
                biaya=9000;
            }
    }   else if(ruasKeluar.equalsIgnoreCase("PORONG")){
            if(gol==1){
                biaya=9000; 
            }else if(gol==2){
                biaya=14000;
            }else if(gol==3){
                biaya=14000;
            }
    }
    
    }else if(ruasMasuk.equalsIgnoreCase("SIDUARJO")){//2
        if(ruasKeluar.equalsIgnoreCase("WARU")){
            if(gol==1){
                biaya=6000; 
            }else if(gol==2){
                biaya=9000;
            }else if(gol==3){
                biaya=9000;
            }
    }   else if(ruasKeluar.equalsIgnoreCase("PORONG")){
            if(gol==1){
                biaya=5500; 
            }else if(gol==2){
                biaya=8500;
            }else if(gol==3){
                biaya=8500;
            }
    }
    }else if(ruasMasuk.equalsIgnoreCase("PORONG")){//3
        if(ruasKeluar.equalsIgnoreCase("SIDOARJO")){
            if(gol==1){
                biaya=5500; 
            }else if(gol==2){
                biaya=8500;
            }else if(gol==3){
                biaya=8500;
            }
    }   else if(ruasKeluar.equalsIgnoreCase("WARU")){
            if(gol==1){
                biaya=14000; 
            }else if(gol==2){
                biaya=9000;
            }else if(gol==3){
                biaya=9000;
            }
    }
    }
    
    
    return biaya;
    }
    
   
    public static void main(String[] args) {
        // Buat Kodingan Neng Kene Bro OKE:D
        
        // AHAHHAHAHAHHAHAH
        // Asui aku gangertiiiii
        
        //Oke Kita buat Program jalan tol ya:D
        Scanner input  = new Scanner(System.in);
        
        
        String ruasMsk[] = {"Waru","Siduarjo","Porong"};
        String ruasklr[] = {"Waru","Siduarjo","Porong"};
        String kndaraan[] = {"Sedan","Truk 2 SUMBU Roda","Truk 3 SUMBU Roda"};
        
        
        System.out.println("******************PROGRAM JALAN TOL*******************");
        
        System.out.println("=====================================================");
        System.out.println("Masukan ID Masuk");
        int msk = input.nextInt();
        
        System.out.println("Masukan ID Keluar");
        int klr = input.nextInt();
        if(ruasklr[klr-1]==ruasMsk[msk-1]){
            System.out.println("Ruas TOl Tidak Boleh Sama!!");
            System.exit(0);
        }
        
        System.out.println("Masukan Golongan Kendaraan");
        int gol = input.nextInt();
        
        System.out.println("\n");
        //=====================================OUTPUT=========================================//
        
        System.out.println("ID Asal = "+ruasMsk[msk-1]);
        System.out.println("ID Tujuan = "+ruasklr[klr-1]);
        System.out.println("Golongan Kendaraan = "+kndaraan[gol-1]+" "+gol);
        System.out.println("Biaya Pembayaran = "+hitung(ruasMsk[msk-1], ruasklr[klr-1], gol));
        
        
    }

}
