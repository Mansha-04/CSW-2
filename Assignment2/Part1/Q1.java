class Student <T>{
	private String name;
	private int age;
	private T roll;
	Student(String name,T roll,int age){
		this.name=name;
		this.roll=roll;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public T getRoll() {
		return roll;
	}
	public void display() {
		System.out.println(name+" "+roll+" "+age);
	}
	
}
public class Q1 {

	public static void main(String[] args) {
		Student<Integer> s1=new Student("A",12,20);
		Student<String> s2=new Student("B","12BX",14);
		s1.display();
		s2.display();
	}

}
