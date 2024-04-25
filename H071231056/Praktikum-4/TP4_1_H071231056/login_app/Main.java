package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.User;
import login_app.models.Profile;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                // jika blm ada yang terdaftar
                if (listUser.isEmpty()) {
                    System.out.println("Belum ada user yang terdaftar, Silahkan Register Terlebih dahulu");
                    showRegisterMenu();
                }else{
                    showLoginMenu();
                }
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                System.out.println("inputan salah");
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");  
        String username = sc.nextLine(); // Mengambil input username
        // jika inputan kosong
        while (username.isEmpty()) {
            System.out.println("Inputan tidak boleh kosong.\nusername");
            System.out.print("> ");
            username = sc.nextLine();
        }

        // Membersihkan newline character di buffer
        sc.nextLine();
    
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
    
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        if (userIndex == -1) {
            System.out.println("Username tidak ditemukan");
    
        } else {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine(); // Mengambil input password
    
            // Membersihkan newline character di buffer
            sc.nextLine();
    
            boolean passwordBenar = listUser.get(userIndex).getPassword().equals(password);
    
            if (passwordBenar) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                System.out.println("Password Salah, silahkan masuk ulang");
                showLoginMenu();
            }
        }
    }
    
    private static void showRegisterMenu() {
        System.out.println("--------------------------");
        System.out.println("REGISTER");
        // System.out.println("Username");
        // System.out.print("> ");
        String username = sc.nextLine();
        
        while(username.isEmpty()){
            System.out.println("Username tidak boleh kosong!!\nUsername");
            System.out.print("> ");
            username = sc.nextLine();
        }
    
        // cek jika ada username yang sama
        while (isUsernameExist(username)) {
            System.out.println("Username sudah digunakan. Silahkan input ulang!!");
            System.out.print("Username: ");
            username = sc.nextLine().trim();
        }
        // lanjut
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
    
        boolean passwordMemenuhi = false;
    
        while (!passwordMemenuhi) {
            if (password.isEmpty()) {
                System.out.println("Password tidak boleh kosong, Silahkan masukan password ulang.\nPassword");
                System.out.print("> ");
                password = sc.nextLine();
            } else if (password.length() < 8) {
                System.out.println("Password harus diatas 8 karakter.\nPassword");
                System.out.print("> ");
                password = sc.nextLine();
            } else {
                passwordMemenuhi = true;
            }
        }
    
        User user = new User(username, password);
        /*
         * TODO
         * Buatlah atau Instance objek Profile baru
         */
    
        String fullName, hobby;
        int age;
    
        do {
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine().trim(); // Trim leading/trailing whitespace
        } while (fullName.isEmpty());
    
        do {
            System.out.println("Umur");
            System.out.print("> ");
            age = getIntInput(sc);
        } while (age <= 0);
    
        do {
            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine().trim();
        } while (hobby.isEmpty());
    
        Profile profile = new Profile();
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
    
        profile.setNickName(StringUtils.generateNickname(fullName));
    
        listUser.add(user);
        listUserProfile.add(profile);
    
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }
    
    private static void showDetailUser(Profile profile) {
        /*
         * TODO *
         * Tampilkan semua data profile user yang login
         */
        System.out.println("\nHalo, " + profile.getNickName() + "\n");

        System.out.println("Data akun anda, ");
        System.out.println("Nama lengkap\t: " + profile.getFullName());
        System.out.println("Umur\t\t: " + profile.getAge() + " tahun");
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("Nickname\t: " + profile.getNickName());
    }

    private static boolean isUsernameExist(String username) {
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                return true;
                
            }
            
        }
        return false;
    }

    public static int getIntInput(Scanner sc) {
        while (true) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Inputan kosong, Masukkan Ulang!!\nUmur");
                System.out.print("> ");
            } else {
                try {
                    int num = Integer.parseInt(input);
                    if (num > 0) {
                        return num;
                    } else {
                        System.out.println("Umur harus angka positif.");
                        System.out.println("Umur");
                        System.out.print("> ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Inputan salah. Harap masukkan angka.");
                    System.out.println("Umur");
                    System.out.print("> ");
                }
            }
        }
    }
}
