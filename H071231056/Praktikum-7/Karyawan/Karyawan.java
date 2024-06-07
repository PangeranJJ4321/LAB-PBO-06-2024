package Karyawan;

import java.util.ArrayList;

public class Karyawan extends Kehidupan {
    String nama, jabatan;
    int umur;
    double gaji;
    ArrayList<Kehidupan> kehidupans = new ArrayList<>();

    public Karyawan(String nama, String jabatan, int umur, double gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.umur = umur;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void addKehidupan(Kehidupan kehidupan) {
        kehidupans.add(kehidupan);
    }

    @Override
    void prosesKehidupan() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Umur: " + umur);
        System.out.println("Gaji: " + gaji);
        for (Kehidupan k : kehidupans) {
            k.prosesKehidupan();
        }
    }

    @Override
    boolean memenuhiKriteria() {
        if (umur >= 18) {
            for (Kehidupan k : kehidupans) {
                if (!k.memenuhiKriteria()) return false;
            }
            return true;
        }else{
            return false;
        }

    }
    

    
}
