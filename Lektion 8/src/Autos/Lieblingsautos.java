package Autos;

public class Lieblingsautos {
    public static void main(String[] args) {
        //erstes Auto
        Auto eins = new Auto();
        eins.marke = "Ferrari";
        eins.name = "F40";
        eins.farbe = "rot";
        eins.hubraum = 2936;
        eins.fahrzeugklasse = "Sportwagen";
        //zweites Auto
        Auto zwei = new Auto();
        zwei.marke = "DMC";
        zwei.name = "DeLorean DMC-12";
        zwei.farbe = "silber";
        zwei.hubraum = 2849;
        zwei.fahrzeugklasse = "Sportwagen";
        //drittes Auto
        Auto drei = new Auto();
        drei.marke = "Chevrolet";
        drei.name = "Camaro Z28 (1979)";
        drei.farbe = "dunkelblau";
        drei.hubraum = 5733;
        drei.fahrzeugklasse = "Sportwagen";

        Auto[] favorites = new Auto[] {eins,zwei,drei};
        int[] hubraum = new int[favorites.length];

        for (int i = 0; i<hubraum.length; i++){
            hubraum[i] = favorites[i].hubraum;
        }

        for (int j = 0; j< favorites.length; j++){
            if (favorites[j].hubraum == maximum(hubraum)) {
                System.out.println("Hier das Auto mit dem größten Hubraum:\n");
                System.out.println("Marke: " + favorites[j].marke + "\n" + "Name: " + favorites[j].name + "\n" + "Farbe: " + favorites[j].farbe + "\n" + "Hubraum in Kubikzentimeter: " + favorites[j].hubraum + "\n" + "Fahrzeugklasse: " + favorites[j].fahrzeugklasse);
            }
        }
    }

    public static int maximum(int[] zahlen){

        int maximum = zahlen[0];
        int puffer;
        for (int z = 0; z< zahlen.length-1;z++){
            if (zahlen[z+1] > maximum)
            {
                maximum = zahlen[z+1];
                puffer = zahlen[z];
                zahlen[z] = zahlen[z+1];
                zahlen[z+1] = puffer;
            }
        }
        return maximum;
    }
}