
package LabTask;

public class Vehicle {
    
    public String BrandName;
    String ModelName;
    int Price;
    public Vehicle()
    {}
    public Vehicle (String BrandName, String ModelName, int Price)
    {
        this.BrandName = BrandName;
        this.ModelName = ModelName;
        this.Price = Price;
    }
    public void showInformation(){
        System.out.println("Vehicle Brand Name: "+BrandName);
        System.out.println("Vehicle Model Name: "+ModelName);
        System.out.println("Vehicle Price: "+Price);
    }
    
    
}
