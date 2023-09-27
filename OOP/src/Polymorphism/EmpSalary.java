package Polymorphism;
public class EmpSalary {
    private double basicAmount;
    private double festivalBonus;
    private double overtimeAmount;
    
    public EmpSalary(){

    }
    
    public EmpSalary(double basicAmount, double festivalBonus, double overtimeAmount){
        System.out.println();
        System.out.println("Constructing an EMPSalary");
        this.basicAmount = basicAmount;
        this.festivalBonus = festivalBonus;
        this.overtimeAmount = overtimeAmount;
    }
    public double getBasicAmount(){
        return basicAmount;
    }
    public void setBasicAmount(double basicAmount){
       this.basicAmount = basicAmount;
    }
    public double getFestivalBonus(){
        return festivalBonus;
    }
    public void setFestivalBonus(double festivalBonus){
        this.festivalBonus = festivalBonus;
    }
    public double getOvertimeAmount(){
        return overtimeAmount;
    }
    public void setOvertimeAmount(double overtimeAmount){
        this.overtimeAmount = overtimeAmount;
    }

        void show(){
        System.out.println("Basic Amount: "+basicAmount);
        System.out.println("Festival Bonus: "+festivalBonus);
        System.out.println("Over time Amount: "+overtimeAmount);
    }
       
}


/*public class EmpSalary {
    private double basicAmout;
    private double festivalBonus;
    private double overtimeAmount;
    
    public EmpSalary(){}
    
    public EmpSalary(double basicAmout, double festivalBonus, double overtimeAmount){
        System.out.println();
        System.out.println("Constructing an EMPSalary");
        this.basicAmout = basicAmout;
        this.festivalBonus = festivalBonus;
        this.overtimeAmount = overtimeAmount;
    }
    public double getbasicAmout(){
        return basicAmout;
    }
    public void setbasicAmout(){
        basicAmout = basicAmout;
    }
    public double getfestivalBonus(){
        return festivalBonus;
    }
    public void setfestivalBonus(){
        festivalBonus = festivalBonus;
    }
    public double getovertimeAmount(){
        return festivalBonus;
    }
    public void setovertimeAmount(){
        overtimeAmount = overtimeAmount;
    }
    void show(){
        System.out.println("basic Amout: "+basicAmout);
        System.out.println("festival Bonus: "+festivalBonus);
        System.out.println("over time Amount: "+overtimeAmount);
    }
    
    
}

*/