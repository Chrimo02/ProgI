import java.util.Scanner;
public class Rechtecknaeherung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte legen Sie fest wieviele Rechtecke für die annäherung an PI genutzt werden sollen:");
        int zaehler = scanner.nextInt();
        double r = 1.0;
        double grundflaeche;
        double hoehe;
        double quarterPi = 0;


        do {
            grundflaeche = r/zaehler;
            hoehe = Math.sqrt((r*r)-((1.0/zaehler)*(1.0/zaehler)));
            quarterPi = quarterPi + (grundflaeche * hoehe);
            zaehler++;
            System.out.println(quarterPi);
        }
        while (4*quarterPi < Math.PI);

        System.out.println("PI = " + 4*quarterPi);

    }
}
