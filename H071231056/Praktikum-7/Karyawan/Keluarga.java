package Karyawan;

public class Keluarga extends Kehidupan {

    String statusNikah;

    
    public Keluarga(String statusNikah) {
        this.statusNikah = statusNikah;
    }
    public Keluarga() {
    }

    public String getStatusNikah() {
        return statusNikah;
    }
    public void setStatusNikah(String statusNikah) {
        this.statusNikah = statusNikah;
    }
    
    @Override
    void prosesKehidupan() {
        System.out.println("Status Menikah : " + statusNikah);
    }

    @Override
    boolean memenuhiKriteria() {
        return true;
    }
    
}
