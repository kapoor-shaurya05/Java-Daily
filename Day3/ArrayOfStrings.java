//take an array of strings as input from the user & find the Cumulative Length of all those strings.
import java.util.*;
public class ArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        sc.nextLine(); //To consume the newline character after nextInt()
        String[] arr = new String[len];
        int TotalLength = 0;

        System.out.println("Enter the elements of the array: ");
        for(int i=0 ; i<len ; i++){
            arr[i] = sc.nextLine();
            TotalLength = TotalLength + arr[i].length();
        }
        System.out.println("Cumulative length of all the strings in the array is: " + TotalLength);
    }
}
