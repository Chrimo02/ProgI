package BinaryTree;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Baum woerterbuch = new Baum();
        Knoten wort1 = new Knoten("hello", "an expression or gesture of greeting - used interjectionally in greeting, ain answering the telephone, or to express surprise");
        Knoten wort2 = new Knoten("goodbye","an expression or gesture for the occasion of going away or leaving");
        woerterbuch.insert(wort1);
        woerterbuch.insert(wort2);
        //woerterbuch.print();
        //System.out.println(woerterbuch.search("hello"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen im Wörterbuch! - Möchten Sie ein Wort einfügen tippen Sie bitte <insert> - Um Wörter zu suchen tippen sie bitte <search>.");
        System.out.println("Falls Sie das Wörterbuch beenden möchten tippen sie bitte <quit>.");
        while (true) {
            System.out.println("<search> = suchen -- <insert> = wort einfügen -- <quit> = Wörterbuch beenden");
            String input = scanner.nextLine();
            if (input.equals("quit")) break;
            if (input.equals("insert")) {
                System.out.println("Welches wort möchten Sie hinzufügen? Bitte tippen Sie es in die Konsole:");
                String wort = scanner.nextLine();
                System.out.println("Bitte tippen Sie nun die dem Wort zugehörige Beschreibung in die Konsole:");
                String bedeutung = scanner.nextLine();
                System.out.println(bedeutung);
                Knoten newWord = new Knoten(wort,bedeutung);
                woerterbuch.insert(newWord);
                System.out.println("Das Wort und die Beschreibung wurde erfolgreich hinzugefügt - Hier sind die aktualisierten Einträge des Wörterbuchs: ");
                woerterbuch.print();
            }
            if (input.equals("search")){
                System.out.println("Nach welchem Wort möchten Sie suchen? Bitte tippen Sie es in die Konsole:");
                String suchbegriff = scanner.nextLine();
                System.out.println(woerterbuch.search(suchbegriff));
            }
        }


    }
}
