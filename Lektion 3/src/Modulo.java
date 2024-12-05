import java.util.Scanner;
public class Modulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int modulo7 = scanner.nextInt() % 7;

        if (modulo7 == 0) System.out.println("Die eingegebene Zahl ist ganzzahlig durch 7 teilbar");

        else System.out.println("Die eingegebene Zahl ist nicht ganzzahlig durch 7 teilbar");

    }
}

/* Aufgabe b: - wenn der Modulo-Operator auf negative Operanden angewendet wird, funktioniert das Programm genauso wie bei positiven Operanden,
                weil das Vorzeichen eines Operanden nicht seine ganzzahligen Teiler ändert.

              - wenn der Modulo-Operator auf Kommazahlen angewendet wird, wird als Ergebnis der nicht-teilbare Rest als Kommazahl ausgegeben.
                Allerdings ist in unserem Beispiel die Eingabe auf Integer festgelegt, weshalb die Eingabe einer Kommazahl durch den User zu
                einer Fehlermeldung in der Konsole führt.

 */