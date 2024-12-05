import java.time.LocalTime;

public class Uhrzeit {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        int stunden = now.getHour();
        int minuten = now.getMinute();
        int sekunden = now.getSecond();

        int sekundenSeitMitternacht;
        sekundenSeitMitternacht = (stunden * 60 * 60) + (minuten * 60) + sekunden;

        final int sekundenProTag;
        sekundenProTag = (24 * 60 * 60);

        int verbleibendeSekunden;
        verbleibendeSekunden = sekundenProTag - sekundenSeitMitternacht;

        float prozentDesTages;
        prozentDesTages = (float)(sekundenSeitMitternacht * 100) / sekundenProTag;
        
        System.out.println("Vergangene Sekunden seit Mitternacht: " + sekundenSeitMitternacht);
        System.out.println("Heute verbleibende Sekunden: " + verbleibendeSekunden);
        System.out.println("So viel Prozent des Tages sind bereits vergangen: " + prozentDesTages + "%");
    }

}
