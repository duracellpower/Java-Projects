import java.util.Arrays;
import java.util.Random;

public class AufgabeXO {
	
	
	
	public static char[] createArray() {
		char[] array = new char[10];
		for(int arrayFill = 0; arrayFill < array.length; arrayFill++) {
			array[arrayFill] = 'O';
		}
		return array;
};

/**
 * 
 * @param args
 */
	
public static void main(String[] args) {
	for(int line = 0; line < 10; line++) {
		Random random = new Random();
		int numberOfX = random.nextInt(4) + 1;
		int space = (10 - 1) / numberOfX;
		
		char[] output = createArray();
		
		for (int setX = 0; setX < 10; setX += space +1) {
			output[setX] = 'X';
		}
		
		System.out.println("Zeile " + line + " Zufallszahl: " + numberOfX + " " + String.valueOf(output));
		
	}
};
	
	
	
	
	
	
	
	
	
	
	
	

//    public static char[] createArray() {
//        char[] array = new char[10];
//        for (int arrayFill = 0; arrayFill < array.length; arrayFill++) {
//            array[arrayFill] = 'O';
//        }
//        return array;
//    }
//
//    public static void main(String args[]) {
//        for (int columnOutput = 0; columnOutput < 10; columnOutput++) {
//
//            Random Zufall = new Random();
//            int anzahlx = Zufall.nextInt(4) + 1;
//            int space = (10 - 1) / anzahlx;
//            char[] output = createArray();
//
//            for (int setX = 0; setX < 10; setX += space +1) {
//                output[setX] = 'X';
//            }
//            System.out.println("Zeile " + columnOutput + " Zufallszahl: " + anzahlx + " " + String.valueOf(output));
//        }
//    }
}




