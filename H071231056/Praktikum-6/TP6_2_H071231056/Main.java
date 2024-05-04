package ContohPenggunaan_Interface.No2;
import ContohPenggunaan_Interface.Device.Car;
import ContohPenggunaan_Interface.Device.Smartphone;
import ContohPenggunaan_Interface.Implement_moveForDog.GermanShepherd;
import ContohPenggunaan_Interface.Implement_moveForDog.Pitbull;


public class Main {

    public static void main(String[] args) {
        Smartphone s = new Smartphone(2000000, "Samsung");
        s.move();

        Car c = new Car(5, "Blue", 200);
        c.move();
        

        GermanShepherd d = new GermanShepherd();
        d.move();
        d.describe();

        Pitbull d1 = new Pitbull();
        d1.move();
        d1.describe();
    }
}
