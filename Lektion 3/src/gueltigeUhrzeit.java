import java.util.Scanner;
public class gueltigeUhrzeit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie einen Stundenwert ein:");
        int hours = scanner.nextInt();
        boolean validHours = ((0 <= hours) && (hours <= 23));


        System.out.println("Bitte geben Sie einen Minutenwert ein:");
        int minutes = scanner.nextInt();
        boolean validMinutes = ((0 <= minutes) && (minutes <= 59));

        System.out.println("Bitte geben Sie einen Sekundenwert ein:");
        int seconds = scanner.nextInt();
        boolean validSeconds = ((0 <= seconds) && (seconds <= 59));

        if (!validHours) System.out.println("Bitte geben Sie einen gültigen Stundenwert ein!");
        if (!validMinutes) System.out.println("Bitte geben Sie einen gültigen Minutenwert ein!");
        if (!validSeconds) System.out.println("Bitte geben Sie einen gültigen Sekundenwert ein!");
        if (validHours && validMinutes && validSeconds) System.out.println("Die Uhrzeit " + hours + ":" + minutes + ":" + seconds + " ist gültig.");

    }
}
