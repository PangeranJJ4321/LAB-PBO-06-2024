package LatihanJava.Toko;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gudang gudang = new Gudang(10);
        Scanner input = new Scanner(System.in);
        

        while (true) {

            menu();
            System.out.print(">>> ");
            int pilih = input.nextInt();

            if (pilih == 1) {
                input.nextLine();
                System.out.print("Masukan nama Produk\t: ");
                String nama = input.nextLine();
                System.out.print("Masukan nomor seri\t: ");
                int seri = input.nextInt();
                System.out.print("Masukan harga\t\t: ");
                int harga = input.nextInt();

                tipeProduk();
                int pilihTipe = input.nextInt();
                if (pilihTipe == 1) {
                    System.out.print("Masukan ukuran layar(inci)\t\t: ");
                    int screenSize = input.nextInt();
                    System.out.print("Masukan kapasitas penyimpanan(GB)\t: ");
                    int storageCapacity = input.nextInt();

                    gudang.addProduk(new Smartphone(nama, seri, harga, screenSize, storageCapacity));
                } else if (pilihTipe == 2) {
                    System.out.print("Masukan jumlah Ram\t: ");
                    int ramSize = input.nextInt();
                    input.nextLine();
                    System.out.println("Masukan prosesorType\t: ");
                    String prosesorType = input.nextLine();
                    gudang.addProduk(new Laptop(nama, seri, harga, ramSize, prosesorType));
                } else if (pilihTipe == 3) {
                    System.out.print("Masukan resolusi\t: ");
                    int resolusi = input.nextInt();
                    System.out.print("Masukan tipe lens\t: ");
                    String lens = input.next();
                    gudang.addProduk(new Camera(nama, seri, harga, resolusi, lens));
                } else {
                    System.out.println("Pilihan yang anda masukkan tidak tersedia");
                }
            } else if (pilih == 2) {
                gudang.semuaProduk();
            } else if (pilih == 3) {
                System.out.print("Masukan nomor seri produk yang ingin anda beli :  ");
                int seriesNumber = input.nextInt();

                Produk p = gudang.findProduk(seriesNumber);
                if (gudang.findProduk(seriesNumber) != null) {
                    System.out.println("Anda telah membeli produk.");
                    System.out.println("Detail Produk: ");
                    p.display();
                    
                    System.out.println("Terima Kasih, telah membeli produk kami.");
                } else {
                    System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
                }
            } else if (pilih == 4) {
                break;
            } else {
                System.out.println("Pilihan yang anda masukkan tidak tersedia");
            }
        } input.close();
    }

    public static void menu() {
        System.out.println("\n+---------------------------------------+");
        System.out.println("|Selamat Datang di Toko Kami            |");
        System.out.println("|Menu :                                 |");
        System.out.println("|\t1. Tambahkan Produk             |");
        System.out.println("|\t2. Tampilkan Semua Produk       |");
        System.out.println("|\t3. Beli Produk ?                |");
        System.out.println("|\t4. Exit                         |");
        System.out.println("+---------------------------------------+");
        System.out.print("Pilih Menu : \n");
    }

    public static void tipeProduk() {
        System.out.println("\n+---------------------------------------+");
        System.out.println("|Pilih tipe produk :                    |");
        System.out.println("|\t1. Tambahkan Smartphone         |");
        System.out.println("|\t2. Tambahkan Laptop             |");
        System.out.println("|\t3. Tambahkan Camera             |");
        System.out.println("+---------------------------------------+");
        System.out.print("Pilih tipe produk(1-3) : \n>>> ");
    }
}
