package Pizzas;

public class Pizza {

    String name;
    int durchmesser1;
    float preis1;
    int durchmesser2;
    float preis2;
    int durchmesser3;
    float preis3;

    public Pizza(String n, int d1, float p1, int d2, float p2, int d3, float p3){
        this.name = n;
        this.durchmesser1 = d1;
        this.durchmesser2 = d2;
        this.durchmesser3 = d3;
        this.preis1 = p1;
        this.preis2 = p2;
        this.preis3 = p3;
    }

    public void bestePreisLeistung(Pizza pizza){


        double pL1 = this.durchmesser1/this.preis1;
        double pL2 = this.durchmesser2/this.preis2;
        double pL3 = this.durchmesser3/this.preis3;
        double zwischenspeicher;
        double[] vergleich = new double[]{pL1,pL2,pL3};
        for (int i = 0; i<vergleich.length-1; i++){
            if (vergleich[i] < vergleich[i+1]){
                zwischenspeicher = vergleich[i];
                vergleich[i] = vergleich[i+1];
                vergleich[i+1] = zwischenspeicher;
            }
        }
        double best = vergleich[0];
        if (best == pL1) System.out.println("Das beste Preisleistungsverhältnis für die Pizza " + this.name + " hat die Kombination: \nDurchmesser = " + this.durchmesser1 + "\nPreis = " +this.preis1 + "\nPreisleistung (Durchmesser/Preis) = " + pL1);
        if (best == pL2) System.out.println("Das beste Preisleistungsverhältnis für die Pizza " + this.name + " hat die Kombination: \nDurchmesser = " + this.durchmesser2 + "\nPreis = " + this.preis2 + "\nPreisleistung (Durchmesser/Preis) = " + pL2);
        if (best == pL3) System.out.println("Das beste Preisleistungsverhältnis für die Pizza " + this.name + "hat die Kombination: \nDurchmesser = " + this.durchmesser3 + "\nPreis = " + this.preis3 + "\nPreisleistung (Durchmesser/Preis) = " + pL3);
    }

}
