package Karyawan;

public class Pengalaman extends Kehidupan {
    String pengalamanSebelumnya;
    String pengalamanBerorganisasi;

    public Pengalaman(String pengalamanSebelumnya, String pengalamanBerorganisasi) {
        this.pengalamanSebelumnya = pengalamanSebelumnya;
        this.pengalamanBerorganisasi = pengalamanBerorganisasi;
    }
    public Pengalaman() {}

    public String getPengalamanSebelumnya() {
        return pengalamanSebelumnya;
    }
    public void setPengalamanSebelumnya(String pengalamanSebelumnya) {
        this.pengalamanSebelumnya = pengalamanSebelumnya;
    }
    public String pengalamanOrganisasi(){
        if (pengalamanBerorganisasi.isEmpty()) {
            return "Tidak Ada";
        } else {
            return pengalamanBerorganisasi;
        }
    }
    
    @Override
    void prosesKehidupan() {
        System.out.println("Pengalaman: " + pengalamanSebelumnya);
        System.out.println("Pengalaman Organisasi: " + pengalamanBerorganisasi);
    }
    @Override
    boolean memenuhiKriteria() {
        if (pengalamanBerorganisasi.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
