/**
 * Zadatak:Napraviti klasu Student koja pravi ima i prezime studenta
 * 
 * @author mustafaademovic
 *
 */
public class Student {
	private String imePrezime;

	// Konstruktor
	public Student(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	// Getter
	public String getImePrezime() {
		return imePrezime;
	}

	// Setter
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	/**
	 * Metoda toString koja ispisuje ime i prezime studenta
	 */
	public String toString() {
		String str = "";
		str = imePrezime + " ";
		return str;
	}

}// Kraj klase Student
