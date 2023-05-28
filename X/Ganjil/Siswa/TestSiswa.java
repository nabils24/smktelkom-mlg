// __  __            __           ___                     
///\ \/\ \          /\ \      __ /\_ \                    
//\ \ `\\ \     __  \ \ \____/\_\\//\ \     ____    ____  
// \ \ , ` \  /'__`\ \ \ '__`\/\ \ \ \ \   /',__\  /',__\ 
//  \ \ \`\ \/\ \L\.\_\ \ \L\ \ \ \ \_\ \_/\__, `\/\__, `\
//   \ \_\ \_\ \__/.\_\\ \_,__/\ \_\/\____\/\____/\/\____/
//    \/_/\/_/\/__/\/_/ \/___/  \/_/\/____/\/___/  \/___/ 

///////////////////////////////////
//Author : Nabil Sahsada Suratno///
//Mode : Java Main Class        ///
//Youtube : NabilGames          ///
///////////////////////////////////

package Siswa;


//import.
public class TestSiswa {

   
    public static void main(String[] args) {
        // Buat Kodingan Neng Kene Bro OKE:D
        
    ModulAge siswa = new ModulAge();
    
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    siswa.setKelas("Kelas XR4");
    
    System.out.println("nama: "+siswa.getName()+ "alamat rumahnya adalah "+siswa.getAddress()+ " berumur "+siswa.getAge()+ " tahun"+"Kelas "+siswa.getKelas());
    }


 
 }


