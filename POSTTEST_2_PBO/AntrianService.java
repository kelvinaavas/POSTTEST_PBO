import java.util.ArrayList;

public class AntrianService {

    // encapsulation: data disembunyikan dengan private
    private ArrayList<Customer> daftar = new ArrayList<>();

    public void tambahAntrian(int nomor, String nama) {
        Customer c = new Customer(nomor, nama, "Menunggu");
        daftar.add(c);
        System.out.println("Nomor antrian " + nomor + " berhasil dibuat");
    }

    public void tampilkanAntrian() {

        if (daftar.isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        for (Customer c : daftar) {
            System.out.println("Nomor: " + c.getNomor()
                    + " Nama: " + c.getNama()
                    + " Status: " + c.getStatus());
        }
    }

    public void selesaiPotong(int nomor) {

        for (Customer c : daftar) {
            if (c.getNomor() == nomor) {
                c.setStatus("Selesai Potong");
                System.out.println("Status berhasil diubah");
                return;
            }
        }

        System.out.println("Nomor tidak ditemukan");
    }

    public void hapusAntrian(int nomor) {

        for (Customer c : daftar) {
            if (c.getNomor() == nomor) {
                daftar.remove(c);
                System.out.println("Data antrian dihapus");
                return;
            }
        }

        System.out.println("Nomor tidak ditemukan");
    }
}