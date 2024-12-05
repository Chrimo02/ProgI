import java.util.Scanner;
public class Wahrheitstabelle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Erstes Zeichen eingeben:");
        String firstInput = scanner.nextLine();
        char firstBool = firstInput.charAt(0);
        int firstDigitCount = (firstInput).getBytes().length;

        System.out.println("Zweites Zeichen eingeben:");
        String secondInput = scanner.nextLine();
        char secondBool = secondInput.charAt(0);
        int secondDigitCount = (secondInput).getBytes().length;

        boolean firstInputValid = (firstDigitCount == 1 && (firstBool == 't' || firstBool == 'f'));
        if (!firstInputValid)System.out.println("Ungültige Eingabe beim ersten Zeichen - Bitte geben sie \"t\" oder \"f\" ein");
        boolean secondInputValid = (secondDigitCount == 1 && (secondBool == 't' || secondBool == 'f'));
        if (!secondInputValid)System.out.println("Ungültige Eingabe beim zweiten Zeichen - Bitte geben sie \"t\" oder \"f\" ein");

        boolean falseFalse = (firstBool == 'f' && secondBool == 'f');
        boolean trueTrue = (firstBool == 't' && secondBool == 't');
        boolean falseTrue = (firstBool == 'f' && secondBool == 't');
        boolean trueFalse = (firstBool == 't' && secondBool == 'f');

        if (falseFalse) System.out.println("Für die eingegebenen Werte lautet der Ausgabewert der Wahrheitstabelle: " + 0);
        if (trueTrue) System.out.println("Für die eingegebenen Werte lautet der Ausgabewert der Wahrheitstabelle: " + 3);
        if (falseTrue) System.out.println("Für die eingegebenen Werte lautet der Ausgabewert der Wahrheitstabelle: " + 1);
        if (trueFalse) System.out.println("Für die eingegebenen Werte lautet der Ausgabewert der Wahrheitstabelle: " + 2);
    }
}
