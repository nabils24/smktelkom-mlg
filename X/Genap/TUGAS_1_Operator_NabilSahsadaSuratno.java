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
public class TUGAS_1_Operator_NabilSahsadaSuratno {

    public static void main(String[] args) {
    int x, y;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Masukan Nilai X");
    x = input.nextInt();
    System.out.println("Masukan Nilai Y");
    y = input.nextInt();
    
    System.out.println("x < y = "+(x < y));  
    System.out.println("x > y = "+(x > y));
    System.out.println("x == y = "+(x == y));
    System.out.println("x >= y = "+(x >= y));
    System.out.println("x <= y = "+(x <= y));
    System.out.println("x != y = "+(x != y));
    
    
    
    
    }
    
}
