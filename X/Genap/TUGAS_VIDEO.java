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
public class TUGAS_VIDEO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int panjangSisi1,panjangSisi2,panjangSisi3;
    
        System.out.println("==================================================");
    System.out.println("Masukan Panjang Sisi 1");
    panjangSisi1 = input.nextInt();
    System.out.println("Masukan Panjang Sisi 2");
    panjangSisi2 = input.nextInt();
    System.out.println("Masukan Panjang Sisi 3");
    panjangSisi3 = input.nextInt();
    
    if(panjangSisi1==panjangSisi2&&panjangSisi2==panjangSisi3){
        System.out.println("Ini Adalah Segitiga Sama Sisi");
    }else if(panjangSisi1==panjangSisi2){
        System.out.println("Ini Adalah Segitiga Sama Kaki");
    }else{
        System.out.println("Ini Adalah Segitiga Sembarang");
    }
    System.out.println("==================================================");
    }
    
}
