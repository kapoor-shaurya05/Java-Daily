public class Example {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // Creating a Pen object called p1
        p1.setColor("Blue");
        System.out.println("Pen color is: " + p1.color);

        p1.setTip(5);
        System.out.println("Pen tip size is: " + p1.tip);
        p1.tip = 8; // Directly changing the tip size
        System.out.println("Updated Pen tip size is: " + p1.tip);

        Student s1 = new Student(); // Creating a Student object called s1
        s1.name = "Shaurya";
        s1.age = 20;
        s1.calPercentage(90 , 92 , 95);
        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Age: " + s1.age);
        System.out.println("Student Percentage: " + s1.percentage);
    }
}

class Pen{
    //Properties
    String color;
    int tip;

    //Functions
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int phy , int chem , int maths){
        percentage = ((phy + chem + maths) / 300f) * 100;
    }
    //Similarly, we can create more functions for name & age also. 
}