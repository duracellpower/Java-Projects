package drive;


/**
 * Die Klasse Car wird erstellt und die Eigenschaften �bergeben
 * @author Ilona
 *
 */
public class Car {
	String color;
	String brand;
	int ps;
	int doors;
	 
	/**
	 * Der Konstruktor (Methode) f�r die Klasse Car wird erstellt
	 * @param color: welche Farbe hat das Auto?
	 * @param brand: von velchem Hersteller ist das Auto?
	 * @param ps: wie viele PS hat das Auto?
	 * @param doors: wie wiele T�ren (inkl. Kofferraum) hat das Auto?
	 */
	public Car(String color, String brand, int ps ,int doors ) {
		this.color = color;
		this.brand = brand;
		this.ps = ps;
		this.doors = doors;
	}
}
	


