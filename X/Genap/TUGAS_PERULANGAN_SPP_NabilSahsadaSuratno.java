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

public class TUGAS_PERULANGAN_SPP_NabilSahsadaSuratno {

    
    public static void nomer1() {
    
    
        int a = 5;
        int b = 3;
        int n = 10;
        int u = a;
        int s = a;
        System.out.println("Deret Aritmatikanya adalah");
        for (int i = 0; i < n; i++) {            
            System.out.println(u);
            u = u + b;
            s = s + u;            
        }
        s = s - u;
        System.out.println("Jumlah Deret Aritmatikanya adalah " + s);  
 
           
        }
      
    static String kategori(int pendpatan){
    String kategori="";
    
    if(pendpatan>10000000){
      kategori="C";
    }else if(pendpatan>=2000000){
       kategori="B";
    }else if(pendpatan<2000000){
        kategori ="A";
    }
    
    return kategori;
    }
    
    static int biaya(String jalur, String kategori, int bulan){
    
    int biaya=0;
    if(jalur.equalsIgnoreCase("SBMPTN")){
        if(kategori.equalsIgnoreCase("A")){
            biaya = 5000000 + (500000*bulan);
        }else if(kategori.equalsIgnoreCase("B")){
            biaya = 15000000 + (1000000*bulan);
        }else if(kategori.equalsIgnoreCase("C")){
             biaya = 30000000 + (500000*bulan);
        }
    }else if(jalur.equalsIgnoreCase("SNMPTM")){
    
        if(kategori.equalsIgnoreCase("A")){
            biaya = 7000000 + (500000*bulan);
        }else if(kategori.equalsIgnoreCase("B")){
            biaya = 17000000 + (1000000*bulan);
        }else if(kategori.equalsIgnoreCase("C")){
             biaya = 35000000 + (2000000*bulan);
        }
        
    }else if(jalur.equalsIgnoreCase("MANDIRI")){
    if(kategori.equalsIgnoreCase("A")){
            biaya = 10000000 + (1000000*bulan);
        }else if(kategori.equalsIgnoreCase("B")){
            biaya = 25000000 + (2000000*bulan);
        }else if(kategori.equalsIgnoreCase("C")){
             biaya = 50000000 + (3000000*bulan);
        }
    }
    
        
    return biaya;
    }
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
     
     String namaMahasiswa[] = {"Mira","Nina","Oemar","Pena"};
     String jalur[] = {"SBMPTN","SNMPTM","Mandiri","SBMPTN"};
     String Alamat[] = {"Sawojajar","Kedung Kandang","Ijen","Dinoyo"};
     
     
        System.out.println("=================================================");
     System.out.println("Masukan ID Mahasiswa");
        int id = input.nextInt();
        
        if(id<1||id>namaMahasiswa.length){
            System.out.println("Data Not Found");
            System.exit(0);
        }
        System.out.println("Masukan Pendapatan OrangTua");
        int pendpatan = input.nextInt();
        
        System.out.println("Masukan Bulan Bayar");
        int blnBayar = input.nextInt();
        
        System.out.println("\n================================================");
        System.out.println("ID = "+id);
        System.out.println("Nama Mahasiswa = "+namaMahasiswa[id-1]);
        System.out.println("Alamat Mahasiswa = "+Alamat[id-1]);
        System.out.println("Jalur Masuk Mahasiswa = "+jalur[id-1]);
        System.out.println("Kategori Pendapatan = "+kategori(pendpatan));
        System.out.println("Jumlah Biaya = "+biaya(jalur[id-1],kategori(pendpatan),blnBayar));
        
        
        
        
        
    }

}
