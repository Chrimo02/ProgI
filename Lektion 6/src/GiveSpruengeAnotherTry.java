public class GiveSpruengeAnotherTry {
    public static void main(String[] args) {
        int distanz = 4;
        int sprung1 = 2;
        int sprung2 = 1;
        System.out.println(springeInMehrerenSpruengen(distanz, sprung1, sprung2));
    }

    public static int springeInMehrerenSpruengen(int distanz, int sprung1, int sprung2){
        if (distanz < 0 && distanz < sprung1 && distanz < sprung2) return 0;
        if (distanz == 0) return 1;
        return (springeInMehrerenSpruengen(distanz-sprung1, sprung1, sprung2)) + springeInMehrerenSpruengen(distanz-sprung2, sprung1, sprung2);
    }
}
