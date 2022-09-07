package assignmentday3;

public class Employeemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager(123, "gagan", 35000);
		Developer d1 = new Developer(456, "anil", 35000);
		Tester t1 = new Tester(889, "akarsh", 35000);
		m1.display();
		System.out.println();
		d1.display();
		System.out.println();
		t1.display();

	}

}
