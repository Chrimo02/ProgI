import java.util.Scanner;
public class Runden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Bitte geben sie eine Zahl zum Runden ein:");
        double x = scanner.nextDouble();
        System.out.println("Auf wie viele Nachkommastellen soll die Zahl gerundet werden?");
        int y = scanner.nextInt();
        System.out.println("Auf ganze Zahlen gerundet ist die Zahl: " + round(x));
        System.out.println("Auf " + y + " Nachkommastellen gerundet ist die Zahl: " + customRound(x,y));
        scanner.close();
    }

   public static int round(double x)
    {
        if (x < 0)
        {
            return roundPositive(x*(-1))*(-1);
        }
        else
        {
            return roundPositive(x);
        }
    }

    public static int roundPositive(double x)
    {

        if ((x*10)%10 < 5)
        {
            return (int) ((x*10)/10);
        }
        else {
            return (int) (((x * 10) / 10) + 1);
        }
    }

    public static double customRound(double zahl, int nachkommastellen){
        double multiplikator = 1;
        for (int j = nachkommastellen; j>0; j--){
            multiplikator *= 10;
        }

            zahl= (zahl * multiplikator);

        return (roundPositive(zahl))/multiplikator;
    }


}
