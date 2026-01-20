public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student("shaurya" , 20);
        s1.printInfo();
    }    
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Constructor
    Student(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("Constructor called");
    }

}