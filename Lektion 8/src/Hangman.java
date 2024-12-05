import java.util.Scanner;
public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 20 ein um ein Wort für das Hangman-Spiel zu wählen: ");
        checkAndReplace(chooseGame(scanner.nextInt()));
        scanner.close();
    }

    public static void checkAndReplace(String loesung)
    {
        Scanner scanner = new Scanner(System.in);
        char[] richtigesWort = loesung.toCharArray();
        char[] loesungswort = new char[loesung.length()];
        // Initialisierung des char-Arrays mit Unterstrichen
        for (int i = 0; i < loesungswort.length; i++) {
            loesungswort[i] = '_';
        }

        int counter = 1;
        boolean stimmtUeberein = false;
        while (!stimmtUeberein && counter <= 15)
        {
            System.out.println(counter + ". Versuch: " + String.valueOf(loesungswort));
            char versuch = scanner.nextLine().charAt(0);
            for (int k = 0; k < loesungswort.length; k++)
            {
                if (richtigesWort[k] == versuch || richtigesWort[k] == versuch-32 || richtigesWort[k] == versuch+32) {
                    loesungswort[k] = versuch;
                }

            }
            if (String.valueOf(loesungswort).equalsIgnoreCase(String.valueOf(richtigesWort))){
                System.out.println("Sie haben das Wort erraten: " + String.valueOf(loesungswort));
                //System.out.println("Sie haben das Wort erraten: " + String.valueOf(loesungswort).toUpperCase());
                //toUpperCase ist nur erlaubt wenn es explizit in der Aufgabe steht
                stimmtUeberein = true;
            }
            counter++;

        }
        if (counter == 16){
            System.out.println("Sie haben keine Versuche mehr übrig.");
        }
        scanner.close();
    }

    public static String chooseGame(int i){
        String[] wortspeicher = new String[] {"COMPUTER","SONNENBLUME","ABENTEUER","SCHMETTERLING",
                "GITARRE","BIBLIOTHEK","ELEFANT","WASSERMELONE","BERGSTEIGEN","GEHEIMNIS","REGENBOGEN","ZIRKUS",
                "RUCKSACK","ZAUBEREI","ASTRONAUT","OZEAN","KAKTUS","PIZZA","QUOTIENT","EICHHOERNCHEN"};
        return wortspeicher[i-1];
    }
}
