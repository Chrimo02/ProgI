import java.util.Scanner;
public class PrimzahlenRefactoring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die zu überprüfende Zahl ein: ");
        int input = scanner.nextInt();

        if (primzahl(input)) System.out.println("Die Zahl ist eine Primzahl");
        else System.out.println("Die Zahl ist keine Primzahl");
        scanner.close();

    }

    public static boolean primzahl(int x)
    {

        if (x<1)
        {
            return false;
        }
        else if (x==1)
        {
            return false;
        }
        else
        {
            boolean istPrimzahl;
            int i = 1;
            int modulo;

            do {
                ++i;
                modulo = x%i;
            }
            while ((x%i !=0) && i < x);

            if ((modulo == 0) && (i != x))
            {
                istPrimzahl = false;
            }
            else
            {
                istPrimzahl = true;
            }
            return istPrimzahl;

        }
    }

}
