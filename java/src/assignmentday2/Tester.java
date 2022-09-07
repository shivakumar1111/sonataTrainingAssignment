package assignmentday3;

public class Tester extends Employee {
	
	Tester(int id, String name, double sal) {
		super.empId = id;
		super.empName = name;
		super.empSal = sal;
	}
	public void display() {
	
		System.out.println(" Employee ID - " + empId );
		System.out.println("Employee Name - " + empName);
		System.out.println("Yearly Salary -" +empSal);
	
	}
}
