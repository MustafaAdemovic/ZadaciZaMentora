/**
 * Klasa ispisuje Knjigu, njeno ime, cijenu i stanje(koliko ima tih knjiga 
 * na stanju)
 * 
 * @author mustafaademovic
 *
 */
public class Book {
	private String name;
	private int price;
	private int state;
	public Autor autor;

	// Konstruktori
	public Book(String name, int price, int state, Autor autor) {
		this.name = name;
		this.price = price;
		this.state = state;
		this.autor = new Autor(autor);
	}

	public Book(Book other) {
		this.name = other.name;
		this.price = other.price;
		this.state = other.state;
		this.autor = other.autor;
	}

	// Getteri
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getState() {
		return state;
	}

	public Autor getAutor() {
		return autor;
	}

	// Setteri
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	/**
	 * Metoda služi za ispis ove klase Ime knjige, cijena, koliko je ima na
	 * stanju i autora
	 */
	public String toString() {
		String str = "";
		str = "Ime knjige: " + name + "\n" + "Cijena knjige: " + price
				+ " KM\n" + "Stanje: " + state + "\nAutor knjige je: \n"
				+ autor;
		return str;
	}

}
