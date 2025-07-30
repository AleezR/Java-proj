class Book {
    String title;
    String author;
    double price;
    int quantity;

    Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public void BookDetails() {
        System.out.println("TITLE: " + title);
        System.out.println("AUTHOR: " + author);
        System.out.println("PRICE: " + price);
        System.out.println("QUANTITY: " + quantity);
        double total = price * quantity;
        System.out.println("TOTAL VALUE: " + total);
        System.out.println();
    }
}

public class BookInfo {
    public static void main(String[] args) {
        Book b1 = new Book("bobby", "ria", 56, 10);
        b1.BookDetails();

        Book b2 = new Book("bob", "adi", 100, 10);
        b2.BookDetails();
    }
}
