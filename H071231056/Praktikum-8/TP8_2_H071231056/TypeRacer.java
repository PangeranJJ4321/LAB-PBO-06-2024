package TP8.Nomor2;

import java.util.ArrayList;
import java.util.Random;

public class TypeRacer {
    private String wordsToType;
    private final ArrayList<Typer> raceContestants = new ArrayList<>();
    private final ArrayList<Result> raceStanding = new ArrayList<>();

    // dapatkan apa yang diketik
    public String getWordsToType() {
        return wordsToType;
    }

    // peserta
    public ArrayList<Typer> getRaceContestants() {
        return raceContestants;
    }

    // Daftar kata yang akan digunakan dalam kompetisi
    private final String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampauinya",
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"
    };

    // Memilih kata acak dari daftar kata
    public void setNewWordsToType() {
        Random random = new Random();
        int randomIndex = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[randomIndex];
    }
    
    // todo4
    public void addResult(Result result) {
        raceStanding.add(result);
    }

    // Menampilkan klasemen akhir dari kompetisi
    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("===========================\n");

        int position = 1;
        for (Result result : raceStanding) {
            System.out.println(position + ". " + result.getName() + " = " + result.getFinishTime() + " detik");
            position++;
        }
    }

    // Memulai kompetisi
    public void startRace() {
        setNewWordsToType(); // Memilih kata untuk diketik

        // Menjalankan kompetisi
        for (Typer typer : raceContestants) {
            typer.start();
        }

        // Menampilkan kemajuan ketik setiap dua detik
        boolean raceOngoing = true;
        while (raceOngoing) {
            try {
                raceOngoing = false;
                for (Typer typer : raceContestants) {
                    System.out.println("\nTyping Progress ....");
                    Thread.sleep(2000);
                    System.out.println("- " + typer.getBotName() + "   => " + typer.getWordsType());
                    if (!typer.isFinished()) {
                        raceOngoing = true;
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        // Menampilkan klasemen akhir setelah semua typer selesai
        printRaceStanding();
    }
}
