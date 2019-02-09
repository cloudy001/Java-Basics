package Basics_in_Java;

interface Test {

	public void testen();
}

public class App extends File {
	public App() {
		super();
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		Machine machine1 = new Machine(2, "");

		Person person2 = machine1;

		person2.move(33, "Nord");

		machine1.move(22, "Ost");
		doGew(machine1);
		// -------------Interface als anonyme Klasse implementieren------------
		Test test = new Test() {

			@Override
			public void testen() {
				System.out.println("Test testen...");

			}

		};
		test.testen();

	}

	// ---------------------------------------------------------------------
	private static void doGew(Machine machine) {

		machine.move(10, "West");
	}

	@Override
	public void start() {
		System.out.println("Start car");

	}

	@Override
	public void stop() {
		System.out.println("Stop car");

	}

}
