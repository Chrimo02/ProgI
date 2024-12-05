public class KreisUndKugel{

    public static double kreisinhalt(float r) {
        return Math.PI * (r * r);
    }
    public static double kreisumfang(float r){
        return Math.PI * (2 * r);
    }
    public static double kugelvolumen(float r){
        return Math.PI * (4/3f) * (r * r * r);
    }
    public static void main(String[] args){
        float r = 5f;
        System.out.println("Kreisumfang =" + kreisumfang(r));
        System.out.println("Kreisfläche =" + kreisinhalt(r));
        System.out.println("Kugelvolumen =" + kugelvolumen(r));
    }

}