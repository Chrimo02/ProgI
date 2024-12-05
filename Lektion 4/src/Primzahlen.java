import java.util.Scanner;
public class Primzahlen {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die zu untersuchende ganze Zahl ein: ");
        int input = scanner.nextInt();

        //not allowed to define boolean for primzahl!!!

        /*boolean primzahl = (input > 1 && (input % 7 != 0) && (input % 5 != 0) && (input % 2 != 0) && (input % 3 !=0)) || input == 2 || input == 3;
        if (primzahl) System.out.println("Die untersuchte Zahl ist eine Primzahl!");
        else System.out.println("Die untersuchte Zahl ist keine Primzahl!");

        for (int i = 1; i <= input; i++){
            boolean primzahl = (i > 1 && (i % 2 != 0) && (i % 3 !=0)) || i == 2 || i == 3;
            if (primzahl) System.out.println("Die Zahl " + i + " ist eine Primzahl!");
            else System.out.println("Die Zahl " + i + " ist keine Primzahl!");
        }
         */
        scanner.close();
    }
}
