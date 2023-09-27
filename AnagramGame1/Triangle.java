public class Triangle {
    
    private double height;
	private double base;
	 public Triangle(){};
	public Triangle(double height,double base)
	{
		this.height = height;
		this.base = base;
	}
	public void setHeigth(double height)
        {this.height = height;}
	public void setbase(double base)
        {this.base = base;}
	public double getHeight()
        {return height;}
	public double getBase()
        {return base;}
	public double getAreaofTriangle()
        {return height*base;}
    
}