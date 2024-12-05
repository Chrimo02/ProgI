package DoppeltverketteteListe;

public class Personenknoten {

    private int alter;
    private String nachname;
    Personenknoten next;
    Personenknoten previous;

    public Personenknoten(int alter, String nachname){
        this.alter = alter;
        this.nachname = nachname;
        this.next = null;
        this.previous = null;
    }

    public int getAlter(){
        return this.alter;
    }
    public String getNachname(){
        return this.nachname;
    }
}
