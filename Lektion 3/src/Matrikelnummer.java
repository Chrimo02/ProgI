import java.util.Scanner;
public class Matrikelnummer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihre Matrikelnummer ein:");
        String insertedNumber = scanner.nextLine();

        int digitCount = String.valueOf(insertedNumber).getBytes().length;
        boolean validNumber = (insertedNumber.startsWith("50") || (insertedNumber.startsWith("51") || (insertedNumber.startsWith("61")))) && (digitCount == 7);

        if (validNumber)System.out.println("Die Matrikelnummer ist gültig");
        else System.out.println("Es ist nur die Eingabe einer gültigen siebenstelligen Matrikelnummer erlaubt!");

        // für die Prüfung nur erlaubte Methoden aus den Lektionen verwenden!!!!!!!!!!!!!!!
    }
}
