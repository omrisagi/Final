
public class KidsBook extends Book {

	// Attributes
	
	private boolean hardCover;
	
	// Constructor
	
	public KidsBook(String bookName, int publicationYear,
			Author author, double price, int numOfPages,
			boolean hardCover) {
		
		super(bookName, publicationYear, author,
				price, numOfPages);
		this.hardCover = hardCover;
		
	}
	
	// Getters
	
	public boolean hasHardCover() {
		
		return hardCover;
		
	}
	
	// Equals
	
	// toString
	
	public String toString() {
		
		String strToReturn = super.toString();
		
		if (hardCover)
			strToReturn += "\nThis Book Has Hard Cover.";
		
		else
			strToReturn += "\nThis Book Has Soft Cover.";
		
		return strToReturn;
				
	}

}
