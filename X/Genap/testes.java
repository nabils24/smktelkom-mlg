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


//import.
import java.util.Scanner;
public class testes {

   
    public static void main(String[] args) {
        // Buat Kodingan Neng Kene Bro OKE:D
        
//        int A = 5, B = 3, C = 8;
//        
//        if(A<B){
//            if(A<C){
//                System.out.println("A");
//            }else(){
//            System.out.println("C");
//            }
//        
//        }else{
//        
//            if(B<C){
//                System.out.println("B");
//            }else{
//                System.out.println("C");
//            }
//            
//        }

//        System.out.println(4*1%3);

//        int x =5;
//        if(x++==6){
//            System.out.println("Nilai Baik Ke "+x);
//        
//        }else{
//            System.out.println("Nilai Jelek Ke "+x);
//        }

//        int x = 0, i = 1;
//        
//        while () {
//            Object nextElement = en.nextElement();
//            
//        }

//        for(int i=0; i<10; i+=3){
//        System.out.println("HLo");
//        }

//        int[] data = new int[]{3,5,6,4,2,1};
//        int total =0;
//        
//        for (int i = 0; i < data.length; i+=2) {
//            total+=data[i];
//            
//        }
//        System.out.println(total);

//        int a=50, b=35,c=105;
//        System.out.println((c-a)>=(c/b));

//double harga = 15000;
//harga = ((0.4*harga)+(0.2*harga));
//        System.out.println(harga);

//     int x=5;
//        if (x>3) {
//            System.out.println("N0");
//        }
//        if (x>=2) {
//            System.out.println("N1");
//        }
//        if (x>1) {
//            System.out.println("N2");
//        }
//        if (x>=0) {
//            System.out.println("N3");
//        }

//        for (int i = 1; i <=3; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(i+j"");
//            }
//        }


    
      
        Scanner input = new Scanner(System.in);
        String nama[] = {"Ali", "Budi", "Dani", "Edi", "Umar"};
        String gol[] = {"Weekday", "Weekend", "Holiday"};
        String cottage[] = {"Duku", "Jeruk", "Alpukat", "Jambu Air", "Durian", "Melon", "Belimbing", "Mangga", "Kedondog"};
        int id, t, a, c, hari = 0;
        
        System.out.print("ID Pelanggan      : ");
        id = input.nextInt();
        
        if(id<0||id>nama.length){
            System.out.println("DATA TIDAK DITEMUKAN");
        System.exit(0);
        
        }
        
        
        
        System.out.println("Pilihan Cottage   : ");
        System.out.println("1. Duku \t 2. Jeruk \t 3. Alpukat");
        System.out.println("4. Jambu Air \t 5. Durian \t 6. Melon");
        System.out.println("7. Belimbing \t 8. Mangga \t 9. Kedondong");
        System.out.print("Pilihan Anda     :");
        c = input.nextInt();
        
        if(c<0||c>cottage.length){
            System.out.println("DATA TIDAK DITEMUKAN");
        System.exit(0);
        
        }
        
        System.out.print("Waktu Check in   : ");
        a = input.nextInt();
        
        if(a<0||a>gol.length){
            System.out.println("DATA TIDAK DITEMUKAN");
        System.exit(0);
        
        }
        
        System.out.print("Lama menginap    : ");
        hari = input.nextInt();        

        if(hari<0){
            System.out.println("DATA TIDAK DITEMUKAN");
        System.exit(0);
        
        }
        
        System.out.println("==========================\n");
        System.out.println("ID Pelanggan   : " + id);
        System.out.println("Nama pelanggan : " + nama[id - 1]);
        System.out.println("Cottage        : " + cottage[c - 1]);
        System.out.println("Check in       : " + gol[a - 1]);
        System.out.println("Lama menginap  : " + hari + " hari");
        System.out.println("Biaya          : " + biaya(cottage[c - 1], hari, gol[a - 1]));
    }

    static int biaya(String cottage, int hari, String gol) {
        int biaya = 0;
        int harga1 = 0, harga2 = 0, harga3 = 0;
        if (cottage.equalsIgnoreCase("Duku")) {
            System.out.println("Room            : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 915000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 1025000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 1225000 * hari;
                System.out.println("Biaya          : " + harga3);
            }

        } else if (cottage.equalsIgnoreCase("Jeruk")) {
            System.out.println("Room           : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 915000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 1025000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 1225000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Alpukat")) {
            System.out.println("Room           : 1 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 575000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 695000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 895000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Jambu Air")) {
            System.out.println("Room           : 1 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 575000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 695000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 895000 * hari;
                System.out.println("Biaya          : " + harga3);
            }

        } else if (cottage.equalsIgnoreCase("Durian")) {
            System.out.println("Room            : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 595000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 715000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 915000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Melon")) {
            System.out.println("Room           : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 595000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 715000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 915000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Belimbing")) {
            System.out.println("Room           : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 495000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 575000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 755000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Mangga")) {
            System.out.println("Room           : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 495000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 575000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 755000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        } else if (cottage.equalsIgnoreCase("Kedondong")) {
            System.out.println("Room           : 2 person");
            if (gol.equalsIgnoreCase("weekday")) {
                harga1 = 495000 * hari;
                System.out.println("Biaya          : " + harga1);
            } else if (gol.equalsIgnoreCase("weekend")) {
                harga2 = 575000 * hari;
                System.out.println("Biaya          : " + harga2);
            } else if (gol.equalsIgnoreCase("holiday")) {
                harga3 = 755000 * hari;
                System.out.println("Biaya          : " + harga3);
            }
        }
        System.out.println("\n==========================");
        System.out.println("       Arigatou       ");
        System.out.println("==========================");
       
        return biaya;
    }  
}
 
