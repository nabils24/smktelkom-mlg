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
public class Tugas_Evaluasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int nilai;
    String predikat=null;
    System.out.println("Masukan Nilai");
    nilai = input.nextInt();
    
    if(nilai<0 || nilai>100){
        System.out.println("Nilai Diluar Batas");
    }
    if(nilai>=96 || nilai >=100){
        System.out.println("Predikat Mu Adalah A");
    }else if(nilai>=91 || nilai == 95){
    System.out.println("Predikat Mu Adalah A-");
    }
    }
    
}
