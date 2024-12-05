import java.util.Scanner;
public class TageImMonat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean fehlerGefunden;
        do {
            try {
                System.out.println("Bitte geben Sie einen Monatsnamen ein:");
                int tage = tageImMonat(scanner.nextLine());
                fehlerGefunden = false;
                System.out.println(tage);
            } catch (RuntimeException e) {
                System.out.println("falscher Monatsname");
                fehlerGefunden = true;
            }
        }
        while (fehlerGefunden);
    }
    public static int tageImMonat(String monat) {
        int tage = switch(monat)
        {
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Mai", "Juli", "August", "Oktober",
                    "Dezember" -> 31;
            default -> throw new RuntimeException("falscher Monatsname");
        };
        return tage;
    }


}
