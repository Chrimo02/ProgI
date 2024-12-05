package Pizzas;

public class PizzaTest {
    public static void main(String[] args){
        Pizza nummerEins = new Pizza("Mageritha", 24,7.5f,27,8.5f,30,9.2f);
        Pizza nummerZwei = new Pizza("Salami", 24,8.5f,27,9.7f,30,10.3f);
        Pizza nummerDrei = new Pizza("Schinken", 24,8.7f,27,9.8f,30,10.5f);
        Pizza nummerVier = new Pizza("Spezial", 24,9f,27,10.4f,30,11.5f);
        Pizza nummerFuenf = new Pizza("Diavolo", 24,9.2f,27,10.6f,30,12f);

        nummerEins.bestePreisLeistung(nummerEins);
        System.out.println();
        nummerZwei.bestePreisLeistung(nummerZwei);
        System.out.println();
       nummerDrei.bestePreisLeistung(nummerDrei);
        System.out.println();
       nummerVier.bestePreisLeistung(nummerVier);
        System.out.println();
       nummerFuenf.bestePreisLeistung(nummerFuenf);

    }
}
