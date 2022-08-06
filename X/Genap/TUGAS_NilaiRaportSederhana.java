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
public class TUGAS_NilaiRaportSederhana {

    
    public static void main(String[] args){
        int nilaiRaport;
        Scanner input = new Scanner(System.in);
    
        System.out.println("===================================");
        System.out.println("");
     
        System.out.println("Masukan Nilai Raport Mu = ");
        nilaiRaport = input.nextInt();
       
    if(nilaiRaport>=90 && nilaiRaport <=100){
         System.out.println("Predikat Kamu A");
      
    }else if(nilaiRaport>80 && nilaiRaport <=89){
         System.out.println("Predikat Kamu B");
     
    }else if(nilaiRaport>70 && nilaiRaport <=79){
         System.out.println("Predikat Kamu C");
         
    }else if(nilaiRaport>60 && nilaiRaport <=69){
         System.out.println("Predikat Kamu D");
         
    }else if(nilaiRaport>0 && nilaiRaport <=59){
         System.out.println("Predikat Kamu E");
       
         
    
    }else{
        System.out.println("Nilai Tidak Ada");
    }
  
  }
  }

 

