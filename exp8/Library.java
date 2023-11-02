import java.util.HashMap;

abstract class LibraryManagement {
    HashMap<String, Integer> books = new HashMap<String, Integer>();
    void addBook(String bookName, int quantity){
        books.put(bookName, quantity);
    }
    void printBooks(){
        System.out.println("---Books---");
        for(String bookName: books.keySet()){
            System.out.println(bookName + ": " + books.get(bookName));
        }
        System.out.println("-----------");
    }
    abstract void increment(String bookName);
    abstract void decrement(String bookName);
}

class Return_Issue extends LibraryManagement {
    void increment(String bookName){
        books.put(bookName, books.get(bookName) + 1);
        System.out.println("Book returned: " + bookName + " Quantity: " + books.get(bookName));

    }
    void decrement(String bookName){
        books.put(bookName, books.get(bookName) - 1);
        System.out.println("Book issued: " + bookName + " Quantity: " + books.get(bookName));
    }
    void search(String bookName){
        if(books.containsKey(bookName)){
            System.out.println("Book found");
            System.out.println("Book name: " + bookName);
            System.out.println("Quantity: " + books.get(bookName));
        }
        else{
            System.out.println("Book not found");
        }
    }
}

public class Library {
    public static void main(String[] args) {
        Return_Issue library = new Return_Issue();
        library.addBook("The Lord of the Rings", 5);
        library.addBook("The Hobbit", 3);
        library.addBook("The Silmarillion", 2);
        library.printBooks();
        library.search("The Hobbit");
        library.search("The Silmarillion");
        library.search("The Lord of the Rings");
        library.increment("The Hobbit");
        library.printBooks();
        library.decrement("The Silmarillion");
        library.printBooks();
    }
}
