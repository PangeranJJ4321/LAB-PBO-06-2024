package ContohPenggunaan_Interface.Implement_moveForDog;


public class GermanShepherd extends Dog {
    public GermanShepherd() {
        super();
        this.position = 0;
        this.averageLength = 24;
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("German Shepherd berpindah" + this.position + " meter");
    }

    @Override
    public void describe() {
        System.out.println("German Shepherd: Anjing gembala cerdas dengan bulu panjang, dikenal setia dan berani, rata-rata panjang 24 inci.");
    }
}
