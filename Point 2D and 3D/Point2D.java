class Point2D {
    public void main(String[] args) {
    }
    int x,y;
    // set x and y 
    public void set_x(int x){this.x=x;}
    public void set_y(int y){this.y=y;}
    //get x and y
    public int get_x(){return this.x;}
    public int get_y(){return this.y;}
}
class Point3D extends Point2D{
    int z;
    //set z
    public void set_z(int z){this.z=z;}
    // get z
    public int get_z(){return this.z;}
    // for three coordinates 
    public void set_3D(int x , int y, int z){set_x(x);set_y(y);this.z=z;}
}

