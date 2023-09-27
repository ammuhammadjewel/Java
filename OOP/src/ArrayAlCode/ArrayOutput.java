
package ArrayAlCode;

public class ArrayOutput {
    
    public static void main(String[] arg){
        int[][] A = new int[4][5];
        int k = 0;
        
        //assigning the elements
        
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 5; col++){
                A[row][col] = k;
                k++;
            }
        }
        //printing the elements
        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 5; col++){
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }
    }
    
}
