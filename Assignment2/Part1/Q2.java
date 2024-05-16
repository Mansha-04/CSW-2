class Book{
	private int bookId;
	private String bookName;
	private double price;
	Book(int bookId,String bookName,double price){
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;
	}
	public void display() {
		System.out.println(bookName+" "+bookId+" "+price);
	}
	public String toString() {
		return bookName+" "+bookId+" "+price;
	}
	public boolean equals(Object o) {
		if(o==this) {
			return true;
		}
		if(this==null || this.getClass()!=o.getClass()) {
			return false;
		}
		Book c=(Book)o;
		return bookId==c.bookId && bookName==c.bookName && price==c.price;
	}
	public double getPrice() {
		return price;
	}
}
public class Q2 {

	public static void main(String[] args) {
		Book b1=new Book(28,"A",500);
		Book b3=new Book(28,"A",500);
		Book b2=new Book(34,"B",280);
		b1.display();
		b2.display();
		System.out.println(b1.equals(b3));
		if(b1.getPrice()>b2.getPrice()) {
			System.out.println("b1 is more expensive");
		}
		else if(b2.getPrice()>b1.getPrice()) {
			System.out.println("b2 is more expensive");
		}
		else {
			System.out.println("same price");
		}

	}

}
