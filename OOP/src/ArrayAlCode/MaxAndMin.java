
package ArrayAlCode;

import java.util.Scanner;

public class MaxAndMin {
    
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        double[] number = new double[5];
        double sum = number.length;
        double avg = number.length;
        System.out.println("Please Enter 5 numbers: ");
        for(int i = 0; i< number.length; i++){
            
            number[i] = input.nextDouble();
        
        }
        for(int i=1; i< number.length; i++){
            sum = sum + number[i];
            avg = sum/number.length;
        
        }
        double max = number[0];
        double min = number[0];
        for(int i = 1; i < number.length; i++){
            
            if(max<number[i])
            {max = number[i];}
            
            if(min>number[i])
            {min = number[i];}
            
        
        }
        
        System.out.println("The Summation of All Numbers = "+sum);
        System.out.println("The Average of All Numbers = "+avg);
        System.out.println("The Maximum Number = "+max);
        System.out.println("The Minimum Number = "+min);
    
    }
    
}
