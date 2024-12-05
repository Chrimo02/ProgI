public class Tausch {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        //Vor dem Tausch
        System.out.println(x);
        System.out.println(y);
        //Tausch
        int temp;
        temp = x;
        x = y;
        y = temp;

        //Nach dem Tausch
        System.out.println(x);
        System.out.println(y);
    }
}