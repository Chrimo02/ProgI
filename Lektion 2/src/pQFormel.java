public class pQFormel {

    public static void main(String[] args){

        float p = 5;
        float q = 2;
        double x1 = (float) (- (p/2) + Math.sqrt((p/2)*(p/2)-q));
        double x2 = (float) (- (p/2) - Math.sqrt((p/2)*(p/2)-q));

        System.out.println("x1 =" + x1);
        System.out.println("x2 =" + x2);
        
    }
}
