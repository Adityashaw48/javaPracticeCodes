
public abstract class AbstractShape {
	String color;
	AbstractShape(String color){
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void area();

}
