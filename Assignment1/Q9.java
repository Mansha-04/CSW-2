import java.util.ArrayList;
import java.util.List;

interface Enrollment{
	abstract void enroll(Student student,Course course);
	abstract void drop(Student student,Course course);
	abstract void displayEnrollmentDetails();
}
class Student{
	private String studentId;
	private String name;
	Student(String studentId,String name){
		this.studentId=studentId;
		this.name=name;
	}
	public String getId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
}
class Course{
	private String courseId;
	private String courseName;
	Course(String courseId,String courseName){
		this.courseId=courseId;
		this.courseName=courseName;
	}
	public String getCid() {
		return courseId;
	}
	public String getCname() {
		return courseName;
	}
}
class Enroll implements Enrollment{
	private List<Student> enrolledS;
	private List<Course> enrolledC;
	public Enroll() {
		this.enrolledS=new ArrayList<>();
		this.enrolledC=new ArrayList<>();
	}
	public void enroll(Student student,Course course) {
		enrolledS.add(student);
		enrolledC.add(course);
		System.out.println("student and course: "+student.getName()+" "+course.getCname());
	}
	public void drop(Student student,Course course) {
		int ind=enrolledS.indexOf(student);
		if(ind !=-1 && enrolledC.get(ind).equals(course)) {
			enrolledS.remove(ind);
			enrolledC.remove(ind);
			System.out.println("student dropped");
		}
		else {
			System.out.println("student not enrolled");
		}
	}
	public void displayEnrollmentDetails() {
		for(int i=0;i<enrolledS.size();i++) {
			System.out.println("student and course are "+enrolledS.get(i).getName()+" "+enrolledC.get(i).getCname());
		}
	}
}
public class Q9 {

	public static void main(String[] args) {
		Enrollment e=new Enroll();
		Student s1=new Student("10","A");
		Student s2=new Student("20","B");
		Course c1=new Course("CSE11","ALA");
		Course c2=new Course("CSE22","CSW2");
		e.enroll(s1, c1);
		e.enroll(s2, c2);
		e.displayEnrollmentDetails();
		e.drop(s2, c2);
		e.displayEnrollmentDetails();

	}

}
