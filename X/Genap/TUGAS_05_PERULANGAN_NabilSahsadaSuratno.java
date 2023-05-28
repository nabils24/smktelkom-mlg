/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62859
 */
import java.util.Scanner;
public class TUGAS_05_PERULANGAN_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int banyakSiswa;
     String nama;
      Scanner input = new Scanner(System.in);
        System.out.println("Masukan Banyak Siswa");
        banyakSiswa=input.nextInt();
        
        for(int siswa=1; siswa<=banyakSiswa; siswa++){
            System.out.println("Masukan Nama "+siswa);
            nama = input.next();
            
        
            
            
        }
        
      
    }
    
}
