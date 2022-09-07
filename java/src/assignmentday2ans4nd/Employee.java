package assignmentday3ans4nd;

public abstract class Employee {
	int empId,numofLeaves;
	String empName;
	double basicPay;
	Address address = new Address();
	public abstract double calculateSalary();

}
