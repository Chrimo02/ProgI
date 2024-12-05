import java.util.Scanner;
public class Formatieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren Vornamen ein: ");
        String firstName = scanner.nextLine();
        System.out.println("Bitte geben Sie Ihren Nachnamen ein: ");
        String secondName = scanner.nextLine();
        System.out.println("Bitte geben Sie Ihre Matrikelnummer ein: ");
        String matrikelnummer = scanner.nextLine();
        System.out.println("Bitte geben Sie Ihre e-Mail-Adresse ein: ");
        String email = scanner.nextLine();

        // a)
        System.out.println(formatName(firstName,secondName));

        // b)
        System.out.println(formatNameWithMatriculationNr(firstName,secondName,matrikelnummer));

        // c)
        System.out.println(formatNameWithMatriculationNrAndMail(firstName,secondName,matrikelnummer,email));

    }

    public static String formatName(String firstName, String secondName){
        return (firstName + ", " + secondName);
    }

    public static String formatNameWithMatriculationNr(String firstName, String secondName, String matrikelnummer){
        return (firstName + ", " + secondName + " (" + matrikelnummer + ")");
    }

    public static String formatNameWithMatriculationNrAndMail(String firstName, String secondName, String matrikelnummer, String email){
        return (firstName + ", " + secondName + " (" + matrikelnummer + "): " + email);
    }
}
