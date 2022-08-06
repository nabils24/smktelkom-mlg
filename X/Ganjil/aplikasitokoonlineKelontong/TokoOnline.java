package aplikasitokoonlineKelontong;

public class TokoOnline {

    public static void main(String[] args) {
        Laporan toko = new Laporan();
        Member baru = new Member();
        barang item = new barang();
        toko.laporan(baru);
        toko.laporan(item);
        baru.setNama("Newbie");
        Transaksi tokoAhmad = new Transaksi();
        tokoAhmad.prosesTransaksi(baru, tokoAhmad,item);
        toko.laporan(tokoAhmad, item);
        toko.laporan(item);
        toko.laporan(baru);
    }

}
