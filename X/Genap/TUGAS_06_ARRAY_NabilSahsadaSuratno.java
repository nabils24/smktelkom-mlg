/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62859
 */
import java.io.*;
public class TUGAS_06_ARRAY_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       
        int baris, kolom, nilai;
        int A[][]=new int[5][5];
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("INPUT NILAI MATRIKS");
        System.out.println("===================");
        for(baris=1; baris<5; baris++){
            
            for(kolom=1; kolom<5; kolom++){
            System.out.println("Nilai A["+baris+"]["+kolom+"]adalah:");
            nilai = Integer.parseInt(br.readLine());
            
            A[baris][kolom]=nilai;
            }
            System.out.println(" ");
        }
        System.out.println("OUTPUT METRIK");
        System.out.println("--------------");
        
        for(baris =0; baris<A.length; baris++){
            
           for(kolom=0; kolom<A[0].length; kolom++){
           
               System.out.print(A[baris][kolom]+"\t");
           }
            System.out.println(" ");
        }
        }
        
    }
    

