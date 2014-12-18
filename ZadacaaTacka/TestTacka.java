public class TestTacka {

	public static void main(String[] args) {
		Tacka a = new Tacka();
		Tacka b = new Tacka(1, 1);
		Tacka c = new Tacka(1, 1);

		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());

		System.out.println(a.equals(b));
		System.out.println(b.equals(c));

		System.out.println("Distanca između takčke a i tačke b je: "
				+ a.getDistance(b));
		System.out.println("Distanca između takčke b i tačke c je: "
				+ b.getDistance(c));

	}

}
