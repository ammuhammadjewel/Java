
package LabTask;

public class Bike extends Vehicle {
    
    protected String OwnerName;
    
    public Bike()
    {}
    public Bike(String BrandName, String ModelName, int Price, String OwnerName)
    {
        super(BrandName, ModelName, Price);
        this.OwnerName = OwnerName;
    }
    public void showInformation(){
        super.showInformation();
        System.out.println("Bike Owner Name: "+OwnerName);
    }
    
    
    
}
