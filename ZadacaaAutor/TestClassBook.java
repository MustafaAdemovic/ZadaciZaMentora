public class TestClassBook {

	public static void main(String[] args) {

		Autor num = new Autor("Mustafa", "mustafa.ademovic@gmail.com",
				"Muskarac");

		Book num1 = new Book("Price", 50, 5, num);

		System.out.println(num1.toString());

	}

}
