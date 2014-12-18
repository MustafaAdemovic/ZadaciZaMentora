/**
 * Klasa ima zadatak da ispise Autora njegovo ime, mail i spol
 * 
 * @author mustafaademovic
 *
 */
public class Autor {
	private String name;
	private String mail;
	private String spol;

	// Konstruktori
	public Autor(String name, String mail, String spol) {
		this.name = name;
		this.mail = mail;
		this.spol = spol;
	}

	public Autor(Autor other) {
		this.name = other.name;
		this.mail = other.mail;
		this.spol = other.spol;
	}

	// Getteri
	public String getName() {
		return name;
	}

	public String getMail() {
		return mail;
	}

	public String getSpol() {
		return spol;
	}

	// Setteri
	public void setName(String name) {
		this.name = name;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setSpol(String spol) {
		this.spol = spol;
	}

	/**
	 * Metoda služi za ispis klase Autor Ispisuje njegovo ime, njegov mail i
	 * njegov spol
	 */
	public String toString() {
		String str = "";
		str = "Ime: " + name + "\n" + "Mail: " + mail + "\n" + "Spol: " + spol;
		return str;
	}

}
