public class VergleichKommazahlen {
    public static void main(String[] args) {
        double d = 4.4;
        d= d-1.1;

        final double EPSILON = 1.0e-5;

        if ((d-3.3 >= -EPSILON) && (d-3.3 <= EPSILON));
        System.out.println("vamos");
        System.out.println(d);

    }
}
