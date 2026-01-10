import java.util.Scanner;
public class ArraysIntro {
    public static void main(String[] args) {
        //Initializig an Array:- 
        int[] arr = new int[5]; //declaration and memory allocation
        arr[0] = 10; //initialization
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //Accessing the elements of an Array:-
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        //Another way to initialize an Array:-
        int[] arr2 = {5, 15, 25, 35, 45};
        
        //Taking input for an Array:-
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr3 = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0 ; i<size ; i++){
            arr3[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: "); //Output the elements of the array
        for(int i=0; i<size; i++){
            System.out.println(arr3[i]);
        }
    }
}