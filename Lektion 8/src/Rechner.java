public class Rechner {
    public static void main(String[] args) {
        double ergebnis = 0;
        if (args[args.length-1].equals("+")){
            for (int i = 0; i< args.length-1; i++){
                ergebnis = ergebnis + Double.valueOf(args[i]);
            }
        }
        else {
            ergebnis = Double.valueOf(args[0]);
            for (int j = 0; j< args.length-1; j++){
                ergebnis = ergebnis - Double.valueOf(args[j]);
            }
        }
        System.out.println(ergebnis);
    }
}
