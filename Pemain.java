public class Pemain {
    // Encapsulation: atribut private
    private String nama;
    private int usia;

    // Constructor
    public Pemain(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
    }
}
