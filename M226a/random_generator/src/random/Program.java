package random;

public class Program {

	public static void main(String args[]) {		
		System.out.println("Random Number Generator");
		System.out.println("-----------------------");
		RandomGenerator gen = new RandomGenerator();
		System.out.println("-----------------------");
		
		System.out.println();
		System.out.println("Person examples");
		System.out.println("---------------");
		Person john = new Person();
		Person deere = new Person();
		
		john.name = "John";
//		System.out.println(john.name); // At this point it is still "John"
		john.age = 21;
		deere.name = "Deere";
		deere.age = 18;

		System.out.println(john.name); // Now it is "Deere"
		System.out.println(john.age);
		System.out.println(deere.name);
		System.out.println(deere.age);
		
		System.out.println("Amount of people: " + Person.getAmountOfPeople());
	}
}