import java.util.Scanner;
public class Rekursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mit diesem Programm könne Sie Potenzen berechnen\nBitte geben Sie die Basis ein:");
        double x = scanner.nextDouble();
        System.out.println("Bitte geben Sie nun den gewünschten Exponenten an:");
        int n = scanner.nextInt();
        System.out.println(potenz(x,n));

    }

    public static double potenz(double x, int n){
        double result = 1;

        if (n==0)
        {
            return 1;
        }
        else
        {
            return result * x * potenz(x,n-1);


        }
    }
}

/*alternative ohne Rekursion:

            for (int i = n; i>0; i--)
            {
                result = result * x;
            }
            return result;
            */