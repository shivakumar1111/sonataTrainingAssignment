package assignmentday3ans2nd;

public class Rectangle extends Shape{
	Rectangle() {}
	Rectangle(float l, float w) {
		super.length = l;
		super.width = w;
	}
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
	@Override
	public float calcArea() {
		return length * width;
	}
	public String toString() {
		draw();
		return "Area of Rectangle - " + calcArea() + "cm";
	}

}
