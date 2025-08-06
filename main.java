//Incomplete
package lab;
class Book{
	String title;
	String author;
	final int bookID;
	static int bookCounter = 1000;
	static final String LIBRARY_NAME = "Central Library";
Book(){
	this.title = "Unknown author";
	this.author = "Unknown author";
	this.bookID = bookCounter++ ;
}
Book(String title,String author){
	this.title = title;
	this.author = author;
	this.bookID = bookCounter++ ;
}
public void displayInfo() {
	System.out.println("Title: " + title);
	System.out.println("Author: " + author);
	System.out.println("Book ID: " + bookID);
}
}

public class main {

}
