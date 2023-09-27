
package ArrayAlCode;
import java.util.Scanner;

public class SumOfDiagonalTriangle {
    
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int SumOfDiogonalElements = 0;
        int SumOfUpperElements = 0;  //Upper triangle
        int SumOfLowerElements = 0;  // lower triagle
        
        //Matrix input
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                A[row][col] = input.nextInt();
            }
        }
        //Diagonal,upper,lower
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                if(row == col)
                {
                   SumOfDiogonalElements = SumOfDiogonalElements + A[row][col];
                }
                
               if(row < col)
               {
                   SumOfUpperElements = SumOfUpperElements + A[row][col];
               }
               if(row > col)
               {
                   SumOfLowerElements = SumOfLowerElements + A[row][col];
               }
            }
        }
        System.out.println("Sum of Diagonal Elements: "+SumOfDiogonalElements);
        System.out.println("Sum of Upper Elements: "+SumOfUpperElements);
        System.out.println("Sum of Lower Elements: "+SumOfLowerElements);
    }
    
}
