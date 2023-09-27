package Abstraction;
public class BasicCalculator extends Calculation 

{ 

    private double value1,value2; 

     

    public BasicCalculator(){System.out.println("\nDefault Constructor\n");} 

    public BasicCalculator(double v1, double v2) 

    { 

        this.value1=v1; 

        this.value2=v2; 

    } 

    public void setValue1(double v1) 

    { 

        this.value1=v1; 

    } 

    public void setValue2(double v2) 

    { 

        this.value2=v2; 

    } 

     

    public double getValue1() 

    { 

        return value1; 

    } 

    public double getValue2() 

    { 

        return value2; 

    } 

    @Override
    public double add() 

    { 

        return value1+value2; 

    } 

    @Override
    public double subtract() 

    { 

        return value1-value2; 

    } 

    @Override
    public double multiply() 

    { 

        return value1*value2; 

    } 

    @Override
    public double divide() 

    { 

        if(value2!=0) 

        {return value1/value2;} 

         

        else {System.out.println("Error!!!");} 

        return 0; 

        //return value1/value2; 

    } 

  

} 
