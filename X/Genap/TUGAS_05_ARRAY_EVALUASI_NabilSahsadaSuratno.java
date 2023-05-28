/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62859
 */
public class TUGAS_05_ARRAY_EVALUASI_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nama[][]={{"1","Alya","18765"},{"2","Aladin","11876"},{"3","Nala","17622"},{"4","Wawan","29988"},{"5","Setya","98765"}};
        
        for (int x=0; x<5; x++){
            
            for(int j=0; j<2; j++){
                
                for(int i=0; i<3; i++){
                System.out.println("nama: " +nama[x][0]);
                System.out.println("nama: " +nama[j][1]);
                 System.out.println("nama: " +nama[i][2]);
                System.out.println("=============");
                    }
                
                }
            }
    }
    
}
