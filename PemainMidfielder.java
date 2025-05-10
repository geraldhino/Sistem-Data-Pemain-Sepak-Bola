public class PemainMidfielder extends Pemain {
    private String posisi;

    public PemainMidfielder(String nama, int usia, String posisi) {
        super(nama, usia); // memanggil constructor superclass
        this.posisi = posisi;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Posisi: " + posisi);
    }
}
