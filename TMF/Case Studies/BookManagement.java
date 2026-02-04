package collections;
import java.util.*;
public class BookManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Book> books = new ArrayList<>();

	        
	        addBook(books, new Book(1, "Java Basics", "James"));
	        addBook(books, new Book(2, "Python Guide", "Guido"));
	        addBook(books, new Book(3, "Effective Java", "James"));
	        addBook(books, new Book(4, "C Programming", "Dennis"));
	        addBook(books, new Book(1, "Duplicate Book", "Someone")); // duplicate id

	      
	        System.out.println("\nAll Books:");
	        for (Book b : books) {
	            System.out.println(b);
	        }

	       
	        int searchId = 3;
	        Book foundBook = searchBookById(books, searchId);

	        System.out.println("\nSearch Result for Book ID " + searchId + ":");
	        if (foundBook != null) {
	            System.out.println(foundBook);
	        } else {
	            System.out.println("Book not found");
	        }

	     
	        String searchAuthor = "James";
	        System.out.println("\nBooks by author: " + searchAuthor);
	        displayBooksByAuthor(books, searchAuthor);
	    }

	    
	    private static void addBook(List<Book> books, Book newBook) {
	        for (Book b : books) {
	            if (b.id == newBook.id) {
	                System.out.println("Duplicate book ID found: " + newBook.id);
	                return;
	            }
	        }
	        books.add(newBook);
	    }

	    // 3️⃣ Search book by id
	    private static Book searchBookById(List<Book> books, int id) {
	        for (Book b : books) {
	            if (b.id == id) {
	                return b;
	            }
	        }
	        return null;
	    }

	    // 4️⃣ Display books by author
	    private static void displayBooksByAuthor(List<Book> books, String author) {
	        boolean found = false;
	        for (Book b : books) {
	            if (b.author.equalsIgnoreCase(author)) {
	                System.out.println(b);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No books found for this author");
	        }
	}

}
