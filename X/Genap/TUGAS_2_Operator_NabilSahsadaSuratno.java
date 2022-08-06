    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62859
 */
public class TUGAS_2_Operator_NabilSahsadaSuratno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inisialisasi sebagai stok
        int semangka=7, jambu=3;
        double harga_semangka, harga_jambu;
        harga_semangka = 3000.2;
        harga_jambu = 2340.2;
        double total,  bayar;
        

        /*operator penugasan (pembelian yang mengurangi stok)*/ 
        jambu-=2; 
        semangka-=3;
        /* Operator Aritmatika (total barang tersedia)*/
        total=semangka+jambu;
        
    System.out.println("jumlah barang yang tersedia =" +semangka+ "+" +jambu+ 
                "=" +total);
        
        bayar= (total*harga_jambu)+(total*harga_semangka);
        //total aset yang dimiliki
        System.out.println("total aset yang dimiliki  = Rp"+bayar);    
    		}

    
}
