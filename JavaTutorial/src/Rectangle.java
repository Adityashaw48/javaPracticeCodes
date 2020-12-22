
public class Rectangle extends AbstractShape {
	int length,breadth;
	

	public Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}


	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rect:"+(length*breadth));

	}

}
