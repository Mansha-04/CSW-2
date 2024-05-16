class Stud implements Comparable<Stud>{
	private String name;
	private int rn;
	private int mark;
	Stud(String name,int rn,int mark){
		this.name=name;
		this.rn=rn;
		this.mark=mark;
	}
	public int compareTo(Stud stu) {
		return Integer.compare(this.rn, stu.rn);
	}
	public String getName() {
		return name;
	}
	public int getRn() {
		return rn;
	}
	public int getMark() {
		return mark;
	}
	public String toString() {
		return name+" "+rn+" "+mark;
	}
}
public class Q4 {
	public static Stud linearSearch(Stud[]sts,int rollno) {
		for(Stud s1:sts) {
			if(s1.getRn()==rollno) {
				return s1;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Stud sts[]= {new Stud("A",130,14),new Stud("B",140,15)};
		int rollno=130;
		Stud s=linearSearch(sts,rollno);
		if(s!=null) {
			System.out.println("student found");
			System.out.println(s);
		}
		else {
			System.out.println("not found");
		}
	}

}
