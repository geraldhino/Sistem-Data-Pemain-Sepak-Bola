public class PemainPlaymaker extends PemainMidfielder {
    private int kreativitas;

    public PemainPlaymaker(String nama, int usia, String posisi, int kreativitas) {
        super(nama, usia, posisi);
        this.kreativitas = kreativitas;
    }

    public int getKreativitas() {
        return kreativitas;
    }

    public void setKreativitas(int kreativitas) {
        this.kreativitas = kreativitas;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kreativitas: " + kreativitas);
    }
}
