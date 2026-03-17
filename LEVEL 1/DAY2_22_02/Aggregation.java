class Book {
    String name;
    Book(String name) {
        this();
        this.name = name;
    }
    Book(){
        System.out.println("book exists");
    }
}
class Library {
    Book b;   // has a book
    Library(Book b) {
        this.b = b;//received the book
    }
    void show() {
        System.out.println("Book available: " + b.name);
    }
}
//HAS-A independent
public class Aggregation{
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");  // created outside
        Library l = new Library(b1);
        l.show();
    }
}
