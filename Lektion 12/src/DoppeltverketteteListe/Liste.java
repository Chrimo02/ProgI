package DoppeltverketteteListe;

public class Liste {

    Personenknoten start;

    public Liste(Personenknoten person){
        this.start = person;
    }
    public void sortiertEinfuegen(Personenknoten k){
        if (k.getAlter() <= start.getAlter()){
            start.previous = k;
            k.next = start;
            start = k;
            return;
        }
        Personenknoten temp = start.next;
        Personenknoten oldtemp = start;
        while (temp != null){
            if (k.getAlter()<temp.getAlter()){
                temp.previous = k;
                k.next = temp;
                oldtemp.next = k;
                k.previous = oldtemp;
                return;
            }
            else {
                    oldtemp = temp;
                    temp = temp.next;
            }
        }
        temp = start;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = k;
        k.previous = temp;
    }
    public Personenknoten searchLastName(String nachname){
        Personenknoten temp = start;
        while (!(nachname.equals(temp.getNachname()))){
            temp = temp.next;
        }
        return temp;
    }

}
