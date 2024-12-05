package Autos;
public class AutoFabrik {


    private static int gebauteAutos = 0;
    private static Auto[] fertigeAutos = new Auto[100];

    public void produziere(String m, int h, String f, String n, String fzk){
        fertigeAutos[gebauteAutos] = new Auto(m,h,f,n,fzk);
        System.out.println("Marke: " + fertigeAutos[gebauteAutos].marke);
        System.out.println("Name: " + fertigeAutos[gebauteAutos].name);
        System.out.println("Farbe: " + fertigeAutos[gebauteAutos].farbe);
        System.out.println("Hubraum: " + fertigeAutos[gebauteAutos].hubraum);
        System.out.println("Fahrzeugklasse: " + fertigeAutos[gebauteAutos].fahrzeugklasse);
        gebauteAutos++;
        System.out.println();
        System.out.println("Bisher wurden schon " + gebauteAutos + " Autos in der Fabrik gebaut.");
    }
}
