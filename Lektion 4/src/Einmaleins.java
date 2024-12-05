public class Einmaleins {
    public static void main(String[] args) {
        System.out.println("fünf, sechs, sieben, acht - Das kleine Einmal eins ist gleich gemacht!");
        for (int konstante = 1; konstante <= 10; konstante++) {
            System.out.print("\n");
            for (int faktor = 1; faktor <= 10; faktor++) {
                System.out.println(konstante + " x " + faktor + " = " + faktor * konstante);
            }
        }
    }
}