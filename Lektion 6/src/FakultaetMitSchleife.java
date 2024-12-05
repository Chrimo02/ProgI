import java.util.Scanner;
public class FakultaetMitSchleife {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Von welcher Zahl möchten Sie die Fakultät wissen?");
        int n = scanner.nextInt();
        System.out.println("die Fakultät von " + n + " ist " + fakultaet(n));
        scanner.close();
    }

    public static long fakultaet(int n)
    {
        long produkt = 1;
        for (int i = n; i>=0; i--)
        {
            if (i == 0)
            {
                return produkt;
            }
            else
            {
                produkt = produkt * i;
            }
        }
        return produkt;
    }
}

