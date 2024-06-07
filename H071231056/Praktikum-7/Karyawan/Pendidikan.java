package Karyawan;

public class Pendidikan extends Kehidupan {
    String pendidikanTerakhir;

    public Pendidikan(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }
    public Pendidikan() {}

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }
    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    @Override
    void prosesKehidupan() {
        System.out.println("Pendidikan Terakhir: " + pendidikanTerakhir);
    }
    @Override
    boolean memenuhiKriteria() {
        return !pendidikanTerakhir.equals("SD") && !pendidikanTerakhir.equals("SMP");
    }

}
