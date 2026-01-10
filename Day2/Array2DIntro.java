import java.util.*;
public class Array2DIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        //Taking input for 2D Array from the user
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Printing the 2D Array
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<cols ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
