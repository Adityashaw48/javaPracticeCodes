
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractShape shape=null;
		//shape= new AbstractShape;
		shape= new Rectangle("Blue",5,6);
		System.out.println("Color="+shape.getColor());
		shape.setColor("Red");
		System.out.println("Changed Color:"+shape.getColor());
		shape.area();

	}

}
