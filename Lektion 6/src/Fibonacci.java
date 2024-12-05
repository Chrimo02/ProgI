import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebein Sie an wie viele Fibonacci-Zahlen berechnet werden sollen: ");
        int input = scanner.nextInt();

        for (int i = input; i>0; i--){
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n){
        int nextFibonacci = 0;
        if (n == 0){
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        else {
            for (int i = n; i>=0; i--){
                nextFibonacci = fibonacci(n-1) + fibonacci(n-2);
            }
            return nextFibonacci;
        }
    }
}
