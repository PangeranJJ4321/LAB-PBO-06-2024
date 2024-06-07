package Karyawan;

import javax.sound.sampled.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TP7_1_H071231056 {
    private static ArrayList<Karyawan> dataKaryawan = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TP7_1_H071231056 program = new TP7_1_H071231056();
        program.menuAwal();
        sc.close();
    }

    public void menuAwal() {
        System.out.println("=====Uhui=====");
        System.out.println("a. Tambah Data Karyawan");
        System.out.println("b. Tampilkan Detail Karyawan");
        System.out.println("c. Keluar");
        System.out.print("Pilih Opsi (a-c): ");
        String pilihan = sc.nextLine();

        switch (pilihan) {
            case "a":
                tambahDataKaryawan();
                break;
            case "b":
                tampilkanKaryawan();
                break;
            case "c":
                System.out.println("==============");
                System.out.println("Thank You");
                System.out.println("==============");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
                menuAwal();
        }
    }

    private void tampilkanKaryawan() {
        for (Karyawan karyawan : dataKaryawan) {
            System.out.println("==============");
            karyawan.prosesKehidupan();
        }
        menuAwal();
    }

    public void tambahDataKaryawan() {
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Umur: ");
        int umur = sc.nextInt();
        sc.nextLine();
        System.out.print("Gaji: ");
        double gaji = sc.nextDouble();
        sc.nextLine();

        Karyawan baru = new Karyawan(nama, "Staff", umur, gaji);
        baru.addKehidupan(new Pengalaman(inputPengalaman(), inputPengalamanOrganisasi()));
        baru.addKehidupan(new Pendidikan(inputPendidikan()));
        baru.addKehidupan(new Projek(inputProject()));
        baru.addKehidupan(new Keluarga(inputKeluarga()));

        if (baru.memenuhiKriteria()) {
            dataKaryawan.add(baru);
            System.out.println("====================");
            System.out.println("Karyawan baru berhasil ditambahkan!");
            playSound(true);
            System.out.println("====================");
            baru.prosesKehidupan();
        } else {
            System.out.println("====================");
            System.out.println("Karyawan Tidak Memenuhi Syarat");
            playSound(false);
            System.out.println("====================");
        }
        menuAwal();
    }

    public String inputPendidikan() {
        System.out.print("Pendidikan Terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
        return sc.nextLine();
    }

    public String inputPengalaman() {
        System.out.println("Pengalaman Sebelumnya:");
        System.out.println("1. Freelancer");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja Tetap");
        System.out.println("4. Tidak Ada");
        System.out.print("Input: ");
        int pilihan = sc.nextInt();
        sc.nextLine();
        switch (pilihan) {
            case 1:
                return "Freelancer";
            case 2:
                return "Magang";
            case 3:
                return "Pekerja Tetap";
            default:
                return "Tidak Ada";
        }
    }

    public String inputPengalamanOrganisasi() {
        System.out.print("Pengalaman Organisasi: ");
        return sc.nextLine();
    }

    public int inputProject() {
        System.out.println("Projek IT:");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Minimal 15");
        System.out.print("Input: ");
        int pilihan = sc.nextInt();
        sc.nextLine();
        return pilihan;
    }

    public String inputKeluarga() {
        System.out.print("Status Menikah: ");
        return sc.nextLine();
    }

    private void playSound(boolean isSuccess) {
        String fileName = isSuccess ? "success.wav" : "error.wav";
        String filePath = "C:\\Users\\ACER\\LAB-PBO-06-2024\\H071231056\\Praktikum-7\\Karyawan\\" + fileName;
        try {
            File soundFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);
            audioClip.start();
            while (!audioClip.isRunning())
                Thread.sleep(10);
            while (audioClip.isRunning())
                Thread.sleep(10);
            audioClip.close();
            audioStream.close();
        } catch (Exception e) {
            System.err.println("Audio play error: " + e.getMessage());
        }
    }
}
