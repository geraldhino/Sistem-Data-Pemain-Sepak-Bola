import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tentukan berapa banyak pemain
        System.out.print("Masukkan jumlah pemain playmaker: ");
        int jumlah = input.nextInt();
        input.nextLine(); // buang newline

        // Array untuk menyimpan objek
        PemainPlaymaker[] daftarPlaymaker = new PemainPlaymaker[jumlah];

        // Input data dari user
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nInput data pemain playmaker ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine(); // buang newline

            System.out.print("Posisi: ");
            String posisi = input.nextLine();

            System.out.print("Kreativitas (0-100): ");
            int kreativitas = input.nextInt();
            input.nextLine(); // buang newline

            // Membuat object dan simpan ke array
            daftarPlaymaker[i] = new PemainPlaymaker(nama, usia, posisi, kreativitas);
        }

        // Tampilkan semua data
        System.out.println("\n=== Data Semua Pemain Playmaker ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Pemain ke-" + (i + 1));
            daftarPlaymaker[i].tampilkanInfo();
        }

        input.close();
    }
}
