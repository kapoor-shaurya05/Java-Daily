import java.util.Scanner;
public class powerNumber {

    public static int power(int x , int n){
        int result = 1;
        for(int i=1 ; i<=n ; i++){
            result = result * x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number : ");
        int x = sc.nextInt();
        System.out.println("Enter the number of power : ");
        int n = sc.nextInt();

        int number = power(x,n);
        System.out.println("the result is : " + number);
    }
}
