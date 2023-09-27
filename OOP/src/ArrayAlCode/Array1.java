
package ArrayAlCode;

public class Array1 {
    
    public static void main(String args[] )
    {
        int[] number;
        number = new int[10]; //int[] number= new int[10];
        number[0]= 10;
        number[1]= 20;
        number[2]= 30;
        number[3]= 40;
        number[4]= 50;
        number[5]= 60;
        number[6]= 70;
        number[7]= 80;
        number[8]= 90;
        number[9]= 100;
  
       int sum = number[0] + number[1] + number[2] + number[3] + number[4] + number[5] + number[6] + number[7] + number[8] + number[9];
       System.out.println("Summation of all Numbers = " + sum);
       
       int len = number.length;
       System.out.println("Arraay size = " +len);
    }
    
}
