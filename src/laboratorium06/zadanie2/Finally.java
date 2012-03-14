package laboratorium06.zadanie2;

public class Finally {
	public static void main(String... args) {
		try {
			System.out.println("try");
			System.exit(-1); }
		 finally {
			System.out.println("finally");
		}

	}
}
