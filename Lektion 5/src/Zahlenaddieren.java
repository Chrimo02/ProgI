import java.util.Scanner;
public class Zahlenaddieren {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ihre eingegebenen ganzen Zahlen werden addiert.\nDie Eingabe von 0 beendet das Programm und gibt die Summe aus!");
        int input;
        int summe = 0;
        do {
            input = scanner.nextInt();
            summe = summe + input;
        }
        while (input != 0);
        System.out.println("Summe: " + summe);
    }
}
