
package Abstraction;

public class ScientificCalculator extends BasicCalculator implements ScientificCalculation{ 

    public ScientificCalculator (){} 
    
    public ScientificCalculator(double v1,double v2){ 

        super (v1,v2); 
    } 

    @Override
    public double toThePow(){ 

        double topow=1; 

        for (int i=0;i<=super.getValue2();i++){     

            topow*=super.getValue2(); 
        } 

        return topow; 
    } 

} 