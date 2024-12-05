public class Kapital {
    public static void main(String[] args){
        float kapital = 100;
        float zinssatz = 4.5f;
        float neuesKapital = kapital;

        for (int i = 1; i <= 15; i++){
            neuesKapital = neuesKapital + neuesKapital*zinssatz/100.0f;
            System.out.println("Kapital nach Jahr " + i + ": " + neuesKapital);
        }
    }
}
