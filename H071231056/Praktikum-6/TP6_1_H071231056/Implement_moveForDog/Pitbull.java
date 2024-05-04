package ContohPenggunaan_Interface.Implement_moveForDog;

public class Pitbull extends Dog {
    public Pitbull() {
        super();
        this.position = 0;
        this.averageLength = 18;
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("Pitbull berpindah " + this.position + " meter");
    }

    @Override
    public void describe() {
        System.out.println("Pitbull: Anjing berotot dengan rahang kuat, dikenal agresif, rata-rata panjang 18 inci.");
    }
}
