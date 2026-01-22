import java.util.*;
public class SortingInArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(34);
        al.add(12);
        al.add(5);
        al.add(78);
        al.add(23);
        System.out.println(al);

        //ascending order
        Collections.sort(al);
        System.out.println(al);

        //descending order
        // Collections.sort(al , Collections.reverseOrder()); //It is a comparator - a function which defines the logic of sorting
        // System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
    }
}
