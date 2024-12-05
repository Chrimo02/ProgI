package Raeume;

public class RoomTest {
    public static void main(String[] args) {

        Raum raum1 = new Raum("I.2.1",7,5,3);
        Raum raum2 = new Raum("I.2.215",10,5,4);

        Student hansWurst99 = new Student("Hans","Wurst",99);
        Student peterChen = new Student("Peter","Chen", 98);
        Student walterFrosch = new Student("Walter","Frosch",97);
        Student peterLustig = new Student("Peter","Lustig",96);
        Student danielJung = new Student("Daniel", "Jung", 95);
        Student haraldLesch = new Student("Harald", "Lesch", 94);
        Student elonMusk = new Student("Elon", "Musk", 93);
        Student steveJobs = new Student("Steve", "Jobs", 92);

        System.out.println(raum1.createCurrentRoomPlan(true));

        raum1.betreteRaum(hansWurst99);
        raum1.betreteRaum(walterFrosch);
        raum1.betreteRaum(peterChen);
        raum1.betreteRaum(peterLustig);
        raum1.betreteRaum(danielJung);
        raum1.betreteRaum(haraldLesch);
        raum1.betreteRaum(steveJobs);
        raum1.betreteRaum(elonMusk);

        System.out.println(raum1.createCurrentRoomPlan(true));

        System.out.println("Folgende Studenten befinden sich aktuell im Raum:\n");
        raum1.printAnwesenheit(raum1.getAnwesenheitsliste(),true);

        System.out.println("Herr Balzer hat eine Frage gestellt, wer möchte Sie beantworten?");
        raum1.handsUp(true);
        
        raum1.printAnwesenheit(raum1.getAnwesenheitsliste(),true);

    }
}
