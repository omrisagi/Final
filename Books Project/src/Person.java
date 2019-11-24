
public class Person {
	
	// Attributes
	
	private String firstName;
	private String lastName;
	private String gender;
	private double age;
	private int id;
	
	// Static Variables
	
	private static int numOfPeople = 0;
	
	// Constructors
	
	public Person() {
		
		firstName = "Jon";
		lastName = "Doe";
		gender = "Male";
		age = 33;
		
		numOfPeople ++;
		id = numOfPeople;
		
	}
	
	public Person(String firstName, String lastName,
				  String gender, double age) {
		
		setFirstName(firstName);
		setLastName(lastName);
		setGender(gender);
		setAge(age);
		
		numOfPeople ++;
		id = numOfPeople;
		
	}
	

	// Helpful Methods
	
	private boolean isNameOkay(String name) {
		
		return name.length() > 2;

	}
	
	// Setters
	
	public void setGender(String gender) {
		
		if (gender.equalsIgnoreCase("Male")
			|| gender.equalsIgnoreCase("Female"))
			this.gender = gender;
			
		
	}
	
	public void setFirstName(String firstName) {
		
		if (isNameOkay(firstName)) 
			this.firstName = firstName;
	
	}
	
	public void setLastName(String lastName) {
		
		if (isNameOkay(lastName))
			this.lastName = lastName;
		
	}
	
	public void setAge(double age) {
		
		if (age > 0)
			this.age = age;
		
	}
	
	// Getters
	
	public static int getNumOfPeople() {
		
		return numOfPeople;
		
	}
	
	public String getFullName() {
		
		return this.firstName + " " + this.lastName;
	}
	
	// toString
	
	public String toString() {
		
		return "Full Name: " + this.getFullName()
		+ "\nGender: " + this.gender
		+ "\nAge: " + this.age +
		"\nID: " + id;
		
	}

}
