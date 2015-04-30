public abstract class Shape {

	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}

	private String getColor(){
		return color;
	}
	
	public abstract void draw();
	
	public abstract double calculateArea();

}
