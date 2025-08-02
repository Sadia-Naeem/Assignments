class MainPoint2D {
     public static void main(String[]args){
        Point3D Dimension3D = new Point3D();
        Dimension3D.set_3D(10,12,15);
        
        Penn piano=new Penn();
        piano.setcoordinates3D(
            Dimension3D.get_x(),
            Dimension3D.get_y(),
            Dimension3D.get_z());
        piano.setInfo("Silk","Ball-point","Blue");
        piano.show();
        
    }
}

