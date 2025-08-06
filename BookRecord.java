package programs;
class BookT{
	String title;
	String author;
	final int bookID;
	static int bookCounter = 1000;
	static final String LIBRARY_NAME = "Central Library";
BookT(){
	title = " ";
	author = " ";
	bookID = bookCounter++ ;
}
BookT(String title,String author){
	this.title = title;
	this.author = author;
	this.bookID = bookCounter++ ;
}
public void displayInfo() {
	System.out.println("Title: " + title);
	System.out.println("Author: " + author);
	System.out.println("Book ID: " + bookID);
}
public void displayinfo(boolean showLibrary) {
	 if (showLibrary) {
         System.out.println("Library: " + LIBRARY_NAME);
     }
}
public static void displayTotalBooks() {
    System.out.println("Total books added: " + (bookCounter-1000));
}
}
public class BookRecord {
	public static void main(String []args) {
	BookT b1 = new BookT("alice","bob");
	BookT b2 = new BookT("To Kill a Mockingbird", "aleena");
	
	 b1.displayInfo();
     b2.displayInfo();

     b1.displayinfo(true);

     BookT.displayTotalBooks();
 }
	
}
