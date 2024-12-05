public class ReihenwertBerechnung {
    public static void main(String[] args){

        double summe = 0;
        double k = 1.0;
        double summand;
        double reihenwert = 0;
        double zwischenergebnis;

        do
        {
            zwischenergebnis = reihenwert;
            summand = (1.0 / Math.pow(k, 2));
            summe = summe + summand;
            reihenwert = 6 * summe;
            System.out.println(reihenwert);
            k++;
        }

        while (reihenwert - zwischenergebnis > 1E-5);

    }
}
