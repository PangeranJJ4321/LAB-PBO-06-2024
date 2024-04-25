package LatihanJava.Toko;

public class Gudang {
    private Produk[] produks;
    private int index ;

    public Gudang(int size) {
        produks = new Produk[size];
        index = 0;
    }

    public void addProduk(Produk p) {
        try{
            produks[index++] = p;
        } catch (Exception e){
            System.out.println("-----Gudang sudah penuh-----");
        }
    }

    public Produk findProduk(int seriesNumber) {
        for (int i = 0; i < index; i++) {
            if (produks[i].getSeri() == seriesNumber) {
                return produks[i];
            }
        }
        return null;
    }

    public void semuaProduk(){
        if (index == 0) {
            System.out.println("Gudang Kosong");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.println("\n+---------------------------------------+");
                System.out.println("|Produk " + i+1 + "                              |");
                
                System.out.println("+---------------------------------------+");
                produks[i].display();
            }
        }
    }

    
}
