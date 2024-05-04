package ContohPenggunaan_Interface.Device;

import ContohPenggunaan_Interface.Move;

public class Car implements Move {
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;
    protected int currentGear;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentGear = 1;
    }

    @Override
    public void move() {
        if (currentGear < totalForwardGear) {
            currentGear++;
            System.out.println("Mobil " + color + " sedang berakselerasi");
        }
    }
}