import java.io.* ;
import java.lang.* ;
import java.util.* ;

class TestFile
{
	
	public static void main(String arg[])
	{
		FileReadWriteDemo fileObject = new FileReadWriteDemo() ;
		
		
		fileObject.writeInFile("This is OOP1 course!") ;
		fileObject.writeInFile("This is section X") ;
		fileObject.readFromFile() ;
		
	}
}