package ContohPenggunaan_Interface.Implement_moveForDog;

public class Bulldog extends Dog {
    public Bulldog() {
        super();
        this.position = 0;
        this.averageLength = 14;
    }

    @Override
    public void move() {
        this.position += 1;
        System.out.println("Bulldog berpindah" + this.position + " meter");
    }

    @Override
    public void describe() {
        System.out.println("Bulldog: Anjing bertubuh pendek dengan wajah keriput, dikenal tenang dan penyayang, rata-rata panjang 14 inci.");
    }
}
