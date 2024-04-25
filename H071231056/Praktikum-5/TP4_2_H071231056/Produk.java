package LatihanJava.Toko;

public class Produk {
    String brand;
    int seriesNumber;
    int price;
    
    public Produk(String brand, int seriesNumber, int price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
        
    }
    public void display() {
        System.out.println("Brand               : " + brand);
        System.out.println("Series Number       : " + seriesNumber);
        System.out.println("Price               : " + price);
    }

    public int getSeri(){
        return seriesNumber;
    }
}

class Smartphone extends Produk {
    double screenSize;
    int storageCapacity;
    
    public Smartphone(String brand, int seriesNumber, int price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
        
    }

    public void display() {
        super.display();
        System.out.println("Screen Size         : " + screenSize + " inci");
        System.out.println("Storage Capacity    : " + storageCapacity);
    }
    
}

class Camera extends Produk {
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, int price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
        
    }

    public void display() {
        
        super.display();
        System.out.println("Resolution          : " + resolution + " MP");
        System.out.println("Lens Type           : " + lensType);
    }
   
}

class Laptop extends Produk {
    int ramSize;
    String prosesorType;

    public Laptop(String brand, int seriesNumber, int price, int ramSize, String prosesorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.prosesorType = prosesorType;
        
    }

    public void display() {
        batas();
        super.display();
        System.out.println("RAM Size            : " + ramSize + " GB");
        System.out.println("Prosesor Type       : " + prosesorType);
    }

    private static void batas(){
        System.out.println("\n+----------------------------------+\n");
    }
}
