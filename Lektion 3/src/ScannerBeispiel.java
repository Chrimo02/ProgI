import java.util.Scanner; //fremde Klasse ins Programm einbinden
public class ScannerBeispiel
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: "); int x = scanner.nextInt(); //int von Standardeingabe lesen System.out.print("Bitte geben Sie noch eine Zahl ein: "); int y = scanner.nextInt(); System.out.print("Die Summe der beiden Zahlen ist: "); int result = x + y; // Summanden addieren und in Ergebnis speichern System.out.println(result);
    }
}