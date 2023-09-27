package Polymorphism;

public class Address {
    public String houseName ;
    private String houseNo ;
    String roadNo ;
    
    public Address(String houseName, String houseNo, String roadNo)
    {
        this.houseName = houseName ;
        this.houseNo = houseNo ;
        this.roadNo = roadNo ;
    }
    public void setHouseNo(String houseNo)
    {
        this.houseNo = houseNo ;
    }
    public String getHouseNo()
    {
        return this.houseNo ;
    }
}
