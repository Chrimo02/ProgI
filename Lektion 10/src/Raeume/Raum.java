package Raeume;

public class Raum {

    private final String kennung;
    private final int kapazitaet;
    private boolean belegt;
    private Studenten[] anwesenheitsliste;

    public Raum(String k, int kap){
        this.kennung = k;
        this.kapazitaet = kap;
        this.belegt = false;
        this.anwesenheitsliste = new Studenten[kapazitaet];
        this.counter = 0;

    }

    private int counter;
    public void betreteRaum(Studenten student){
        if (this.counter >= this.kapazitaet){
            System.out.println("Der Raum ist voll - keine weiteren Beitritte möglich bis jemand den Raum verlässt!");
        }
        else {
            anwesenheitsliste[counter] = student;
            counter++;
        }
    }

    public void verlasseRaum(Studenten student){
        for (int i = 0; i<kapazitaet;i++){
            if (counter <1) {
                System.out.println("Nein Pascal, es ist niemand mehr im Raum!");
                return;
            }
            if (anwesenheitsliste[i] == student){
                anwesenheitsliste[i] = null;
                counter--;
            }
        }
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

    public Studenten[] getAnwesenheitsliste() {
        return anwesenheitsliste;
    }

    public void printAnwesenheit(Studenten[] anwesend){
        for (int i = 0; i<this.anwesenheitsliste.length;i++){

            //Diese Logik gehört eigentlich in die Studenten-Klasse ("Tell, don't ask")
            System.out.println("Matrikelnummer: " + anwesend[i].getMatrikelnummer());
            System.out.println("Vorname: " + anwesend[i].getVorname());
            System.out.println("Nachname: " + anwesend[i].getNachname());
            System.out.println();
        }
    }

    public static void main(String[] args){
        Raum raum1 = new Raum("I.2.1",1);
        Raum raum2 = new Raum("I.2.15",10);
        Studenten hansWurst99 = new Studenten("Hans","Wurst",1);
        Studenten peterChen = new Studenten("Peter","Chen", 98);
        Studenten walterFrosch = new Studenten("Walter","Frosch",97);
        Studenten peterLustig = new Studenten("Peter","Lustig",96);
        Studenten danielJung = new Studenten("Daniel", "Jung", 95);

        raum1.betreteRaum(hansWurst99);
        raum1.verlasseRaum(hansWurst99);
        raum1.betreteRaum(walterFrosch);
        //raum1.betreteRaum(peterChen);
        //raum1.betreteRaum(peterLustig);
        //raum1.betreteRaum(danielJung);

        System.out.println("Folgende Studenten befinden sich aktuell im Raum:");
        raum1.printAnwesenheit(raum1.getAnwesenheitsliste());

        raum1.verlasseRaum(hansWurst99);
        raum1.verlasseRaum(peterChen);
        raum1.verlasseRaum(peterLustig);
        raum1.verlasseRaum(walterFrosch);
        raum1.verlasseRaum(danielJung);





    }
}
