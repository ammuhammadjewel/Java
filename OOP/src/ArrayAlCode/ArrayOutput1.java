
package ArrayAlCode;

public class ArrayOutput1 {
    
    public static void main(String[] arg){
        int[][] A = new int[5][];
        
        int k = 0;
        A[0] = new int[1];
        A[1] = new int[2];
        A[2] = new int[3];
        A[3] = new int[4];
        A[4] = new int[5];
        
        for(int row = 0; row < 5; row++){
            for(int col = 0; col < row+1; col++){
                A[row][col] = k;
                k++;
            }
        }
        for(int row = 0; row < 5; row++){
            for(int col = 0; col < row+1; col++){
                System.out.print(A[row][col]+" ");
            }
            System.out.println();
        }
    }
    
}
