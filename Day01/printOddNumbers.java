import java.util.Scanner;
public class printOddNumbers {
    public static int printOdd(int n){
        for(int i=1 ; i<=n ; i++){
            if( i%2 != 0){
                System.out.println(i);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number upto which you have to print odd numbers to : ");
        int n = sc.nextInt();
        printOdd(n);
    }
}
