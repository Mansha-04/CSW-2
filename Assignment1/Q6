abstract class LibraryResources{
	private String title;
	private String author;
	LibraryResources(String title,String author){
		this.title = title;
		this.author = author;
	}

	public void setValue(String title,String author) {
		this.title = title;
		this.author = author;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public void getValue() {
		System.out.println("title: "+title+" author: "+author);
	}
	public abstract void displayDetials();
	
	
}
class Book extends LibraryResources{
	int pageCount;
	Book(String title,String author,int pageCount){
		super(title,author);
		this.pageCount=pageCount;
	}
	public void setValue(String title,String author,int pageCount) {
		title =getTitle();
		author =getAuthor();
		this.pageCount=pageCount;
	}
	public void getValue() {
		System.out.println("title: "+getTitle()+" author: "+getAuthor()+" page count: "+this.pageCount);
	}
	@Override
	public void displayDetials() {
		System.out.println("title: "+getTitle()+" author: "+getAuthor()+" page count: "+this.pageCount);
	}
}
class Magazine extends LibraryResources{
	String issueDate;
	Magazine(String title,String author,String issueDate){
		super(title,author);
		this.issueDate=issueDate;
	}
	public void setValue(String title,String author,String issueDate) {
		title =getTitle();
		author =getAuthor();
		this.issueDate=issueDate;
	}
	public void getValue() {
		System.out.println("title: "+getTitle()+" author: "+getAuthor()+" issue date: "+this.issueDate);
	}
	@Override
	public void displayDetials() {
		System.out.println("title: "+getTitle()+" author: "+getAuthor()+" issue date: "+this.issueDate);
	}
}
class DVD extends LibraryResources{
	int duration;
	DVD(String title,String author,int duration){
		super(title,author);
		this.duration=duration;
	}
	public void setValue(String title,String author,int duration) {
		title =getTitle();
		author =getAuthor();
		this.duration=duration;
	}
	public void getValue() {
		System.out.println("title: "+getTitle()+" author: "+getAuthor()+" duration: "+this.duration);
	}
	@Override
	public void displayDetials() {
		System.out.println("title: "+getTitle()+" author: "+getAuthor()+" duration: "+this.duration);
	}
	
}
public class LibrarySystem {

	public static void main(String[] args) {
		Book b1=new Book("The Housemaid", "Frieda McLaurren", 300);
		Magazine m1=new Magazine(null, null, null);
		DVD d1=new DVD(null, null, 0);
		
		b1.displayDetials();
		m1.displayDetials();
		d1.displayDetials();
	}

}
