import java.util.ArrayList;

public class BookStore {
	
	// Attributes
	
	private ArrayList<Book> books;
	
	// Constructor
	
	public BookStore() {
		
		books = new ArrayList<>();
		
	}
	
	// addBook
	
	public void addBook(Book b) {
		
		books.add(b);
		
	}
	
	// numOfBooks
	
	public int numOfBooks() {
		
		return books.size();
		
	}
	
	// numOfHardCovers
	
	public int numOfHardsCovers() {
		
		int c = 0;
		
		for (Book b : books)
			if (b instanceof KidsBook &&
					((KidsBook) b).hasHardCover())
				c ++;
		
		return c;
	}
	
	

}
