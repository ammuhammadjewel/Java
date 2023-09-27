public class Start {
    
    public static void main(String a[])
	{
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Circle c = new Circle();
		Square s = new Square();
		
		System.out.println();
		System.out.println("\tRactangle Information!!!");
		r.setLength(10);
		r.setWidth(11);
		System.out.println("\tLength: "+r.getLength());
		System.out.println("\tWIdth: "+r.getWidth());
		System.out.println("\tArea Of Rectangle: "+r.getAreaofRectangle());
		
		System.out.println("\tTriangle Information!!!");
		t.setHeigth(15);
		t.setbase(9);
		System.out.println("\tHeight: "+t.getHeight());
		System.out.println("\tBase: "+t.getBase());
		System.out.println("\tArea of Triangle: "+t.getAreaofTriangle());
		
		System.out.println("\tCircle Information!!");
		c.setRadius(7);
		System.out.println("\tRadius: "+c.getRadius());
		System.out.println("\tArea of Circle: "+c.getAreaofCircle());
		
		System.out.println("\tSquare Information!!");
		s.setSide(13);
		System.out.println("\tSide: "+s.getSide());
		System.out.println("\tArea of Suqare: "+s.getAreaofSquare());
		
	}
    
}