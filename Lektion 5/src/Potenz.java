import java.util.Scanner;
public class Potenz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Basis ein:");
        double b = scanner.nextDouble();
        System.out.println("Bitte geben Sie einen Exponent ein:");
        int n = scanner.nextInt();

        double potenz = b;
        int zaehler = 0;

        if (n == 0)
        {
            potenz = 1;
            System.out.println(potenz);
        }
        else if (n > 0)
        {
            do {
                potenz = potenz * b;
                zaehler++;
            }
            while (zaehler != n-1);
            System.out.println(potenz);
        }

        else
        {
            do {
                potenz = potenz * b;
                zaehler--;
            }
            while (zaehler > n+1);
            potenz = 1.0 / potenz;
            System.out.println(potenz);
        }
        scanner.close();
    }
}

