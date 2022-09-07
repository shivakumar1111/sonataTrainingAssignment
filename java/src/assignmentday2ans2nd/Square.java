package assignmentday3ans2nd;

public class Square extends Shape {
	Square() {}
	Square(float s) {
		super.side = s;
	}
	@Override
	public void draw() {
		System.out.println("Drawing a Square");
	}
	@Override
	public float calcArea() {
		return side * side;
	}
	public String toString() {
		draw();
		return "Area of Square - " + calcArea() + "cm";
	}

}
