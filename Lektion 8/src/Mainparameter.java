public class Mainparameter {
    public static void main(String[] args){

        if (args.length != 2){
            System.out.println("FEHLER - Sie müssen exakt 2 Zahlen als Parameter für den Programmstart übergeben!");
        }
        else {
            double ergebnis = Double.valueOf(args[0]) * Double.valueOf(args[1]);
            System.out.println(ergebnis);
        }
    }
}

//Aufrufen über Terminal nicht möglich wegen:
// Fehler: Hauptklasse Mainparameter konnte nicht gefunden oder geladen werden
// Ursache: java.lang.ClassNotFoundException: Mainparameter

