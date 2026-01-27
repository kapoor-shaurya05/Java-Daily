public class ClassesAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.type = "gel";
        p1.write();

        Pen p2 = new Pen();
        p2.color = "Black";
        p2.type = "Ballpoint";
        p2.write();

        p1.printColor();
        p2.printColor();
    }
}

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("The " + color + " " + type + " pen is writing");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}