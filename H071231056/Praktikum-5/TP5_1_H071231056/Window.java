package Try_Try;
import java.util.Scanner;
public class Window {

    public static void main(String[] args) {

        String jenisBentuk;
        String nama;
        Scanner sc = new Scanner(System.in);

        pertama:
        do {
            bats();
            start();
            jenisBentuk = sc.nextLine(); 


            if (jenisBentuk.equals("1") || jenisBentuk.equals("2") || jenisBentuk.equals("3")) {

                kedua:
                while (true){
                    if (jenisBentuk.equals("1")){
                        bats();
                        System.out.println("\nWah, anda memilih nomor 1. Silahkan pilih Bangun Ruang yang tersedia:\n1. Kubus\n2. Balok\n3. Bola\n4. Tabung\n5. Kembali ke menu utama");
                        System.out.print(">> ");
                        nama = sc.nextLine();

                        bats();
                        ketiga:
                        while (nama.equals("1")) {
                            
                            System.out.println("Silahkan masukkan panjang sisi kubus: ");
                            System.out.print("Sisi : ");
                            double sisi = sc.nextDouble();
        
                            Kubus kubus = new Kubus(sisi);

                            System.out.println("\nMaka, luas dan volume kubus adalah : ");
                            System.out.println("\tLuas kubus    : " + kubus.luas());   
                            System.out.println("\tVolume kubus  : " + kubus.volume());

                            System.out.println("Kembali ke menu sebelumnya? (Y/N)");
                            String end = sc.nextLine();
                            System.out.print(">>> ");
                            end = sc.nextLine();

                                if (end.equals("Y") || end.equals("y")){
                                        continue kedua;
                                    } else if (end.equals("N") || end.equals("n")){
                                        bats();
                                        continue ketiga;
                                }
                            }
                                
                        keempat:
                        while(nama.equals("2")){

                            System.out.println("Silahkan masukkan panjang, lebar dan tiggi balok: ");
                            System.out.print("Panjang   : ");
                            double panjag = sc.nextDouble();
                            System.out.print("Lebar     : ");
                            double lebar = sc.nextDouble();
                            System.out.print("Tinggi    : ");
                            double tinggi = sc.nextDouble();
            
                            Balok balok = new Balok(panjag, lebar, tinggi);

                            System.out.println("\nMaka, luas dan volume balok adalah : ");
                            System.out.println("\tLuas Balok    : " + balok.luas());       
                            System.out.println("\tVolume Balok  : " + balok.volume());

                            System.out.println("Kembali ke menu sebelumnya? (Y/N)");
                            String end = sc.nextLine();
                            System.out.print(">>> ");
                            end = sc.nextLine();

                                if (end.equals("Y") || end.equals("y")){
                                    continue kedua;
                                } else if (end.equals("N") || end.equals("n")){
                                    bats();
                                    continue keempat;
                                }
                            }
                        kelima:
                        while(nama.equals("3")){
                            System.out.println("Silahkan masukkan radius bola: ");
                            System.out.print("Radius : ");
                            double radius = sc.nextDouble();
                            
                            Bola bola = new Bola(radius);
                            System.out.println("\nMaka, luas dan volume bola adalah : ");
                            System.out.println("\tLuas Bola     : " + bola.luas());        
                            System.out.println("\tVolume Bola   : " + bola.volume());

                            System.out.println("Kembali ke menu sebelumnya? (Y/N)");
                            String end = sc.nextLine();
                            System.out.print(">>> ");
                            end = sc.nextLine();

                                if (end.equals("Y") || end.equals("y")){
                                    continue kedua;
                                } else if (end.equals("N") || end.equals("n")){
                                    bats();
                                    continue kelima;
                                }
                                       
                            }
                        
                        keenam:
                        while (nama.equals("4")) {
                            System.out.println("Silahkan masukkan radius dan tiggi tabung: ");
                            System.out.print("Radius : ");
                            double radius = sc.nextDouble();
                            System.out.print("Tinggi : ");
                            double tinggi = sc.nextDouble();
                            
                            Tabung tb = new Tabung(radius, tinggi);
                            System.out.println("\nMaka, luas dan volume tabung adalah : ");
                            System.out.println("\tLuas Tabung   : " + tb.luas());      
                            System.out.println("\tVolume Tabung : " + tb.volume());

                            System.out.println("Kembali ke menu sebelumnya? (Y/N)");
                            String end = sc.nextLine();
                            System.out.print(">>> ");
                            end = sc.nextLine();

                                if (end.equals("Y") || end.equals("y")){
                                    continue kedua;
                                } else if (end.equals("N") || end.equals("n")){
                                    bats();
                                    continue keenam;
                                }
                        }

                        if (nama.equals("5")){
                            System.out.println("\nKembali kemenu utama\n");
                            continue pertama;
                        } else {
                            continue kedua;
                        }
    
                    } if (jenisBentuk.equals("2")){
                        System.out.println("\nWah, anda memilih nomor 2. Silahkan pilih Bangun Datar yang tersedia:\n1. Persegi\n2. Persegi Panjang\n3. Jajar Genjang\n4. Segitiga\n5. Kembali ke menu utama");
                        System.out.print(">> ");
                        nama = sc.nextLine();

                        ketujuh:
                        while (nama.equals("1")) {
                            System.out.println("Silahkan masukkan panjang sisi persegi: ");
                            System.out.print("Sisi : ");
                            double sisi = sc.nextDouble();
    
                            Persegi persegi = new Persegi(sisi);
                            System.out.println("\nMaka, luas dan keliling persegi adalah : ");
                            System.out.println("\tLuas persegi      : " + persegi.luas());
                            System.out.println("\tKeliling persegi  : " + persegi.keliling());
                            
                            System.out.println("Kembali ke menu sebelumnya? (Y/N)");
                                String end = sc.nextLine();
                                System.out.print(">>> ");
                                end = sc.nextLine();

                                    if (end.equals("Y") || end.equals("y")){
                                        continue kedua;
                                    } else if (end.equals("N") || end.equals("n")){
                                        bats();
                                        continue ketujuh;
                                    }
                        }
                        kedelapa:
                        while (nama.equals("2")){
                            System.out.println("Silahkan masukan panjang dan lebar persegi panjang : ");
                            System.out.print("Panjang   : ");
                            double panjang = sc.nextDouble();
                            System.out.print("Lebar     : ");
                            double lebar = sc.nextDouble();

                            PersegiPanjang pj =  new PersegiPanjang(panjang, lebar);
                            System.out.println("\nMaka, luas dan keliling persegi panjang adalah : ");
                            System.out.println("\tLuas persegi panjang      : " + pj.luas());
                            System.out.println("\tKeliling persegi panjang  : " + pj.keliling());
                            
                            System.out.println("Kembali ke menu sebelumnya? (Y/N)");
                                String end = sc.nextLine();
                                System.out.print(">>> ");
                                end = sc.nextLine();

                                    if (end.equals("Y") || end.equals("y")){
                                        continue kedua;
                                    } else if (end.equals("N") || end.equals("n")){
                                        bats();
                                        continue kedelapa;
                                    }
                        }
                        kesembilan:
                        while (nama.equals("3")){
                            System.out.println("Silahkan masukan radius lingkaran : ");
                            System.out.print("Radius: ");
                            double radius = sc.nextDouble();

                            Lingkaran l = new Lingkaran(radius);
                            System.out.println("\nMaka, luas dan keliling lingkaran adalah : ");
                            System.out.println("\tLuas LIngkaran        : " + l.luas());
                            System.out.println("\tKeliling LIngkaran    : " + l.keliling());
                            
                            System.out.println("Kembali ke menu sebelumnya? (Y/N)");
                                String end = sc.nextLine();
                                System.out.print(">>> ");
                                end = sc.nextLine();

                                    if (end.equals("Y") || end.equals("y")){
                                        continue kedua;
                                    } else if (end.equals("N") || end.equals("n")){
                                        bats();
                                        continue kesembilan;
                                    }
                        }

                        kesepuluh:
                        while (nama.equals("4")){
                            System.out.println("Silahkan masukan panjang sisiAtas, sisiBawah dan tinggi Trapesium: ");
                            System.out.print("Sisi Atas     : ");
                            double sisiAtas = sc.nextDouble();
                            System.out.print("Sisi Bawah    : ");
                            double sisiBawah = sc.nextDouble();
                            System.out.print("Tinggi        : ");
                            double Tinggi = sc.nextDouble();

                            Trapesium t = new Trapesium(sisiAtas, sisiBawah, Tinggi);
                            System.out.println("\nMaka, luas dan keliling Trapesium adalah : ");
                            System.out.println("\tLuas Trapesium        : " + t.luas());
                            System.out.println("\tKeliling Trapesium    : " + t.keliling());
                            
                            System.out.println("Kembali ke menu sebelumnya? (Y/N)");
                                String end = sc.nextLine();
                                System.out.print(">>> ");
                                end = sc.nextLine();

                                    if (end.equals("Y") || end.equals("y")){
                                        continue kedua;
                                    } else if (end.equals("N") || end.equals("n")){
                                        bats();
                                        continue kesepuluh;
                                    }
                        }

                        if (nama.equals("5")){
                            System.out.println("\nKembali kemenu utama\n");
                            continue pertama;
                        } else {
                            continue kedua;
                        }
    
    
                    } else if (jenisBentuk.equals("3")){
                        break pertama;
                    }
                }

            } else if (jenisBentuk != "1" && jenisBentuk != "2" && jenisBentuk != "3") {
                System.out.println("Maaf, anda salah memilih. Silahkan pilih yang tersedia.");
        }
    } while (true); 
    terimakasih();
    sc.close();
    }
    public static void start() {
        System.out.println("\nHallo, Jar");
        System.out.println("Selemat datang di kode saya.\nSilahkan pilih mana yang anda cari tahu:)\n1. Bangun Ruang\n2. Bangun Datar\n3. Exit");
        System.out.print("> ");
    }  

    public static void terimakasih(){
        System.out.println("Terima kasih");
    }

    public static void bats(){
        System.out.println("---------------------------------------------------------------------");
    }

    
}
