import java.util.*;
public class ReverseArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println("Original ArrayList: " + al);

        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i=al.size()-1 ; i>=0 ; i--){
            al2.add(al.get(i));
        }
        System.out.println("Reversed ArrayList: " + al2);
    }
}
