package random;

public class Person {
	// Static means that it is possible to save only 1 occurrence of a name 
	static String name;
	public int age;

	// Static can be useful for values that should be accessible from different locations
	// like an configuration variable or a global counter (but there are better solutions to this)
	// But static variables also have a potential "security"/stability issue
	private static String company = "lambda";

	// Use a getter instead
	public static String getCompany() {
		return company;
	}
	
	// An advanced example would be to know how many persons have been created
	private static int count = 0;
	
	public static int getAmountOfPeople() {
		return Person.count;
	}
	
	public Person() {
		Person.count++;
		// The count class variable can only be accessed and changed in the person class itself
	}
	
}