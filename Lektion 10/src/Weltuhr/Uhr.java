package Weltuhr;

public class Uhr {

    public static void main(String[] args){
        Uhr[] weltzeit = new Uhr[24];
        for(int i = 0;i < weltzeit.length;i++)
        {
            weltzeit[i] = new Uhr(i,23,7);
        }
        System.out.println(weltzeit[3].getStd()+":"+weltzeit[3].getMin()+":"+weltzeit[3].getSek());
        for (int j = 0; j< weltzeit.length;j++){
            weltzeit[j].naechsteSek();
        }
        System.out.println(weltzeit[3].getStd()+":"+weltzeit[3].getMin()+":"+weltzeit[3].getSek());



    }
    private int std;
    private int min;
    private int sek;


    public Uhr(int std, int min, int sek){
        if (std >= 0 && std <= 24 && min >= 0 && min <= 60 && sek >= 0 && sek <= 60){
            this.std = std;
            this.min = min;
            this.sek = sek;
        }
        else {
            this.std = 12;
            this.min = 0;
            this.sek = 0;
        }
    }

    public int getStd(){
        return this.std;
    }
    public int getMin(){
        return this.min;
    }
    public int getSek(){
        return this.sek;
    }
    public void setUhr(int std, int min, int sek) {
        if (std >= 0 && std <= 24 && min >= 0 && min <= 60 && sek >= 0 && sek <= 60) {
            this.std = std;
            this.min = min;
            this.sek = sek;
        } else {
            System.out.println("Ungültige Eingabe! - Die Uhrzeit wurde nicht angepasst!");
        }
    }
    public void naechsteSek(){
        if (this.sek <= 59){
            this.sek = this.sek +1;
        }
        if (this.sek == 60){
            this.sek = 0;
        }
    }
}

