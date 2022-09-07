package assignmentday4;
/*3)	Create a T-Shirt  class with the following fields.
String color
String material
String design
Create three instances of object based on different sizes like small, large , xtra-large*/
public class TShirt {
	String color;
	String material;
	String design;
	
	public void shirt (String color,String material,String design) {
		System.out.println("Tshirtcolor="+color+" "+"Tshirtmaterial="+material+" "+"Tshirtdesign="+design);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TShirt a1 = new TShirt();
		System.out.println("size of Tshirt is small");
		a1.shirt("yellow","cotten", "halftshirt");
		
		TShirt a2 = new TShirt();
		System.out.println("size of Tshirt is large");
		a1.shirt("green","cotten", "fulltshirt");
		
		TShirt a3 = new TShirt();
		System.out.println("size of Tshirt is small");
		a1.shirt("red","cotten", "normaltshirt");
		
		

	}

}
