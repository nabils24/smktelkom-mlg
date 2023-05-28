/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabil
 */

import java.util.Scanner;
public class Tugas_KASIR {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaToko, namaBarang;
        int harga, total, qty, uB, kembalian;
        
        
        System.out.println("Masukan Nama Toko Anda : ");
        namaToko = input.next();
        System.out.println("Toko "+namaToko);
        //Input Barang
        System.out.println("Masukan Nama Barang ");
        namaBarang = input.next();
        System.out.println("Masukan Harga Barang ");
        harga = input.nextInt();
        System.out.println("Masukan Jumlah Barang ");
        qty = input.nextInt();
        System.out.println("Masukan Uang ");
        uB = input.nextInt();
        //Menghitung uang
        total = harga*qty;
        kembalian = total-uB;
        //Output
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Total Pembelian : "+total);
        System.out.println("Kembalian Pembelian :"+kembalian);    
        
    }
    
}
