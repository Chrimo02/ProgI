package Textdokument;

public class Textdokument {

    public char[][] zeilenUndSpalten;
    public Textdokument(int zeilen){
        this.zeilenUndSpalten = new char[zeilen][50];
        for (int i = 0; i<this.zeilenUndSpalten.length;i++){
            for (int j=0; j<this.zeilenUndSpalten[i].length;j++){
                this.zeilenUndSpalten[i][j] = 'a';
            }
        }
    }

    public int zaehleZeichen(){
        int anzahlZeichen = 0;
        for (int i=0;i<this.zeilenUndSpalten.length;i++){
            for (int j=0;j<this.zeilenUndSpalten[i].length;j++){
                if (!(this.zeilenUndSpalten[i][j] == ' ')){
                    anzahlZeichen++;
                }
            }
        }
        return anzahlZeichen;
    }

    public boolean vertauscheZeilen(int startLine,int destinationLine){
        if (startLine > this.zeilenUndSpalten.length || destinationLine > this.zeilenUndSpalten.length){
            return false;
        }
        else {
            char[] puffer = this.zeilenUndSpalten[startLine];
            this.zeilenUndSpalten[startLine] = this.zeilenUndSpalten[destinationLine];
            this.zeilenUndSpalten[destinationLine] = puffer;
            return true;
        }
    }

    public void fuegeEinTextdokument(Textdokument einzufuegenderInhalt,int zeile){
        if (zeile > this.zeilenUndSpalten.length-1){
            throw new RuntimeException("Ungültige Zeilenposition");
        }
        else {
            char[][] puffer = new char[this.zeilenUndSpalten.length + einzufuegenderInhalt.zeilenUndSpalten.length][];
            //puffer-Dokument mit anfang des ursprünglichen Dokuments befüllen:
            for (int i=0; i<zeile;i++){
                puffer[i] = this.zeilenUndSpalten[i];
            }
            //einzufügendes Texdokument in puffer an "zeile" einfügen:
            int counter = 0;
            for (int j = zeile; j < zeile + einzufuegenderInhalt.zeilenUndSpalten.length; j++){
                puffer[j] = einzufuegenderInhalt.zeilenUndSpalten[counter];
                counter++;
            }
            //rest des puffers mit rest vom ursprünglichen Dokument befüllen:
            for (int k = zeile+einzufuegenderInhalt.zeilenUndSpalten.length;k< puffer.length ; k++){
                puffer[k] = this.zeilenUndSpalten[k-einzufuegenderInhalt.zeilenUndSpalten.length];
            }
            this.zeilenUndSpalten = puffer;
        }

    }

}
