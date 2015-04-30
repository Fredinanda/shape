
public class drawww {

	public static void main(String[] args) {
		
		//Drawble drawable = new Point(3, 4);
		//drawable.draw();
		
		Circle c = new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Visible);
		
		//System.out.println(c instanceof Rect); 빨간줄 상속관계에있어야 됨 
		
		Shape s = c;
		System.out.println(s instanceof Rect);

	}

}
