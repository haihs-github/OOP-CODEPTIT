package J04008;

import static java.lang.Math.*;

public class Point {
    private double x, y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public static double distance(Point p1, Point p2){
        return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y-p2.y)*(p1.y-p2.y));
    }
    
    public static double chuvi(Point p1, Point p2, Point p3){
        if( p1.x == p2.x && p1.x == p3.x || p1.y == p2.y && p1.y == p3.y ){
            return 0;
        }
        return distance(p1, p2) + distance(p2, p3) + distance(p3, p1);
    } 
}
