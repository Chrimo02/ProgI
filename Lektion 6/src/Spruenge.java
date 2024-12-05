public class Spruenge {
    public static void main(String[] args){
        System.out.println(springeInMehrerenSpruengen(4,2,1));
    }

    public static int springeInMehrerenSpruengen(int distanz, int sprungweite1, int sprungweite2){
        int counter = 0;


            if (distanz%sprungweite1 == 0){
                counter += 1;
            }

            if (distanz%sprungweite2 == 0){
                counter += 1;
            }

            if ((distanz-sprungweite1)%sprungweite2 == 0){
                counter += 1;
            }

            if ((distanz-sprungweite2)%sprungweite1 == 0){
                counter += 1;
            }

            int neuezahl = 0;
            for (int i = distanz-(sprungweite1+sprungweite2); i>=0; i--)
            {
                if ((sprungweite1+sprungweite2+neuezahl == distanz)){
                    neuezahl = neuezahl + sprungweite1;
                    break;
                }
                neuezahl = neuezahl + sprungweite1;
            }
            if (neuezahl == distanz){
                counter += 1;
            }

        return counter;
    }



}




