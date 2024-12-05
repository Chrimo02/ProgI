import java.util.Scanner;
public class Querprodukt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine Zahl ein: ");
        int x = scanner.nextInt();
        //Definition des Ausgangswertes der User-Eingabe, weil x im Laufe des Programms mehrfach überschrieben wird
        int ausgangswert = x;
        boolean validNumber = x <= 1000000 && x >= 1;

        while (!validNumber) {
            System.out.println("FEHLER - Die Zahl ist ungueltig.");
            System.out.println("Geben Sie bitte eine Zahl ein: ");
            x = scanner.nextInt();
            ausgangswert = x;
            validNumber = x <= 1000000 && x >= 1;
        }
        //Definition und Initialisierung der Variable Querprodukt mit dem neutralen Element der Multiplikation = 1
        int querprodukt = 1;

        while (x > 0) {
            int newFactor = x % 10;
            x = x / 10;
            querprodukt = querprodukt * newFactor;
        }
        System.out.println("Das Querprodukt der Zahl " + ausgangswert + " betraegt " + querprodukt);
        scanner.close();
    }

}







