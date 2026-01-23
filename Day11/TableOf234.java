import java.util.*;
public class TableOf234 {
    public static void main(String[] args) {
        //Creating the ArrayLists
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        ArrayList<Integer> al3 = new ArrayList<>();
        //Adding tables of 2 , 3 , 5 into al1 , al2 , al3 respectively
        for(int i=1 ; i<=5 ; i++){
            al1.add(i*2);
            al2.add(i*3);
            al3.add(i*5);
        }
        //Adding these lists into the mainlist
        mainlist.add(al1);
        mainlist.add(al2);
        mainlist.add(al3);
        System.out.println(mainlist);
        //Accessing the element from the mainlist
        for(int i=0 ; i<mainlist.size() ; i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j=0 ; j<currlist.size() ; j++){
                System.err.print(currlist.get(j) + " ");
            }
            System.out.println();
        }

    }
}
