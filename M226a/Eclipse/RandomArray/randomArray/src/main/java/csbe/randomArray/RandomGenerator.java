package csbe.randomArray;

public class RandomGenerator {
	public int[] numberArray = new int[30];
	
	public RandomGenerator() {
		for(int i = 0; i < numberArray.length; i++) {
			int randomNumber = (int) Math.floor(Math.random()*50 + 1);
			numberArray[i] = randomNumber;
		}
		for(int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i] + ", ");
		}
	}

}



//public class RandomGenerator {
//	// The list of randomly generated numbers
//	public int[] numberArray =  new int[30];
//	
//	public RandomGenerator() {
//		// Create a new random number between 1 and 50 for every entry in the Array
//		for(int i = 0; i < numberArray.length; i++) {
//			int randomNumber = (int) Math.floor(Math.random()*50 + 1);
//			numberArray[i] = randomNumber;
//		}
//		// Print all the numbers in the array
//		for (int i = 0; i < numberArray.length; i++) {
//			// TODO @Ilona - avoid the trailing comma :)
//			System.out.print(numberArray[i] + ", ");
//		}
//	}
//}

