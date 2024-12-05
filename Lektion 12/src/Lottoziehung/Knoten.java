package Lottoziehung;

public class Knoten {

    int lottozahl;
    Knoten next;
    public Knoten(int zahl){
        this.lottozahl = zahl;
    }

    public int getLottozahl() {
        return lottozahl;
    }
    public void setLottozahl(int zahl){
        this.lottozahl = zahl;
    }
}
