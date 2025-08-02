public class Circle {
    
    // --- Attributes (also called "fields") ---
    double centerX; // x-coordinate of center
    double centerY; // y-coordinate of center
    double radius;  // radius of the circle

    // --- Constructors ---
    // 1) No-argument constructor: makes a unit circle at the origin
    public Circle() {
        centerX = 0.0;
        centerY = 0.0;
        radius = 1.0;
    }

    // 2) Constructor that lets you set everything
    public Circle(double x, double y, double r) {
        centerX = x;
        centerY = y;
        // Keep it simple: if r is negative, just make it 0
        if (r < 0) {
            System.out.println("Radius cannot be negative. Setting radius to 0.");
            radius = 0.0;
        } else {
            radius = r;
        }
    }

    // --- Setters (to change values later) ---
    public void setCenterX(double x) {
        centerX = x;
    }

    public void setCenterY(double y) {
        centerY = y;
    }

    public void setRadius(double r) {
        if (r < 0) {
            System.out.println("Radius cannot be negative. Keeping the old radius: " + radius);
        } else {
            radius = r;
        }
    }

    // --- Getters (to read the values) ---
    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getRadius() {
        return radius;
    }

    // For Area = π * r^2 make a method
    public double area() {
        return Math.PI * radius * radius;
    }

    // Circumference = 2 * π * r
    public double circumference() {
        return 2.0 * Math.PI * radius;
    }

    // A simple text version of the circle
    public String toString() {
        return "Circle(centerX=" + centerX + ", centerY=" + centerY + ", radius=" + radius + ")";
    }
}

