
package J04008;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Point p1 = new Point(sc.nextInt(), sc.nextInt());
            Point p2 = new Point(sc.nextInt(), sc.nextInt());
            Point p3 = new Point(sc.nextInt(), sc.nextInt());
            if( Point.chuvi(p1, p2, p3)==0){
                System.out.println("INVALID");
            }else{
                System.out.printf("%.3f\n",Point.chuvi(p1, p2, p3));
            }
        }
    }
}
