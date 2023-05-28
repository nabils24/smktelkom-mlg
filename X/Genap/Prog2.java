/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabils
 */
import java.util.Scanner;
public class Prog2 {
    //Koding 1 PROGDAS 1 "Nama"
    public static void main(String[] args)throws Exception {
       Scanner input = new Scanner(System.in);
       String Nm, Kls, Asal, Smp;
       System.out.println("PROG2");
       System.out.println("===============");
       
               
       // Tempat Input
       System.out.println("Masukan Nama Kamu");
       Nm = input.nextLine();
       System.out.println("Masukan Kelas Kamu");
       Kls = input.nextLine();
       System.out.println("Masukan Asal Kamu");
       Asal = input.nextLine();
       System.out.println("Masukan Asal SMP Kamu");
       Smp = input.nextLine();
       
       // Proses Nama,Kls,Asal,Smp
       System.out.println("----------------------------");
       System.out.println("Nama : " + Nm);
       System.out.println("Kelasmu : " + Kls);
       System.out.println("Asal Kamu : " + Asal);
       System.out.println("Asal SMP Kamu : " + Smp);
       System.out.println("----------------------------");
       
        
    }
    
}
