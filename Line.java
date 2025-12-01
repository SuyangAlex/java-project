package math.geometry;
import math.geometry.Point;

public class Line{
    private Point p1;
    private Point p2;
    
    public Line(int x1, int y1, int x2, int y2){
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public String render(){
        return this.p1.getX()+","+this.p1.getY()+" ~ "+this.p2.getX()+","+this.p2.getY();
    }

    public double slope(){
        return (this.p2.getY() - this.p1.getY())/this.p2.getX()-this.p1.getX();
    }
}