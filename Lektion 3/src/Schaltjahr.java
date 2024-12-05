import java.util.Scanner;
public class Schaltjahr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int insertedYear = scanner.nextInt();

        boolean moduloFour = ((insertedYear % 4) == 0);
        boolean moduloOneHundred = ((insertedYear % 100) != 0);
        boolean moduloFourHundred = ((insertedYear % 400) == 0);

        if (moduloFour && moduloOneHundred || moduloFourHundred) {
            System.out.println("Das eingegebene Jahr ist ein Schaltjahr");
        }
        else System.out.println("Das eingegebene Jahr ist kein Schaltjahr");

    }
}
