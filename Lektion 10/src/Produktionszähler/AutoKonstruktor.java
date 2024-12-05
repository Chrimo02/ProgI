package Produktionszähler;

    public class AutoKonstruktor {
        public static void main(String[] args){
            Auto testauto1= new Auto("Porsche",-5,"Mattschwarz","911 Carrera","Sportwagen");
            testauto1.setHubraum(4444);
            Auto testauto2= new Auto("Chevrolet",-5,"Dunkelblau","Camaro Z28","Muscle-Car");
            testauto2.setHubraum(5555);
            Auto testauto3= new Auto("Ferrari",-5,"Rot","F40","Sportwagen");
            testauto3.setHubraum(7777);
            System.out.println(Auto.getAnzahlAutos()); // a) static variante

            AutoFabrik thwsMotorworks = new AutoFabrik();

            thwsMotorworks.produziere("Fiat",3,"Pink","Multipla","Gurke");
            thwsMotorworks.produziere("Fiat",3,"Rot","Multipla","Gurke");
            thwsMotorworks.produziere("Fiat",3,"Grün","Multipla","Gurke");
            thwsMotorworks.produziere("Fiat",3,"Gelb","Multipla","Gurke");


        }
    }
