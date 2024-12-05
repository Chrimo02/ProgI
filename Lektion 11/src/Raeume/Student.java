package Raeume;

public class Student {
    final private String vorname;
    final private String nachname;
    final private int matrikelnummer;
    private boolean handUp;


    public Student(String vn, String nn, int m){
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
    public void setHandUp(boolean bool){
        this.handUp = bool;
    }
    public boolean isHandUp(){
        return this.handUp;
    }

    public void printStudentendaten(){
        System.out.println("Vorname: " + this.vorname);
        System.out.println("Nachname: " + this.nachname);
        System.out.println("Matrikelnummer: " + this.matrikelnummer);

    }


}

