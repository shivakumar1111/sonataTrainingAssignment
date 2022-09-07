package assignmentday5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			List<Student> stu = new ArrayList<>();
			stu.add(new Student(1,"shiva",800));
			stu.add(new Student(2,"anil",650));
			stu.add(new Student(3,"gagan",350));
			stu.add(new Student(4,"abhi",425));
			
			System.out.println("Befotre sorting");
			stu.forEach(Student->System.out.println(Student));
			System.out.println();
			
			Collections.sort(stu,(s1,s2)->s1.getName().compareTo(s2.getName()));
			System.out.println("Sorting based on name");
			stu.forEach(System.out::println);
			System.out.println();
			
			
			stu.sort(Comparator.comparing( Student::getMarks,Comparator.reverseOrder()));
			System.out.println("After sorting based on marks in desc order");
			stu.forEach(System.out::println);
		

	}

}
