public class Betrag {

    public static void main(String[] args) {
        int a = -5;
        float b = -5;
        double c = -5;
        short d = -5;
        long e = -5;

        System.out.println(betrag(a));
        System.out.println(betrag(b));
        System.out.println(betrag(c));
        System.out.println(betrag(d));
        System.out.println(betrag(e));

    }

    public static int betrag(int i){
        if (i<0){
            i = i*(-1);
        }
        return i;
    }

    public static float betrag(float i){
        if (i<0){
            i = i*(-1);
        }
        return i;
    }

    public static double betrag(double i){
        if (i<0){
            i = i*(-1);
        }
        return i;
    }

    public static short betrag(short i){
        if (i<0){
            i = (short) (i*(-1));
        }
        return i;
    }
    public static long betrag(long i){
        if (i<0){
            i = (i*(-1));
        }
        return i;
    }


}
