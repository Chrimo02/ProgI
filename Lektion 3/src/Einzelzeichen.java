import java.util.Scanner;
public class Einzelzeichen {
    public static void main(String[] args) {

        System.out.println("Bitte geben Sie ein Einzelzeichen ein:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char c =  line.charAt(0);
        int cNumeric = Character.getNumericValue(c);

        boolean capitalLetter = Character.isUpperCase(c);
        boolean hexadecimal = ((c >= 'A') && (c <= 'F')) || ((c >= 'a') && (c <= 'f')) || ((cNumeric >= 0) && (cNumeric <= 9));
        boolean binary = (cNumeric == 0) || (cNumeric == 1);
        boolean octal = (cNumeric >= 0) && (cNumeric <= 7);

        if (capitalLetter)System.out.println("Großbuchstabe");
        //hier dann z.B. boolean capitalLetter auf true setzen, damit in den folgezeilen nicht mehr beachtet werden muss
        if (hexadecimal)System.out.println("Hexadezimale Ziffer");
        if (binary)System.out.println("binäre Ziffer");
        if (octal)System.out.println("oktale Ziffer");
        if (!capitalLetter && !hexadecimal && !binary && !octal)System.out.println("Unbekannt");

    }
}
