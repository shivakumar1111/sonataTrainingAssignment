package assignmentday3ans4nd;

public class Staff extends Employee {
	double salary, HRA;
	
	Staff() {}
	Staff(int id, String name,  double bPay, int nLeaves) {
		super.empId = id;
		super.empName = name;
		super.basicPay = bPay;
		super.numofLeaves = nLeaves;
	}
	public double calcHRA() {
		HRA = 0.18 * basicPay;
		return HRA;
	}
	@Override
	public double calculateSalary() {
		salary = basicPay + HRA;
		return salary;
	}
	public String toString() {
		return "Staff Details\n\nID - " + empId + "\nName - " + empName +  "\nAddress - " + address + "\nBasic Pay - " + basicPay + "\nHRA - " + calcHRA() + "\nSalary - " + calculateSalary();
	}

}
