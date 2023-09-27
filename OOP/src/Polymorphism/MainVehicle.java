
package Polymorphism;
import java.lang.*;
public class MainVehicle {
    
    public static void main(String[] arg)
   {
   Vehicle v = new Vehicle ( "Vehicle ", 1 , 3 );
   v.show(); 
   v = new Bike ( "Yamaha", 1 , 1, "Yamaha r1");
   v.show();
   v = new Car ( "BMW", 101 , 1, "BMW X5 M",2);
   v.show();
   Bike b = new Bike ( "Ducati", 1 , 2, "Ducatti Superlegerra V4");
   b.show();
   Car c = new Car ("Ferrari", 1 , 2, "Ferrari 599 GTO",2);
   c.show();
     
   }   
    
}


/*
lab task 1:




class Shape 
{
	

	
}

---------------------------------------


class Rectangle extends Shape
{
	
        

	
}

---------------------------------


class Triangle extends Shape
{
	
        

	
}

-----------------------------------------

class Main
{
	
}













lab task 2:


class Vehicals
{
	
	
}



------------------------------------------------------------------------------



class Bikes extends Vehicals
{
	


	
}

------------------------------------------------------------------

class Car extends Vehicals
{
	
	
}

--------------------------------------------

class Main
{
	
}*/