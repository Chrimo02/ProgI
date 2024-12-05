public class Wuerfelwurf {
    public static void main(String[] args){

        int wurf = (int) (1+ (Math.random()*6));

        if (wurf == 1)System.out.println("Eins gewürfelt");
        if (wurf == 2)System.out.println("Zwei gewürfelt");
        if (wurf == 3)System.out.print("Drei gewürfelt");
        if (wurf == 4)System.out.print("Vier gewürfelt");
        if (wurf == 5)System.out.print("Fünf gewürfelt");
        if (wurf == 6)System.out.print("Sechs gewürfelt");
    }
}
