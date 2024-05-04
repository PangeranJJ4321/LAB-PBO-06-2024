package ContohPenggunaan_Interface.Implement_moveForDog;

public class SiberianHusky extends Dog {
    public SiberianHusky() {
        super();
        this.position = 0;
        this.averageLength = 23;
    }

    @Override
    public void move() {
        this.position += 2;
        System.out.println("Siberian Husky berpindah " + this.position + " meter");
    }

    @Override
    public void describe() {
        System.out.println("Siberian Husky: Anjing pelari cepat dengan bulu tebal, dikenal ramah dan energik, rata-rata panjang 23 inci.");
    }
}
