import java.util.Arrays;

public class StringMethoden {

    public static void main(String[] args){
        String test1 = "   Ich gehe morgen mit meinen 11 Freunden zum Essen!     ";
        String test2 = "Ich gehe                morgen mit meinen            11 Freunden     zum Essen!";
        String test3 = "Ich gehe morgen mit meinen 11 Freunden zum Essen!";

        System.out.println(deleteStartingSpace(test1));
        System.out.println();
        System.out.println(deleteEndingSpace(test1));
        System.out.println();
        System.out.println(deleteMultipleSpace(test2));
        System.out.println();

        String[] ergebnisTest3 = splitAtSpace(test3);
        System.out.println("Index:\t\tInhalt:");
        for (int i = 0; i< ergebnisTest3.length; i++){
            System.out.println(i + ":\t\t\t" + ergebnisTest3[i]);
        }

    }

    public static String deleteStartingSpace(String sentence){
        int i = 0;
        while (sentence.charAt(i) == ' '){
            i++;
        }
        sentence = sentence.substring(i);
        return sentence;
    }

    public static String deleteEndingSpace(String sentence){
        int i = sentence.length();
        while (sentence.charAt(i-1) == ' '){
            i--;
        }
        sentence = sentence.substring(0,i);
        return sentence;
    }

    public static String deleteMultipleSpace(String sentence){
        //löscht einfache alle Leerzeichen LOL
        for (int i = 0; i<sentence.length(); i++){
            if (sentence.charAt(i) == ' ' && sentence.charAt(i+1) == ' '){
                sentence = sentence.replace("  ", " ");
            }
        }
        return sentence;
    }

    public static String[] splitAtSpace(String input) {
        int benoetigteElemente = 0;
        for (int f = 0; f<input.length();f++){
            if (input.charAt(f) == ' ') {
                benoetigteElemente++;
            }
        }

        String[] ausgabe = new String[benoetigteElemente+1];

        int counter = 0;
        int flexBegin = 0;
        for (int i = 0; i<input.length(); i++){
            if (input.charAt(i) == ' '){
                ausgabe[counter++] = input.substring(flexBegin,i);
                flexBegin = i+1;
            }
        }
        ausgabe[counter] = input.substring(flexBegin);
        return ausgabe;
    }
    
}

