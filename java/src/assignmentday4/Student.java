package assignmentday5;

/*  Create a student class with list of students and
 *  display the students based on markers with descending order 
 *  using the compareTo method with lambda expressions
 */

public class Student {
	 int id;
	 String name;
	int marks;

	public Student(int id , String name, int marks) {
		this.id = id;
		this.marks = marks;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}



}
