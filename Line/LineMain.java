public class LineMain {
    public static void main(String[] args) {
    Line LineOne= new Line();
    Line LineTwo = new Line(new Point (1.7,2.3), new Point(3,5));
    
    LineOne.setStartPoint(new Point(2.1,1.9));
    LineOne.setEndPoint(new Point(1, 1.3));

    System.out.print("Co-ordinates of LineOne are: ");
    LineOne.showLine();
    System.out.print("Co-ordinates of LineTwo are: ");
    LineTwo.showLine();

    System.out.println("Length of Line One: " + LineOne.getLength());
    System.out.println("Length of Line Two: " + LineTwo.getLength());
    
    System.out.println("Mid Point of Line One: " + LineOne.getMidPoint());
    System.out.println("Mid Point of Line Two: " + LineTwo.getMidPoint());
  }
}
