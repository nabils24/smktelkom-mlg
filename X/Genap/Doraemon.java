/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62859
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Doraemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList kantongAjaib = new ArrayList();
        Scanner input = new Scanner(System.in);
        
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("Mesin Waktu");
        
        System.out.println("Masukan Nilai Yang Mau Di Input");
        kantongAjaib.add(input.next());
        
        
        
        System.out.println(kantongAjaib);
    }
    
}
