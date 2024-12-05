package Autos;

public class Auto {
    String marke;
    int hubraum;
    String farbe;
    String name;
    String fahrzeugklasse;

    private static int anzahlAutos = 0;

    public Auto(String m, int h, String f, String n, String fzk){
        marke = m;
        if (h > 0){
            hubraum = h;
        }
        else {
            hubraum = 1600;
        }
        farbe = f;
        name = n;
        fahrzeugklasse = fzk;
        anzahlAutos++;
    }

    public void setHubraum(int ccm){
        if (ccm > 0){
            this.hubraum = ccm;
        }
        else {
            this.hubraum = hubraum;
        }

    }


    public static int getAnzahlAutos() {
        return anzahlAutos;
    }
}


