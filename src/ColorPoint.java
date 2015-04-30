
public class ColorPoint extends Point{
	private String Color;


	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	public void draw(){
		System.out.println(getColor()+"의 색을 그립니다.");
	}
	
}
