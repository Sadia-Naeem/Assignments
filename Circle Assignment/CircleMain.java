public class CircleMain {
    // A simple program to test the Circle class
    public static void main(String[] args) {
        // 1) Make a circle using the no-argument constructor
        Circle c1 = new Circle();
        System.out.println("Circle 1: " + c1);
        System.out.println("Area: " + c1.area());
        System.out.println("Circumference: " + c1.circumference());
        System.out.println();

        // 2) Make a circle with custom values
        Circle c2 = new Circle(2.0, 3.0, 4.0);
        System.out.println("Circle 2: " + c2);

        // Change radius
        c2.setRadius(5.0);
        System.out.println("New radius: " + c2.getRadius());
        System.out.println("Area now: " + c2.area());
    }
}
