package TP8.Nomor2;

public class Typer extends Thread {
    private String botName, wordsType;
    private double wpn;
    private TypeRacer typeRacer;
    private boolean finished = false;

    public Typer(String botName, double wpn, TypeRacer typeRacer){
        this.botName =  botName;
        this.wpn = wpn;
        this.wordsType = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpn(double wpn) {
        this.wpn = wpn;
    }

    public void addwordTyped(String newWordsTyped){
        this.wordsType += newWordsTyped + " ";
    }

    public String getWordsType() {
        return wordsType;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpn() {
        return wpn;
    }

    public boolean isFinished() {
        return finished;
    }

    @Override
    public void run(){
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        // Buatlah variable howLongToType yang memuat waktu yang diperlukan typer untuk menulis 1 kata dalam milisecond
        long howLongToType = (long) (1 / wpn * 1000);

        // Buatlah perulangan untuk menambahkan kata dengan method addWordToTyped setelah interval waktu sebanyak howLongToType
        for (String kata : wordsToType) {
            // tunggu se howlongToType
            try {
                Thread.sleep(howLongToType);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            // Tambahkan kata yang sedang diketik
            addwordTyped(kata);
        }

        // Tandai bahwa sudah selesai mengetik
        this.finished = true;
        // Tambahkan hasil ke standing setelah selesai mengetik semua kata
        typeRacer.addResult(new Result(botName, System.currentTimeMillis())); 
    }
}
