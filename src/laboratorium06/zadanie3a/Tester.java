package laboratorium06.zadanie3a;

public class Tester {
	public SingletonPrime build() {
		SingletonPrime sp;
		for (;;)
			try {
				sp = new SingletonPrime();
				break;
			} catch (InstantiationError e) {
			}

		return sp;
	}

	public static void main(String arg[]) {
		Tester t = new Tester();
		System.out.println(t.build());
		new SingletonPrime();
		System.out.println(t.build());
		System.out.println(t.build());
	}
}
