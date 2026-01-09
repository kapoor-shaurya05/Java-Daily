import java.util.Scanner;
public class printAverage {

    public static int calculateAverage(int n, int[] nums){
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum = sum + nums[i];
        }
        return sum/n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you have to enter to find average : ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter your numbers : ");
        for(int i=0 ; i<n ; i++){
            nums[i] = sc.nextInt();
        }

        int average = calculateAverage(n , nums);
        System.out.println("The average of the numbers is : " + average);
    }
}
