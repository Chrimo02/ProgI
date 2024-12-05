import java.util.Scanner;
public class BSprachenSpiel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie einen Satz ein der mittels dem B-Sprachen-Spiel umgewandelt werden soll:");
        String eingabe = scanner.nextLine();
        System.out.println(spielen(eingabe));
    }

    public static String spielen(String eingabe){

        char[] basis = eingabe.toCharArray();
        int benoetigteLaenge = basis.length;

        for (int i = 0; i<basis.length; i++) {
            if (basis[i] == 'a' || basis[i] == 'e' || basis[i] == 'i' || basis[i] == 'o' || basis[i] == 'u') {
                benoetigteLaenge = benoetigteLaenge + 2;
            }
        }

        char[] ausgabe = new char[benoetigteLaenge];
            int verschieber = 0;
            char puffer;

            for (int j = 0; j < basis.length; j++) {
                if (basis[j] == 'a' || basis[j] == 'e' || basis[j] == 'i' || basis[j] == 'o' || basis[j] == 'u') {
                    puffer = basis[j];
                    ausgabe[j + verschieber] = puffer;
                    ausgabe[j + 1 + verschieber] = 'b';
                    ausgabe[j + 2 + verschieber] = puffer;
                    verschieber = verschieber + 2;
                }
                else {
                    ausgabe[j + verschieber] = basis[j];
                }
            }
            return String.valueOf(ausgabe);

            }

        }



