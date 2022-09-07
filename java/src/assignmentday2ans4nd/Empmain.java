package assignmentday3ans4nd;

public class Empmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Technical Employee Instance
		TechEmp t1 = new TechEmp(123, "gagan", "JAVA", 25000, 5);
				Address tAdd = new Address("gandhi nagar"," Bengaluru", 560076);
				t1.address = tAdd;
				
				//Staff
				Staff s1 = new Staff(456, "anil", 12000, 2);
				Address sAdd = new Address( "HSR Layout", "Bengaluru", 560076);
				s1.address = sAdd;
				
				//Display all details
				System.out.println(t1);
				System.out.println("\n\n" + s1);

	}

}
