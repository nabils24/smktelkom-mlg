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
public class Volume_Bola { 
        public static void main(String[] args) 
        
        {
            System.out.println("Masukkan jari-jari bola : ");
            Scanner input = new Scanner(System.in); 
            int jari = input.nextInt();
            
            System.out.println("Volume bola adalah " + jari*jari*jari*22/7*4/3);
        }
    }
