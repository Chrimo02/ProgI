public class Countdown {
    public static void main(String[] args) throws InterruptedException {

        int verbleibendeSekunden;
        for (int i = 1; i <= 16; i++) {
            verbleibendeSekunden = 16 - i;
            Thread.sleep(1000);
            System.out.println("Verbleibende Sekunden: " + verbleibendeSekunden);
        }
    }
}
