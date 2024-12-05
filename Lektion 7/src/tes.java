import java.util.Scanner;

public class tes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] zahlen = new double[scanner.nextInt()];

        int counter = 50;

        for (int i = 0; i<zahlen.length;i++){
            zahlen[i] = counter;
            counter = counter +50;
        }

        for (int i = 0; i< zahlen.length;i++){
            System.out.print(zahlen[i] + " ");
        }

        int[] baum = new int[] {5,6,7,8,9};

    }
}
