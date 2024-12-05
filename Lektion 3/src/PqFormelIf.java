public class PqFormelIf {
    public static void main(String[] args) {

        double p = 5;
        double q = 200;
        double diskriminante = p*p/4.0 - q;
        if (diskriminante >= 0)
        {
            System.out.println(Math.sqrt(diskriminante));
        }
    }
}
