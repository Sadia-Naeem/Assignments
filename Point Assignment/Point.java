public class Point{
    public void main(String[] args) {}
        
   // --- Attributes (fields) ---
    double x; // x-coordinate
    double y; // y-coordinate

    // --- Constructors ---
    // 1) No-argument constructor: starts at the origin (0, 0)
    public Point() {
        x = 0.0;
        y = 0.0;
    }

    // 2) Constructor that lets you set x and y
    public Point(double xValue, double yValue) {
        x = xValue;
        y = yValue;
    }

    // --- Setters (change values) ---
    public void setX(double xValue) {
        x = xValue;
    }

    public void setY(double yValue) {
        y = yValue;
    }

    // --- Getters (read values) ---
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // --- Useful methods ---
    // Move the point by (dx, dy)
    public void move(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    // Distance to another point
    public double distanceTo(Point other) {
        double dx = x - other.x;
        double dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // A simple text version of the point
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


