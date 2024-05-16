
public class Rectangle {
	private int length;
	private int width;
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	public void setLength(int length) {
		this.length=length;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public void getLength() {
		System.out.println("length: "+this.length);
	}
	public void getWidth() {
		System.out.println("width: "+this.width);
	}
	void area(){
		int a=this.length*this.width;
		System.out.println("Area: "+a);
	}
	void perimeter(){
		int b=2*(this.length+this.width);
		System.out.println("Perimeter: "+b);
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(3,8);
		Rectangle r2=new Rectangle(5,9);

		r1.area();
		r1.perimeter();
		r2.area();
		r2.perimeter();
		
		System.out.println();
		
		r1.setLength(2);
		r1.setWidth(4);
		
		r2.setLength(7);
		r2.setWidth(1);
		
		r1.area();
		r1.perimeter();
		r2.area();
		r2.perimeter();
		
	}

}
