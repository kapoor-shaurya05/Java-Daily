import java.util.ArrayList;
public class Swapping {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        int idx1 = 1;
        int idx2 = 3;
        
        int temp = al.get(idx1);
        al.set(idx1 , al.get(idx2));
        al.set(idx2 , temp);

        System.out.println("After Swapping: " + al);
    }
}