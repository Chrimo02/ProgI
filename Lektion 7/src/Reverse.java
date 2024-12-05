public class Reverse {
    public static void main(String[] args){
        String test = "Übung Programmieren 1";
        System.out.println(reverse(test));
    }

    public static String reverse(String input){
        char[] eingabe = input.toCharArray();
        char[] ausgabe = new char[eingabe.length];

        for (int i = 0; eingabe.length> i; i++){
            ausgabe[i] = eingabe[(eingabe.length-1)-i];
        }
        return String.valueOf(ausgabe);
    }
}
