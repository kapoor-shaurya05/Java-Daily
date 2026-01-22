import java.util.*;
public class MaxInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(45);
        al.add(32);
        al.add(67);

        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<al.size() ; i++){
            if(max < al.get(i)){
                max = al.get(i);
            }
            //Alternatively we can use: 
            // max = Math.max(max , al.get(i));

            //Alternatively we can use: 
            // Collections.max(al);
        }
        System.out.println("Maximum element in ArrayList: " + max);
    }
}
