public class Author {
	
	// Attributes
	
	private String name;
	private int age;
	
	// Constructor
	
	public Author(String name, int age) {
		
		setName(name);
		setAge(age);
		
	}
	
	// Setters
	
	public void setName(String name) {
		
		if (name.length() > 2)
			this.name = name;
		
		else
			this.name = "General";
		
	}
	
	public void setAge(int age) {
		
		if (age > 18)
			this.age = age;
		
		else
			this.age = 18;
		
	}
	
	// Getters
	
	public String getName() {
		
		return name;
		
	}

	public int getAge() {
		
		return age;
		
	}
	
	// toString
	
	public String toString() {
		
		return "The Name Of The Author Is " + this.name
				+ "\nHis Age Is " + this.age;

	}
	
	// Equals

	public boolean equals(Author other) {
		
		return this.name.equals(other.name)
				&& this.age == other.age;
		
	}
	
}
