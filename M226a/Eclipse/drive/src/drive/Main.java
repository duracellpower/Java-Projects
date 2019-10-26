package drive;

public class Main {
	public static void main(String args[]) {
		Car myCar = new Car("royal blue", "Fiat", 75, 3);
		Car yourCar = new Car("black", "VW", 110, 5);
		Bike myBike = new Bike("blue", "Tour de Suisse", 1200.00);
		Bike yourBike = new Bike("orange", "BMC", 5850.60);
		
		System.out.println("Mein Auto hat die Farbe " + myCar.color);
	}
}
