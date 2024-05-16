class st implements Comparable<st>{
	private String name;
	private int rn;
	private int mark;
	st(String name,int rn,int mark){
		this.name=name;
		this.rn=rn;
		this.mark=mark;
	}
	public int compareTo(st stu) {
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
public class Q5{
	public static void main(String[]args) {
		st sts[]= {new st("A",130,14),new st("B",140,15),new st("C",10,94),new st("D",150,19),new st("E",139,17)};
		
		}
}