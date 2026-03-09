import java.util.Scanner;

public class BarberShop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AntrianService service = new AntrianService();

        int pilih;
        int nomor = 1;

        do {

            System.out.println("=== SISTEM ANTRIAN BARBER SHOP ===");
            System.out.println("1. Ambil Nomor");
            System.out.println("2. Lihat Status Antrian");
            System.out.println("3. Selesai Potong");
            System.out.println("4. Hapus Antrian");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");

            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = input.nextLine();
                    service.ambilNomor(nomor, nama);
                    nomor++;
                    break;

                case 2:
                    service.lihatStatus();
                    break;

                case 3:
                    System.out.print("Masukkan nomor antrian: ");
                    int n = input.nextInt();
                    service.updateStatus(n);
                    break;

                case 4:
                    System.out.print("Masukkan nomor antrian: ");
                    int h = input.nextInt();
                    service.hapusAntrian(h);
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak ada");
            }

        } while (pilih != 5);
    }
}
