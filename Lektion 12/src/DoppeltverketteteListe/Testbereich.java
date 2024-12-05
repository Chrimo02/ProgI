package DoppeltverketteteListe;

public class Testbereich {
    public static void main(String[] args) {
        Personenknoten a = new Personenknoten(20, "Ronaldo");
        Personenknoten b = new Personenknoten(25, "Zidane");
        Personenknoten c = new Personenknoten(99, "Dübel");
        Personenknoten d = new Personenknoten(44, "Rummenigge");
        Personenknoten e = new Personenknoten(44, "Beckenbauer");

        Liste legends = new Liste(a);


        legends.sortiertEinfuegen(b);
        legends.sortiertEinfuegen(c);
        legends.sortiertEinfuegen(d);
        legends.sortiertEinfuegen(e);

        Personenknoten temp = legends.start;

        while (temp!= null){
            System.out.print("Name: " + temp.getNachname() + " (" + temp.getAlter() + "), ");
            if (temp.next == null){
                break;
            }
            else {
                temp = temp.next;
            }
        }

        System.out.println();

        while (temp != null){
            System.out.print("Name: " + temp.getNachname() + " (" + temp.getAlter() + "), ");
            temp = temp.previous;
        }

        //System.out.println(legends.searchLastName("Beckenbauer").getNachname());


    }
}
