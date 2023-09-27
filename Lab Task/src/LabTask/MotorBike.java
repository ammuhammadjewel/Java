
package LabTask;

public class MotorBike extends Vehicle{
    String Colour;
    protected String OwnerNameAddress;
    private String OwnerMail;
    
    public MotorBike()
    {}
    public MotorBike(String BrandName, String ModelName, int Price, String Colour, String OwnerNameAddress, String OwnerMail)
    {
        super(BrandName, ModelName, Price);
        this.OwnerNameAddress = OwnerNameAddress;
        this.OwnerMail = OwnerMail;
    }
    public void showInformation()
    {
        super.showInformation();
        System.out.println("Motor Bike Colour: "+Colour);
        System.out.println("Motor Bike Owner Name Address: "+OwnerNameAddress);
        System.out.println("Motor Bike Owner Mail: "+OwnerMail);
    }
    
    
    
    
    
}
