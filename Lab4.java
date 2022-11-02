class Book{
	String bookname, authorname, publisher;
	long ISBNnumber;
	Book(){
		String bookname=authorname=publisher=" ";
		long ISBNnumber=0;
	}
	Book(String a,int b,String c,String d){
		bookname=a;
		ISBNnumber=b;
		authorname=c;
		publisher=d;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public long getISBNnumber() {
		return ISBNnumber;
	}
	public void setISBNnumber(long iSBNnumber) {
		ISBNnumber = iSBNnumber;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	void getBookInfo() {
		System.out.println(bookname+" "+ISBNnumber+" "+authorname+" "+publisher);
	}}
public class Lab4 {
	public static void main(String[] args) {
		Book a[]=new Book[30];
		a[1]=new Book("Java the complete reference",234567,"Herbert Schildt","Sri");
		a[1].getBookInfo();
	}
}
