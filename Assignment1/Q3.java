
public class Point {
	private int X;
	private int Y;
	Point(int X,int Y){
		this.X=X;
		this.Y=Y;
	}
	Point(Point a){
		X=a.X;
		Y=a.Y;
	}
	void setValue(int X,int Y) {
		this.X=X;
		this.Y=Y;
	}
	void getValue() {
		System.out.println("X: "+this.X+" Y:"+this.Y);
	}
	public static void main(String[] args) {
		Point p1=new Point(2,3);
		Point p2=new Point(p1);
		
		p1.getValue();
		p2.getValue();
		System.out.println();
		p1.setValue(8, 3);
		p1.getValue();
		p2.getValue();
	}

}
