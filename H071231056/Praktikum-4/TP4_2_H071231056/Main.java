package Case;

public class Main {

    public static void main(String[] args) {

        
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("HP", "987654", "biasa", 4000000, 2020);
        
        l1.setMerk("Acer");
        l1.setModel("24567");
        l1.setDeskripsi("limited");
        l1.setHarga(12_000_000);
        l1.setTahunProduksi(2024);


        l1.display();
        System.out.println("-----------------");
        display(l2);
        Utils.data();
    }
    public static void display(Laptop l2) {
        System.out.println("Merk                : " + l2.getMerk());
        System.out.println("Model               : " + l2.getModel());
        System.out.println("Deskripsi           : " + l2.getDeskripsi());
        System.out.println("Harga               : " + l2.getHarga());
        System.out.println("Tahun Produksi      : " + l2.getTahunProduksi());
    }




}
class Utils {
   public static void data(){
       System.out.println("Nama : Pangeran Juhrifar Jafar");
       System.out.println("NIM : H071231056");
   }
}

