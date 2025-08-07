public class Line extends Point{
    Point StartPoint;
    Point EndPoint;

    public Line() {
        StartPoint = new Point();
        EndPoint = new Point();
    }
    public Line (Point start, Point end){
       StartPoint = start;
       EndPoint = end; 
    }
    public void setStartPoint(Point start){
        StartPoint = start;
    }
    public void setEndPoint(Point end) {
        EndPoint = end;
    }
    public Point getStartPoint(){
        return StartPoint;
    }
    public Point getEndPoint(){
        return EndPoint;
    }
    public void showLine(){
        System.out.println("Start Point: " + StartPoint);
        System.out.println("End Point: " + EndPoint);
    }
    // to calculate length between two point we take the squareroot of the sum of the squares of the differences 
    // the formula is: sq.root( (x2 - x1)^2  + (y2 - y1)^2 )
    public double getLength() {
        return Math.sqrt(Math.pow(EndPoint.getX() - StartPoint.getX(), 2) 
                         + Math.pow(EndPoint.getY() - StartPoint.getY(), 2));
    }
    public Point getMidPoint() {
        double midX = (StartPoint.getX() + EndPoint.getX()) / 2 ;
        double midY = (StartPoint.getY() + EndPoint.getY()) / 2 ;
        return new Point(midX, midY);
    }
    
}

