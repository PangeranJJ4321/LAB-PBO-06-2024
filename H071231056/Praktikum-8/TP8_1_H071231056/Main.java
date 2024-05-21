package TP8.Nomor1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Thread ui = new Thread(new UIThread());
        ui.start();
    }
}

class UIThread implements Runnable {
    public static int waktuEksekusi = 0; 
    public static final int jumlahDataSumber = 4; 
    public static int dataBerhasilDimuat = 0; 
    public static int dataGagalDimuat = 0; 

    @Override
    public void run() {
        System.out.println("Start load " + jumlahDataSumber + " Data");

        
        Thread[] threads = new Thread[jumlahDataSumber];
        for (int i = 0; i < jumlahDataSumber; i++) {
            threads[i] = new Thread(new BackgroundThread());
            threads[i].start();
        }

        
        Thread timerThread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    Thread.sleep(1000);
                    synchronized (UIThread.class) {
                        waktuEksekusi++;
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        timerThread.start();
        
        // Menunggu semua thread selesai
        for (Thread thread : threads) {
            try {
                thread.join();
                } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        timerThread.interrupt();

        // hasil
        System.out.println("Task Finish");
        System.out.println("Time Execution : " + waktuEksekusi + "s");
        if (dataBerhasilDimuat == jumlahDataSumber) {
            System.out.println("All data is successfully loaded");
        } else {
            System.out.println(dataBerhasilDimuat + " Data Successfully loaded & " + dataGagalDimuat + " Data failed to load");
        }
    }
}

class BackgroundThread implements Runnable {

    @Override
    public void run() {
        try {
           
            int waktuTidur = 1000 * TaskTimeHelper.angkaRandom();
            Thread.sleep(waktuTidur);

            
            if (waktuTidur > 4000) {
                System.out.println("Request Timeout");
                UIThread.dataGagalDimuat++;
            } else {
                
                synchronized (UIThread.class) {
                    UIThread.dataBerhasilDimuat++;
                    System.out.printf("Loading... (%ds)\n", UIThread.waktuEksekusi);
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class TaskTimeHelper {
        public static int angkaRandom() {
        return new Random().nextInt(6) + 1; 
    }
}
