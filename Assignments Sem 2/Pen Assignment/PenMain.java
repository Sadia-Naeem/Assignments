public class PenMain {
    public static void main(String[] args) {
        Pen Dollar = new Pen();
        Dollar.color = "blue"; 
        Dollar.type = "ink pen";
       
        Dollar.write();
        Dollar.printColor();
        Dollar.printType();

        Pen Piano = new Pen();
        Piano.color = "black";
        Piano.type = "gel pen";
        
        Piano.printColor();
        Piano.printType();
 
    }
}

