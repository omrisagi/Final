
public class Book {
	
	// Attributes
	
	private String bookName;
	private int publicationYear;
	private Author author;
	private double price;
	private int numOfPages;
	
	// Constructor
	
	public Book(String bookName, int publicationYear,
				Author author, double price, int numOfPages) {
		
		setBookName(bookName);
		setPublicationYear(publicationYear);
		setAuthor(author);
		setPrice(price);
		setNumOfPages(numOfPages);
		
	}
	
	// Setters & Getters
	
	public void setBookName(String bookName) {
		
		if (bookName.length() >= 3)
			this.bookName = bookName;
		
		else
			this.bookName = "Temp";
		
	}
	
	public String getBookName() {
		
		return bookName;
		
	}

	public int getPublicationYear() {
		
		return publicationYear;
		
	}

	public void setPublicationYear(int publicationYear) {
		
		if (publicationYear >= 2000)
			this.publicationYear = publicationYear;
		
		else
			this.publicationYear = 2000;
		
	}

	public Author getAuthor() {
		
		return author;
		
	}

	public void setAuthor(Author author) {
		
		this.author = author;
		
	}

	public double getPrice() {
		
		return price;
	}

	public void setPrice(double price) {
		
		if (price > 0)
			this.price = price;
		
		else
			this.price = 0;
		
	}

	public int getNumOfPages() {
		
		return numOfPages;
		
	}

	public void setNumOfPages(int numOfPages) {
		
		if (numOfPages >= 1 )
			this.numOfPages = numOfPages;
		
		else
			this.numOfPages = 1;
		
	}
	
	// toString
	
	public String toString() {

		return "Author: " + this.author.getName()
		+ "\nPrice: " + this.price
		+ "\nYear Of Publication: " + this.publicationYear
		+ "\nAmount Of Pages: " + this.numOfPages;
		
	}
	
	// Equals
	
	public boolean equals(Book other) {
		
		return this.bookName.equals(other.bookName)
				&& this.publicationYear == other.publicationYear
				&& this.author.equals(other.author)
				&& this.price == other.price
				&& this.numOfPages == other.numOfPages;
		
	}
	
	// Author And Book Share The Same First Char
	
	public boolean authorAndBookShareFirstChar() {
		
		return this.bookName.charAt(0) 
				== this.author.getName().charAt(0);
		
	}
	
	// Discount
	
	public void discount() {
		
		if (this.price > 100) 
			setPrice(price * 0.9);
		
	}
	
	// isLong
	
	public boolean isLong() {
		
		return this.numOfPages > 250;
		
	}


}
