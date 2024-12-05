import java.util.Scanner;
public class Pizzarechner {
    public static void main(String[] args){

        Scanner pizzamessgeraet = new Scanner(System.in);

        System.out.println("Welchen Durchmesser hat die erste gewünschte Pizza?");
        int durchmesserPizza1 = pizzamessgeraet.nextInt();
        System.out.println("Was kostet die erste gewünschte Pizza?");
        double preis1 = pizzamessgeraet.nextDouble();

        System.out.println("Welchen Durchmesser hat die zweite gewünschte Pizza?");
        int durchmesserPizza2 = pizzamessgeraet.nextInt();
        System.out.println("Was kostet die zweite gewünschte Pizza?");
        double preis2 = pizzamessgeraet.nextDouble();


        double flaechePizza1 = (durchmesserPizza1 * 0.5)*(durchmesserPizza1 * 0.5)*Math.PI;
        double flaechePizza2 = (durchmesserPizza2 * 0.5)*(durchmesserPizza2 * 0.5)*Math.PI;


        double preisLeistung1 = preis1/flaechePizza1;
        double preisLeistung2 = preis2/flaechePizza2;


        if ( preisLeistung1 == preisLeistung2) System.out.println("Beide Pizzagrößen haben das gleiche Größen-/Preisverhältnis - Buon Appetito!");
        else if (preisLeistung1 < preisLeistung2) System.out.println("Die Pizza mit dem Durchmesser " + durchmesserPizza1 + "cm hat das bessere Größen-/Preisverhältnis - Buon Appetito!");
        else System.out.println("Die Pizza mit dem Durchmesser " + durchmesserPizza2 + "cm hat das bessere Größen-/Preisverhältnis - Buon Appetito!");
    }
}
