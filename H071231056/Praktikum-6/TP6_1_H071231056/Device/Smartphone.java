package ContohPenggunaan_Interface.Device;

import ContohPenggunaan_Interface.Move;
// import ContohPenggunaan_Interface.Elektronik;

public class Smartphone implements Move{
    protected int price;
    protected String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
        
    }
    
    @Override
    public void move() {
        System.out.println("Smartphone " + brand + " berpindah.");
    }

}
