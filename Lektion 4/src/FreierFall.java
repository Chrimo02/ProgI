import java.util.Scanner;
public class FreierFall {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die gewünschte Falldauer an: ");

        //Vom Benutzer gewünschte Falldauer einlesen:
        int falldauer = scanner.nextInt();

        //Vergangene Sekunden t stückweise erhöhen bis zur eingegebenen Falldauer:
        for (int t = 1; t <= falldauer; t++)
        //for (int t = 1; t <= falldauer; t = t + 5)
        {
            double strecke = 0.5 * 9.80665 * (t * t);
            Thread.sleep(1000);
            System.out.println("Die zurückgelegte Strecke nach " + t + " Sekunden beträgt: " + strecke + " m");
        }
        scanner.close();
    }
}
