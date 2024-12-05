public class Temperaturumwandlung {
    public static void main(String[] args){

        System.out.println("Fahrenheit\tCelsius");
        for (int fahrenheit = 0; fahrenheit <= 300; fahrenheit++){
            double celsius = 5.0/9.0*(fahrenheit-32.0);
            celsius = Math.round(100.0 * celsius)/100.0;
            System.out.println(fahrenheit + "\t\t\t" + celsius);

        }
    }
}
