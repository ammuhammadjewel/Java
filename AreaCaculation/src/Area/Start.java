
package Area;
public class Start {
    
    public static void main(String arg[])
	{
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		Square s = new Square();
		
		System.out.println("Ractangle Information!!!");
		r.setLength(10);
		r.setWidth(11);
		System.out.println("Length: "+r.getLength());
		System.out.println("WIdth: "+r.getWidth());
		System.out.println("Area Of Rectangle: "+r.getAreaofRectangle());
		
		System.out.println("Triangle Information!!!");
		t.setHeigth(15);
		t.setbase(9);
		System.out.println("Height: "+t.getHeight());
		System.out.println("Base: "+t.getBase());
		System.out.println("Area of Triangle: "+t.getAreaofTriangle());
		
		System.out.println("Circle Information!!");
		c.setRadius(7);
		System.out.println("Radius: "+c.getRadius());
		System.out.println("Area of Circle: "+c.getAreaofCircle());
		
		System.out.println("Square Information!!");
		s.setSide(13);
		System.out.println("Side: "+s.getSide());
		System.out.println("Area of Suqare: "+s.getAreaofSquare());
		
	}
    
}
