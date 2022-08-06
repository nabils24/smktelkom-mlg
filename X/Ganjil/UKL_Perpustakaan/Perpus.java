// __  __            __           ___                     
///\ \/\ \          /\ \      __ /\_ \                    
//\ \ `\\ \     __  \ \ \____/\_\\//\ \     ____    ____  
// \ \ , ` \  /'__`\ \ \ '__`\/\ \ \ \ \   /',__\  /',__\ 
//  \ \ \`\ \/\ \L\.\_\ \ \L\ \ \ \ \_\ \_/\__, `\/\__, `\
//   \ \_\ \_\ \__/.\_\\ \_,__/\ \_\/\____\/\____/\/\____/
//    \/_/\/_/\/__/\/_/ \/___/  \/_/\/____/\/___/  \/___/  /___
///////////////////////////////////
//Author : Nabil Sahsada Suratno///
//Mode : Java Main Class        ///
//Youtube : NabilGames          ///
///////////////////////////////////
package UKL_Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpus {

    public static void main(String[] args) {

        boolean stay = true;
        Scanner input = new Scanner(System.in);

        //buat object
        ListSiswa daftarSiswa = new ListSiswa();
        ListPetugas daftarPetugas = new ListPetugas();
        ListBuku daftarBuku = new ListBuku();
        ListPeminjaman dafPeminjaman = new ListPeminjaman();

        while (stay) {
            System.out.println("");
            System.out.println("\t==========Aplikasi Perpus System Made By Nabil==========");
            System.out.println("");
            System.out.println("1. Tampilkan Siswa");
            System.out.println("2. Tampilkan Petugas");
            System.out.println("3. Tampilkan Buku");
            System.out.println("4. Tampilkan Peminjaman");
            System.out.println("5. Menu Peminjaman");
            System.out.println("6. Menu Pengembalian");
            System.out.println("7. Exit|Keluar");
            System.out.println("");
            System.out.println("pilih menu");
            int pilihan = input.nextInt();
            if (pilihan == 1) {

                daftarSiswa.tampilSiswa();
            } else if (pilihan == 2) {

                daftarPetugas.tampilPetugas();
            } else if (pilihan == 3) {

                daftarBuku.tampilBuku();
            } else if (pilihan == 4) {
                dafPeminjaman.tampilPeminjaman();
            } else if (pilihan == 5) {
                System.out.println("Masukkan id Siswa : ");
                int selectedIdSiswa = input.nextInt();
                Siswa selectedSiswa = daftarSiswa.findSiswa(selectedIdSiswa);
                if (selectedSiswa != null) {
                    // jika ditemukan siswa berdasarkan id yg dimasukkan
                    if (selectedSiswa.getStatus() == true) {
                        System.out.println("Masukkan jumlah buku yang akan dipinjam");
                        int jumlahBuku = input.nextInt();

                        //tampil list buku
                        daftarBuku.tampilBuku();
                        System.out.println("");
                        // loop sejumlah buku yg akan dipinjam
                        System.out.println("Masukkan id buku = ");
                        int selectedIdBukuPinjam = input.nextInt();
                        Buku selectedBuku = daftarBuku.findBuku(selectedIdBukuPinjam);
                        // jika buku ditemukan berdasarkan id buku
                        if (selectedBuku != null) {
                            //Cek Stok
                            if (daftarBuku.getstok(selectedIdBukuPinjam) > jumlahBuku) {
                                // add pemimjam => daftar peminjaman
                                dafPeminjaman.tambahPeminjaman(selectedSiswa, selectedBuku, jumlahBuku, selectedIdBukuPinjam);
                                // mengurangi stok buku => buku(id)
                                daftarBuku.kurangiStok(selectedIdBukuPinjam, jumlahBuku);
                                // true status siswa
                                daftarSiswa.setStatSiswa(selectedIdSiswa, false);
                                // tampil list peminjaman
                                dafPeminjaman.tampilPeminjaman();
                            } else if (jumlahBuku > daftarBuku.getstok(selectedIdBukuPinjam) || daftarBuku.getstok(selectedIdBukuPinjam) == 0) {
                                System.err.println("Stok Kurang/Habis");
                            } else {
                                // add pemimjam => daftar peminjaman
                                dafPeminjaman.tambahPeminjaman(selectedSiswa, selectedBuku, jumlahBuku, selectedIdBukuPinjam);
                                // mengurangi stok buku => buku(id)
                                daftarBuku.kurangiStok(selectedIdBukuPinjam, jumlahBuku);
                                // true status siswa
                                daftarSiswa.setStatSiswa(selectedIdSiswa, false);
                                // tampil list peminjaman
                                dafPeminjaman.tampilPeminjaman();
                            }
                        }
                    } else {
                        // jika status siswa tidak aktif
                        System.err.println("Siswa tidak diperkenankan meminjam buku");
                    }
                } else {
                    // jika tidak ditemukan siswa berdasarkan id yg dimasukkan 
                    System.err.println("Siswa dengan id " + selectedIdSiswa + " tidak ditemukan");
                }
            } else if (pilihan == 6) {
                //Pengembalian
                System.out.println("Masukkan id Siswa : ");
                int selectedIdSiswa = input.nextInt();
                Siswa selectedSiswa = daftarSiswa.findSiswa(selectedIdSiswa);
                if (selectedSiswa != null) {
                    if (selectedSiswa.getStatus() == false) {
                        // jika status siswa aktif
                        System.out.println("Masukkan jumlah buku yang akan dikembalikan");
                        int jumlahBuku = input.nextInt();
                        System.out.println("");
                        // id buku
                        System.out.println("Masukkan id buku = ");
                        int selectedIdBukuKembali = input.nextInt();
                        Buku selectedBuku = daftarBuku.findBuku(selectedIdBukuKembali);
                        if (dafPeminjaman.getidpinjam(selectedIdSiswa) != selectedIdBukuKembali) {
                            System.err.println("Buku yang dipinjam salah!");
                        } else if (dafPeminjaman.getidpinjam(selectedIdSiswa) == selectedIdBukuKembali) {
                            // jika buku ditemukan berdasarkan id buku
                            if (selectedBuku != null) {
                                if (dafPeminjaman.getbanyakpinjamanbuku(selectedIdSiswa - 1) >= 0) {
                                    // menambah stok buku => buku(id)
                                    daftarBuku.tambahStok(selectedIdBukuKembali, jumlahBuku);
                                    if (daftarBuku.getstok(selectedIdBukuKembali) > daftarBuku.getdefstok()) {
                                        daftarBuku.kurangiStok(selectedIdBukuKembali, jumlahBuku);
                                        System.err.println("Jumlah buku kelebihan");
                                    } else {
                                        //mengurangipinjamanbuku
                                        dafPeminjaman.setbanyakpinjamanbuk(selectedIdSiswa - 1, dafPeminjaman.getbanyakpinjamanbuku(selectedIdSiswa - 1) - jumlahBuku);
                                        //Cekkembali
                                        if (dafPeminjaman.getbanyakpinjamanbuku(selectedIdSiswa - 1) < 0) {
                                            dafPeminjaman.setbanyakpinjamanbuk(selectedIdSiswa - 1, 0);
                                        }
                                        if (dafPeminjaman.getbanyakpinjamanbuku(selectedIdSiswa - 1) == 0) {
                                            // Hapus pemimjam => daftar peminjaman
                                            dafPeminjaman.kurangPeminjaman(selectedIdSiswa - 1);
                                            // false status siswa
                                            daftarSiswa.setStatSiswa(selectedIdSiswa, true);
                                            //
                                            System.out.println("BERHASIL Mengembalikan buku | Nama buku : " + daftarBuku.getnamebuku(selectedIdBukuKembali - 1) + " | id : " + daftarSiswa.findNamaSiswa(selectedIdSiswa - 1) + " | STATUS PINJAMAN : Tidak meminjam");

                                        } else {
                                            //
                                            System.out.println("BERHASIL Mengembalikan buku | Nama buku : " + daftarBuku.getnamebuku(selectedIdBukuKembali - 1) + " | id : " + daftarSiswa.findNamaSiswa(selectedIdSiswa - 1) + " | Buku Tersisa " + dafPeminjaman.getbanyakpinjamanbuku(selectedIdSiswa - 1) + " | STATUS PINJAMAN : Sedang meminjam");
                                        }
                                    }

                                }

                            }
                        }
                        //batas
                    } else {
                        // jika status siswa tidak aktif
                        System.err.println("Siswa tidak diperkenankan mengembalikan buku");
                    }
                } else {
                    // jika tidak ditemukan siswa berdasarkan id yg dimasukkan 
                    System.err.println("Siswa dengan id " + selectedIdSiswa + " tidak ditemukan");
                }

            } else if (pilihan == 7) {
                System.err.println("\t Terima kasih sudah menggunakan Aplikasi perpus kami:)");
                
                break;
            }
        }

    }

}
