import java.util.Scanner;
public class Quadratwurzelberechnung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein:");
        double x = scanner.nextDouble();
        double ylaufend = x/2;
        double zwischenwert;

        if (x < 0)
        {
            System.out.println("Die Wurzel einer negativen Zahl ist nicht definiert!");
        }
        else if (x == 0)
        {
            System.out.println("Die Quadratwurzel von " + x + " beträgt " + x);
        }

        else{
            do {
            zwischenwert = ylaufend;
            ylaufend = (ylaufend + x / ylaufend) / 2;
            System.out.println(ylaufend);
            }
            while (Math.abs(x/ylaufend - zwischenwert) > 1E-15);
            System.out.println("Die Quadratwurzel von " + x + " beträgt ungefähr " + ylaufend);

        }
    }
}

