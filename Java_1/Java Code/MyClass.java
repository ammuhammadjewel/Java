public class MyClass {
    public int a=22;
	public int b=21;
	public int c;
	
	public void add(){
		this.c=this.a+this.b;
		
	}
/*	public void setC(int c)
	{
		this.c = c;
	}
	public int getC()
	{
		return c;
	}*/
		void showInformation()
	{
		System.out.println("\tFirst Number: "+a) ;
		System.out.println("\tSecond Number: "+b) ;
		System.out.println("\tSummation of two numbers: "+c) ;
	}
    
}