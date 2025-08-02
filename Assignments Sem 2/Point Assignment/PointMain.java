public class PointMain {
public static void main(String[] args) {
        // 1) Make a point at the origin
        Point p1 = new Point();
        System.out.println("p1 = " + p1);

        // 2) Make a point with custom coordinates
        Point p2 = new Point(3.0, 4.0);
        System.out.println("p2 = " + p2);

        // Move p1 by (2, 1.5)
        p1.move(2.0, 1.5);
        System.out.println("p1 after move(2.0, 1.5) = " + p1);

        // Change p2's coordinates using setters
        p2.setX(5.0);
        p2.setY(6.0);
        System.out.println("p2 after setX/setY = " + p2);

        // Distance between p1 and p2
        double d = p1.distanceTo(p2);
        System.out.println("Distance from p1 to p2 = " + d);
    }
}