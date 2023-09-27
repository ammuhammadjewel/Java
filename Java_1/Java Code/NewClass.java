interface First
/*{
	void FirstMethod();
}
interface Second{
	void SecondMethod();
}
interface Third
{
	void ThirdMethod();
}
*/
public class NewClass implements First,Second,Third
{
	public void FirstMethod(){
		System.out.println("First Interface");
	}
	public void SecondMethod(){
		System.out.println("Second Interface");
	}
	public void ThirdMethod(){
		System.out.println("Third Interface");
	}
}