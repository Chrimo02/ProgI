package Raeume;

public class Studenten {
    final private String vorname;
    final private String nachname;
    final private int matrikelnummer;

    private Raum aufenthaltsort;

    public Studenten(String vn, String nn, int m){
        this.vorname = vn;
        this.nachname = nn;
        this.matrikelnummer = m;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
}

