package Raeume;

public class Raum {

    private final String kennung;
    private final int kapazitaet;
    private boolean belegt;

    public Raum(String k, int kap, boolean b){
        this.kennung = k;
        this.kapazitaet = kap;
        this.belegt = b;
    }

    public String getKennung(){
        return kennung;
    }
    public int getKapazitaet(){
        return kapazitaet;
    }
    public void setBelegt(boolean belegt){
        this.belegt = belegt;
    }
    public boolean isBelegt(){
        return belegt;
    }

    public static void main(String[] args){
        Raum raum1 = new Raum("I.2.1",30,false);
        Raum raum2 = new Raum("I.2.15",40,false);
        if (raum1.isBelegt()) System.out.println(raum1.getKennung() + " ist belegt!");
        else System.out.println(raum1.getKennung() + " ist frei und kann belegt werden");

        if (raum2.isBelegt()) System.out.println(raum2.getKennung() + " ist belegt!");
        else System.out.println(raum2.getKennung() + " ist frei und kann belegt werden");

        //I.2.1 als belegt setzen:
        raum1.setBelegt(true);
        System.out.println();
        //räume erneut auf Belegung prüfen:
        if (raum1.isBelegt()) System.out.println(raum1.getKennung() + " ist belegt!");
        else System.out.println(raum1.getKennung() + " ist frei und kann belegt werden");

        if (raum2.isBelegt()) System.out.println(raum2.getKennung() + " ist belegt!");
        else System.out.println(raum2.getKennung() + " ist frei und kann belegt werden");

        // Überprüfung auf belegt oder frei besser in eigener Methode

    }
}
