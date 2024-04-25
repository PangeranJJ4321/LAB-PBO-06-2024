package Try_Try;
import static java.lang.Math.PI;


public abstract class DuaDimensi extends Bangun {

    @Override
    public abstract double luas();

    public abstract double keliling(); 

}

class Persegi extends DuaDimensi {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends DuaDimensi {
    private double panjang, lebar;

    public PersegiPanjang (double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override 
    public double keliling(){
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends DuaDimensi {
    public double radius;
    
    public Lingkaran(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double luas() {
        return (PI * radius * radius);
    }
    
    @Override 
    public double keliling(){
        return 2 * PI * radius;
    }
    
}

class Trapesium extends DuaDimensi {
    public double sisiAtas, sisiBawah, tinggi;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }
    
    @Override 
    public double keliling(){
        return sisiAtas + sisiBawah + (2 * tinggi);
    }
}