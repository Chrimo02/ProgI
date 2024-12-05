package Lottoziehung;

public class Lotto {
    public static void main(String[] args) {

        Knoten start = null;
        start = new Knoten(1);
        Knoten k;
        k = new Knoten(2);
        start.next = k;
        Knoten temp = start;
        for (int i = 3; i<52;i++){
            k = new Knoten(i);
            while (temp.next != null){
                //System.out.println(temp.getLottozahl());
                temp = temp.next;
            }
            temp.next = k;
        }

        int[] lottozahlen = new int[6];
        int ziehung;
        Knoten ziel;
        Knoten einsVorZiel;

        for (int i = 0; i<lottozahlen.length;i++){
            einsVorZiel = start;
            ziel = start.next;
            ziehung = generateRandomIndex(49);
            if (einsVorZiel.getLottozahl() == ziehung){
                lottozahlen[i] = einsVorZiel.getLottozahl();
            }
            else {
                while (ziel.next != null && ziel.getLottozahl() != ziehung) {
                    ziel = ziel.next;
                    einsVorZiel = einsVorZiel.next;
                }
                ziel = ziel.next;
                einsVorZiel = einsVorZiel.next;
                if (ziel == null){
                    i--;
                }
                else {
                    if (ziel.getLottozahl()>49){
                        i--;
                        continue;
                    }
                    lottozahlen[i] = ziel.getLottozahl();
                    einsVorZiel.next = ziel.next;
                }
            }
        }

        sort(lottozahlen);
        for (int i = 0; i<lottozahlen.length;i++){
            System.out.println(lottozahlen[i]);
        }
    }

    public static void sort(int[] array){
        int puffer;
        for (int i = 1; i<array.length;i++){
            if (array[i-1] > array[i]){
                puffer = array[i-1];
                array[i-1] = array[i];
                array[i] = puffer;
                i = 0;
            }
        }
    }

    public static int generateRandomIndex(int obergrenze){
        return (int) (1+Math.random()*obergrenze);
    }

}


