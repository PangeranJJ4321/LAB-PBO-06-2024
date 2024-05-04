package ContohPenggunaan_Interface.Implement_moveForDog;
import ContohPenggunaan_Interface.Move;

public abstract class Dog implements Move {
    protected int position;
    protected int averageLength;

    public abstract void describe();
    
}
