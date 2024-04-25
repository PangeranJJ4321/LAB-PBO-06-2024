package Try_Try;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public abstract class TigaDimensi extends Bangun {

    @Override
    public abstract double luas(); 

    public abstract double volume(); 
}

class Kubus extends TigaDimensi {

    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return 6 * pow(sisi, 2);
    }

    @Override
    public double volume() {
        return pow(sisi, 3);
    }
}

class Balok extends TigaDimensi {
    private double panjang, lebar, tinggi;

    
    
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
    @Override
    public double volume() {
        return (panjang * lebar * tinggi);
    }
    
}

class Bola extends TigaDimensi {
    
    double radius;
    
    public Bola(double radius) {
        this.radius = radius;
    }

    @Override
    public double luas() {
        return  4 * PI * pow(radius, 2);
    }
    
    @Override
    public double volume() {
        return (4 / 3) * PI * pow(radius, 3);
    }
    
}

class Tabung extends TigaDimensi {
    double radius, tinggi;
    
    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas() {
        return  2 * PI * radius * (radius + tinggi);
    }
    
    @Override
    public double volume() {
        return 0.33 * PI * pow(radius, 2) * tinggi;
    }

    

}
