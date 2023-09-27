
package ArrayAlCode;

import java.util.Arrays;

public class ArraySorting {
    
    public static void main(String[] arg){
        int[] A = {10,-1,2,5,-3};
        Arrays.sort(A);
        
        System.out.print("Ascending : ");
        
        for(int i = 0; i < 5; i++){
            System.out.print(" "+A[i]);
            
        }
        System.out.println();
        System.out.print("Descending : ");
        for(int i = 4; i >= 0; i--){
            System.out.print(" "+A[i]);
        }
        
        System.out.println();
        
        String[] names = {"ppp","ccc","ddd","vvv","aaa","ooo","nnn"};
        Arrays.sort(names);
        for(int i = 0; i < 7; i++){
            System.out.print(names[i]+" ");
        }
        System.out.println();
        
        //String[] names = {"ppp","ccc","ddd","vvv","aaa","ooo","nnn"};
        for(int i = 6; i >= 0; i--){
            System.out.print(names[i]+" ");
        }
    }
    
}
