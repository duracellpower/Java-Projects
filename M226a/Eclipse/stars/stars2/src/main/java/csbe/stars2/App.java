package csbe.stars2;

/**
 * Hello world!
 *
 */

public class App {
	public int[] numberArray = new int[30];
	
	public App() {
		for(int i = 0; i < numberArray.length; i++) {
			int randomNumber = (int) Math.floor(Math.random()*50 + 1);
			numberArray[i] = randomNumber;
		}
		for(int i = 0; i < numberArray.length; i++) {
			System.out.print(numberArray[i] + ", ");
		}
	}

}
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	
//    	for(int x = 10; x > 0; x--) {
//    		System.out.println("");
//    		for(int y = 0; y < x; y++) {
//    			System.out.print("*");
//    		}
//    		}
//    	}
//    	
//    	
//    	
//    	
//   	String output = "";
//   	for(int line = 0; line < 10; line++) {
//   		System.out.println(output = output + "*"); // abgekürzt: System.out.println(star += "*");
//   	} 	
  
 //}
    
    
    

