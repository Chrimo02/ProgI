package Hoehenlinien;

public class Point {

    private final int x;
    private final int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void printCoordinates(){
        System.out.println("X-Koordinate: " + this.getX());
        System.out.println("Y-Koordinate: " + this.getY());
    }
}
