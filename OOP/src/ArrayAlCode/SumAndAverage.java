
package ArrayAlCode;

/*import java.util.Scanner;

public class SumAndAverage {
    
    public static void main(String args[]){
    
        Scanner input= new Scanner(System.in);
       
        double[] number = new double[5];
        double sum;
        double avg;
        System.out.print("please Enter 5 numbers = ");
        number[0] = input.nextDouble();
        number[1] = input.nextDouble();
        number[2] = input.nextDouble();
        number[3] = input.nextDouble();
        number[4] = input.nextDouble();
        
        sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("The Summation of all numbers = " +sum);
        avg = sum/number.length;  //sum/5;
        System.out.println("Average number = "+avg);

    }
    
}*/



import java.util.Scanner;

public class SumAndAverage {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
       
        double[] number = new double[5];
        double sum=number.length;
        double avg=number.length;
        System.out.println("Please Enter 5 numbers : ");
        for(int i=0; i< number.length ; i++){
        
            number[i] = input.nextDouble();
        }
        for(int i=0; i< number.length; i++){
            
            sum = sum + number[i];
            avg = sum/number.length;
        
        }
        System.out.println("The Summation of All Numbers = "+sum);
        System.out.println("The Average of all Numbers ="+avg);
        //System.out.println("Average="+sum/5);
        
    
            }

}
