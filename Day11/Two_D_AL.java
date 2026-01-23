import java.util.*;
public class Two_D_AL {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(17);
        list3.add(15);

        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);

        System.out.println(mainlist);

        //Accessing a list from this 2d arraylist , and then further accessing an element from that list.
        for(int i=0 ; i<mainlist.size() ; i++){
            ArrayList<Integer> currlist= mainlist.get(i);
            for(int j=0 ; j<currlist.size() ; j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
    }
}
