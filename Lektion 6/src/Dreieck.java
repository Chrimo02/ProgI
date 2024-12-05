import java.util.Scanner;
public class Dreieck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Zeilen soll das Sternendreieck haben?");
        int lines = scanner.nextInt();
        System.out.println(dreiecke(lines));
        scanner.close();
    }

    public static String dreiecke(int x)
    {
        String pyramid = "";
        // String für Endausgabe definieren und als "leer" initialisieren
        for (int i = 1; i<=x; i++)
        // generelle Laufzeit des Schleifenvorgangs mit Integer als Parameter festlegen
            // erster Schleifendurchlauf wird mit i=1 ausgeführt, jeder weitere mit einem um 1 erhöhten i:
        {
            for (int z = 1; z<=x - i; z++)
                /*"z <= x-i" weil für die Zentrierung der sterne immer genau soviele Leerzeichen,
                wie die Differenz der maximalen Sterne pro zeile (= x) und der aktuellen Zeile (= i, bzw. aktueller schleifendurchlauf der äußersten Schleife)
                benötigt werden. Hierdurch kann die anzahl der Leerzeichen pro Durchlauf der äußersten Schleife für jede neue Zeile um eins verringert werden und wir
                erhalten eine zentrierte Ausgabe des Dreiecks aus Sternen.
                 */
            {
                pyramid += " ";
            }

            for (int p = 1; p<=i; p++)
            /* "p<=i" weil sich die Anzahl der Sterne für eine neue Zeile simultan mit jedem neuen Durchlauf der äußersten Schleife um eins erhöhen soll.
                Es wird somit sichergestellt, dass erst wenn die äußere Schleife einmal komplett durchgelaufen ist, eine Erhöhung des Counters p erfolgt und somit
                für jeden neuen Schleifendurchlauf genau ein weiterer Stern hinzuaddiert wird.
            */
            {
                pyramid += " *";
            }

            pyramid += "\n";
            /*
                Nachdem zuerst die benötigten Leerzeichen addiert wurden und anschließend die dem Schleifendurchlauf enstprechende Anzahl an Sternen addiert wurden
                wird mit der Escape-Sequenz \n in eine neue Zeile gesprungen, bevor der nächste Durchlauf der äußersten for-Schleife gestartet wird.
             */
        }
        return pyramid;
        /*
            Nachdem die äußerste Schleife in der von der User-Eingabe festgelegten Anzahl ausgeführt wurde, wird der return-String der Methode "dreiecke" auf unseren
            in den for-Schleifen laufend aktualisierten String "pyramid" festgelegt.
         */
    }
}
