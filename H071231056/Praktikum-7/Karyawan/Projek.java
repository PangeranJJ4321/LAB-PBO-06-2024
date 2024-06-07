package Karyawan;

public class Projek extends Kehidupan {
    int jumlahProjek;

    public Projek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }
    public Projek() {}

    public int getJumlahProjek() {
        return jumlahProjek;
    }
    public void setJumlahProjek(int jumlahProjek) {
        this.jumlahProjek = jumlahProjek;
    }
    @Override
    void prosesKehidupan() {
        
    }
    @Override
    boolean memenuhiKriteria() {
        return jumlahProjek != 1;
    }

    

}
