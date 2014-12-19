/**
 * Zadatak: Ispisati imena i prezimena studenata BitCampa i raspored njihovog
 * sjedenja
 * 
 * @author mustafaademovic
 *
 */
public class ClassRoom {
	private Student[][] raspored;
	private int redRandom = (int)(Math.random() * 6);
	private int kolonaRandom = (int)(Math.random() * 4);

	// Konstruktor
	public ClassRoom() {
		raspored = new Student[6][4];
	}

	/**
	 * Metoda ispisuje imena studenata po koji su sortirani u 4 reda i 6 kolona
	 */
	public void sortStudents() {

		raspored[0][0] = new Student("Prva klupa desni red:\nJesenko Gavric ");
		raspored[0][1] = new Student("Sanela Grcic \n");
		raspored[0][2] = new Student(
				"Prva klupa lijevi red:\nAmra Poprzanovic ");
		raspored[0][3] = new Student("Gorjan Kalauzovic \n");
		raspored[1][0] = new Student("Druga klupa desni red:\nDavor Stankovic ");
		raspored[1][1] = new Student("Emir Imamovic \n");
		raspored[1][2] = new Student("Druga klupa lijevi red:\nNedzad Hamzic ");
		raspored[1][3] = new Student("Haris Arifovic \n");
		raspored[2][0] = new Student("Treca klupa desni red:\nSelma Tabakovic ");
		raspored[2][1] = new Student("Adnan Spahic \n");
		raspored[2][2] = new Student(
				"Treca klupa lijevi red:\nNeldin Dzekovic ");
		raspored[2][3] = new Student("Nermin Graca \n");
		raspored[3][0] = new Student("Cetvrta klupa desni red:\nHaris Krkalic ");
		raspored[3][1] = new Student("Gordan Sajevic \n");
		raspored[3][2] = new Student(
				"Cetvrta klupa lijevi red:\nEdib Imamovic ");
		raspored[3][3] = new Student("Mustafa Ademovic \n");
		raspored[4][0] = new Student("Peta klupa desni red:\nNermin Vucinic");
		raspored[4][1] = new Student("Mirza Becic \n");
		raspored[4][2] = new Student(
				"Peta klupa lijevi red:\nHikmet Durgutovic");
		raspored[4][3] = new Student("Nedim Omerovic \n");
		raspored[5][0] = new Student("Sesta klupa desni red:\nVedad Zornic");
		raspored[5][1] = new Student("Prazno \n");
		raspored[5][2] = new Student("Sesta klupa lijevi red:\nPrazno");
		raspored[5][3] = new Student("Emina Muratovic");

	}// Kraj metode sortStudent

	/**
	 * Metoda ispisuje random studenta, svaki put ispise drugug studenta
	 */
	public void ispisiRandomStudenta() {
		System.out.println("\nRandom student je:\n"
				+ raspored[redRandom][kolonaRandom]);
	}// Kraj metode ispisiRandomStudenta

	/**
	 * Metoda ispisuje studente po redoslijedu koji smo mu u predhodnoj metodi
	 * zadali
	 */
	public void writeStudent() {
		for (int i = 0; i < raspored.length; i++) {
			for (int j = 0; j < raspored[i].length; j++) {
				System.out.println(raspored[i][j].toString() + " ");
			}// For petlja j
		}// For petlja i
	}// Kraj metode writeStudent

}// Kraj klase ClassRoom
