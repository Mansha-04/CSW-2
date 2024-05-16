class College{
	String collegeName;
	String collegeLoc;
	College(String collegeName,String collegeLoc){
		this.collegeName=collegeName;
		this.collegeLoc=collegeLoc;
	}
	void display() {
		System.out.println("College Name: "+this.collegeName);
		System.out.println("College Location: "+this.collegeLoc);
	}
}
class Student extends College{
	int studentId;
	String studentName;
	Student(int studentId, String studentName, String collegeName, String collegeLoc) {
		super(collegeName, collegeLoc);
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	void displayStudentInfo() {
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student Name: "+this.studentName);
		System.out.println("College Name: "+this.collegeName);
		System.out.println("College Location: "+this.collegeLoc);
	}
	
}
public class Q5 {

	public static void main(String[] args) {
		College c1=new College("ITER","Bhubaneswar");
		College c2=new College("Ravenshaw","Cuttack");
		Student s1=new Student(1111,"Anushka","ITER","Bhubaneswar");
		Student s2=new Student(2141,"Tanisha","Ravenshaw","Cuttack");
		
		c1.display();
		System.out.println();
		c2.display();
		System.out.println();
		
		s1.displayStudentInfo();
		System.out.println();
		s2.displayStudentInfo();

		
		
	}

}
