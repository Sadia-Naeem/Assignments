class Penn {
    public void main(String[] args) {}
    
    int cp_x , cp_y , cp_z ;
    String name , type , color ;
    
    // set for coordinates for 3D
    public void setcoordinates3D(int cp_x , int cp_y, int cp_z){this.cp_x=cp_x;this.cp_y=cp_y;this.cp_z=cp_z;}
    // set rest of the attributes
    public void setInfo(String name , String type , String color){
        this.name=name;
        this.type=type;
        this.color=color;
    }
    // public String getInfo(){
    //     return this.name; 
    //     return this.type;
    //     return this.color;
    // }
    public void write(){
        System.out.println("This pen is best for smooth writing !");
    }
    public void show(){
        System.out.println(" " +name);
        System.out.println(" "+type);
        System.out.println(" "+color);
        System.out.println("("+cp_x+","+cp_y+", "+cp_z+")");
    }
}
