import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //Eg - "Tony"
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb);

        //Methods of String-Builders
        //Strings ke saare methods String-Builders me bhi applicable hai. Also SB has their own useful methods.
        sb.setCharAt(0 , 'P');
            System.out.println(sb);
        sb.insert(2 , 'n');
            System.out.println(sb);

        sb.deleteCharAt(2);
            System.out.println(sb);
        sb.delete(2 , 4); //start-index is inclusive , end-index is exclusive
            System.out.println(sb);

        sb.append(" Stark");
            System.out.println(sb);
        
        System.out.println(sb.reverse());
        
    }
}
