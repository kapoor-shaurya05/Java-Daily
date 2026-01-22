//Arraylist is an in-built data structure , which is Linear in nature.
import java.util.ArrayList;
public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        //adding an element - O(1)
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        al.add(3 , 22); //adding 22 at index 3 - O(n)
        System.out.println(al);

        //getting (accessing) an element - O(1)
        System.out.println(al.get(1));
        System.out.println(al.get(3));

        //removing an element - O(n)
        al.remove(2);
        System.out.println(al);

        //setting an element at an index - O(1)
        al.set(2, 100);
        System.out.println(al);

        //contains() - O(n)
        System.out.println(al.contains(100));
        System.out.println(al.contains(46));

        //size of arraylist - O(1)
        System.out.println(al.size());

        //traversing an arraylist - O(n)
        for(int i=0; i<al.size(); i++){
            System.out.print(al.get(i) + " ");
        }
    }    
}
