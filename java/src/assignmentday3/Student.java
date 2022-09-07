package assignmentday4;

//1)	Create student class having stdID ,stdName, stdClass and 
//display the information of two objects

public class Student {
	
	int stdId;
	String stdName;
	int stdClass;
	
	public void student (int stdId,String stdName,int stdClass) {
		System.out.println("studentId="+stdId+"studentname="+stdName+"studentclass="+stdClass);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s=new  Student();
		 s.student(123,"shiva",7);
		

	}

}





