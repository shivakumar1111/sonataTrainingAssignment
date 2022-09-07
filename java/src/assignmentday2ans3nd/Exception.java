package assignmentday3ans3nd;

public class Exception  {

	public static void main(String[] args) throws Exception1 {
		// TODO Auto-generated method stub
		int yearlySalary = 10000;
		if(yearlySalary<100000) {
			throw new Exception1("Salary is less than 100000");
		}
		else {
				System.out.println("Salary is not less than 100000");
			}

	}

}
