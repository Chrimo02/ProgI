import java.util.Scanner;
public class MittelwertMinMaxStandardabweichung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der einzulesenden Werte ein: ");
        double[] zahlen = new double[scanner.nextInt()];
        if (zahlen.length == 0){
            System.out.println("Die Anzahl der Werte muss größer als Null sein!");
        }
        else {
            System.out.println("Bitte geben Sie nun nacheinander die Werte ein");
            for (int i = 0; i < zahlen.length; i++) {
                zahlen[i] = scanner.nextDouble();
            }
            System.out.println("Anzahl der einzulesenden Werte: " + zahlen.length);
            for (int i = 0; i < zahlen.length; i++){
                int k = i+1;
                System.out.println(k + ". Wert: " + zahlen[i]);
            }
            System.out.println("Kleinster Wert: " + minimum(zahlen));
            System.out.println("Groesster Wert: " + maximum(zahlen));
            System.out.println("Arithmetischer Mittelwert: " + mittelwert(zahlen));
            System.out.println("Standardabweichung: " + standardabweichung(zahlen));

            //double[] testarray = new double[] {1,2,3,4,0.5,5};
        }
    }

    public static double mittelwert(double[] zahlen){
        double zaehler = 0;
        double nenner = zahlen.length;
        for (int i = 0; i < zahlen.length; i++){
            zaehler = zaehler + zahlen[i];
        }
        return zaehler/nenner;
    }

    public static double minimum(double[] zahlen){
        double minimum = zahlen[0];
        double puffer;
        //äußere while-Schleife, die so oft ausgeführt wird, wie das Array Einträge hat
        for (int i = 0; i < (zahlen.length - 1); i++){
            if (zahlen[i]>zahlen[i+1]){
                minimum = zahlen[i+1];
                puffer = zahlen[i];
                zahlen[i] = zahlen[i+1];
                zahlen[i+1] = puffer;
            }
        }
        return minimum;
    }

    public static double maximum(double[] zahlen){
        double maximum = zahlen[0];
        double puffer;
        for (int i = 0; i < (zahlen.length - 1); i++){
            if (zahlen[i]<zahlen[i+1]){
                maximum = zahlen[i+1];
                puffer = zahlen[i];
                zahlen[i] = zahlen[i+1];
                zahlen[i+1] = puffer;
            }

        }
        return maximum;
    }

    public static double standardabweichung(double[] zahlen){
        int n = zahlen.length;
        double summand;
        double summe = 0;
        double standardabweichung;

        for (int i = 1; i<=n; i++){
            summand = Math.pow(((zahlen[i-1])-mittelwert(zahlen)),2);
            summe = summe + summand;
        }
        standardabweichung = Math.sqrt((1.0/n)*summe);
        return standardabweichung;

    }


}
