/**
 * Napisati klasu Tacka koja predstavlja tacku u 2D koordinatnom sistemu. Tacke u takvim
 * sistemima imaju 2 koordinate: x i y. Klasa tacka osim standardnih metoda treba I da ima metodu da
 * provjeri koliko je jedna tacka udaljena od druge double getDistance(Point other).
 * 
 * @author mustafaademovic
 *
 */
public class Tacka {
	private double x;
	private double y;

	// Konstruktori
	public Tacka() {
		this.x = 0;
		this.y = 0;
	}

	public Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Tacka(Tacka other) {
		this.x = other.x;
		this.y = other.y;
	}

	/**
	 * Metoda provjerava je li stvarne vrijednosti i kopija imaju iste
	 * vrijednosti ako imaju vraća true, ako nemaju vraća false
	 * 
	 * @param other
	 * @return true or false
	 */
	public boolean equals(Tacka other) {
		if (this.x == other.x && this.y == other.y) {
			return true;
		} else {
			return false;
		}
	}// Kraj metode equals

	/**
	 * Metoda getDistance po formuli računa dužinu između dvije tačke
	 * 
	 * @param other
	 * @return distance(Dužinu između dvije tačke)
	 */
	public double getDistance(Tacka other) {
		double distance = Math.sqrt((Math.pow(other.x - this.x, 2))
				+ (Math.pow(other.y - this.y, 2)));
		return distance;
	}// Kraj metode getDistance

	/**
	 * Metoda ima zadatak da ispiše x i y kao (x, y)
	 */
	public String toString() {
		String str = "";
		str = "(" + this.x + ", " + this.y + ")";
		return str;
	}// Kraj metode toString

}
