package BinaryTree;

public class Knoten {
    String wort;
    String bedeutung;
    Knoten left;
    Knoten right;

    public Knoten(String wort, String bedeutung){
        this.wort = wort;
        this.bedeutung = bedeutung;
    }

    public String getWort(){
        return this.wort;
    }
    public String getBedeutung(){
        return this.bedeutung;
    }
}
