package Raeume;

public class Raum {

//Definition der Attribute eines jeden Raums:
    private final String kennung;
    private int reihen;
    private int plaetzeProReihe;
    private boolean belegt;
    private Student[][] anwesenheitsliste;

//Konstruktoren:
    public Raum(String k, int reihen,int plaetzeProReihe){
        this.kennung = k;
        this.reihen = reihen;
        this.plaetzeProReihe = plaetzeProReihe;
        this.belegt = false;
        this.anwesenheitsliste = new Student[reihen][plaetzeProReihe];

    }
    public Raum(String k, int reihen,int plaetzeProReihe,int mehrStuehleAbReihe){
        this.kennung = k;
        this.reihen = reihen;
        this.plaetzeProReihe = plaetzeProReihe;
        this.belegt = false;
        this.anwesenheitsliste = new Student[reihen][];
        int counter = 2;
        for (int i=0; i<reihen;i++){
            if (i >= mehrStuehleAbReihe){
                this.anwesenheitsliste[i] = new Student[plaetzeProReihe+counter];
                counter = counter + 2;
            }
            else {
                this.anwesenheitsliste[i] = new Student[plaetzeProReihe];
            }

        }

    }
//Setter- und getter-Methoden:
    public String getKennung(){
        return kennung;
    }
    public void setBelegt(boolean belegt){
        this.belegt = belegt;
    }
    public boolean isBelegt(){
        return belegt;
    }
    public Student[][] getAnwesenheitsliste() {
        return anwesenheitsliste;
    }
    public void setAnwesenheitsliste(Student student,int reihe, int platz){
        this.anwesenheitsliste[reihe][platz] = student;
    }

//Methoden zum Raum betreten und verlassen:
    public void betreteRaum(Student student){
        boolean platzGefunden = false;
        for (int i = 0; i<this.getAnwesenheitsliste().length;i++){
            if (platzGefunden){
                break;
            }
            for (int j = 0; j<this.getAnwesenheitsliste()[i].length;j++){
                if (this.getAnwesenheitsliste()[i][j] == null){
                    this.setAnwesenheitsliste(student,i,j);
                    platzGefunden = true;
                    break;
                }
            }
        }
    }
    public void verlasseRaum(Student student){
        boolean hatVerlassen = false;
        for (int i = 0; i<this.anwesenheitsliste.length;i++){
            if (hatVerlassen){
                break;
            }
            for (int j = 0; j<this.anwesenheitsliste[i].length;j++){
                if (this.anwesenheitsliste[i][j] == student){
                    this.setAnwesenheitsliste(null,i,j);
                    hatVerlassen = true;
                    break;
                }
            }
        }
    }
//Methode zur Ausgabe der Daten der in einem Raum anwesenden Studenten in der Konsole:
    public void printAnwesenheit(Student[][] students,boolean handUp){
        for (int i = 0; i<this.anwesenheitsliste.length;i++){
            for (int j = 0; j<this.anwesenheitsliste[i].length;j++){
                if (null != this.anwesenheitsliste[i][j]){
                    this.anwesenheitsliste[i][j].printStudentendaten();
                    if (this.anwesenheitsliste[i][j].isHandUp()){
                        System.out.println("Hat die Hand gehoben!");
                    }
                    System.out.println();
                }
            }


        }
    }
//Methode zur erstellung eines Raumplans, per parameter true/false kann gewählt werden, ob leere Plätze angezeigt werden sollen (= true) oder nicht
    public String createCurrentRoomPlan(boolean showEmptyChair){
        String roomPlan = "";
        System.out.println("Raumbelegung " + this.kennung + ":");
        for (int i = 0; i<this.anwesenheitsliste.length;i++){
            for (int k = 0; k<this.anwesenheitsliste[anwesenheitsliste.length-1].length-this.anwesenheitsliste[i].length;k++){
                roomPlan = roomPlan + " ";
            }
            for (int j = 0; j<this.anwesenheitsliste[i].length;j++){
                if (showEmptyChair){
                    if (this.anwesenheitsliste[i][j] == null){
                        roomPlan = roomPlan + "__" + " ";
                    }
                    else {
                        roomPlan = roomPlan + this.anwesenheitsliste[i][j].getVorname().charAt(0) + this.anwesenheitsliste[i][j].getVorname().charAt(1) + " ";
                    }
                }
                else {
                    if (this.anwesenheitsliste[i][j] == null){
                        continue;
                    }
                    roomPlan = roomPlan + this.anwesenheitsliste[i][j].getVorname().charAt(0) + this.anwesenheitsliste[i][j].getVorname().charAt(1) + " ";
                }
                if (j == this.anwesenheitsliste[i].length-1) {
                    roomPlan = roomPlan + "\n";
                }
            }
        }
        return roomPlan;
    }

//Methoden zum Heben oder Senken der Hände der Studenten, bzw. eines Studenten:
    //Alle anwesenden Studenten:
    public void handsUp(boolean value){
        for (int i = 0; i<this.anwesenheitsliste.length;i++){
            for (int j= 0; j<this.anwesenheitsliste[i].length;j++){
                if (this.anwesenheitsliste[i][j] != null) {
                    this.anwesenheitsliste[i][j].setHandUp(value);
                }
            }
        }
    }
    //Nur ein einzelner Student:
    public void handsUp(boolean value, Student student){
        for (int i = 0; i<this.anwesenheitsliste.length;i++){
            for (int j= 0; j<this.anwesenheitsliste[i].length;j++){
                if (this.anwesenheitsliste[i][j] == student){
                    this.anwesenheitsliste[i][j].setHandUp(value);
                }
            }
        }
    }
}
