package laboratorium08.zadanie5;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	List<Class<?>> list = new ArrayList<Class<?>>();

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		System.out.println(zoo.put(new Object())); // włoży nowy obiekt
		System.out.println(zoo.put("Ala")); // wyrzuci poprzednio włożony
											// obiekt, bo String jest bardziej
											// specyficzny i włoży String
		System.out.println(zoo.put(new Object())); // operacja się nie
													// powiedzie, bo mamy już
													// bardziej specyficzny
													// egzemplarz
		System.out.println(zoo.put(1));
		System.out.println(zoo.put(2));
		System.out.println(zoo);
		System.out.println(zoo.putAny(Zoo.class));
		System.out.println(zoo.putAny(Object.class));
		System.out.println(zoo);
		System.out.println(zoo.whatDoWeHave());
	}

	private char[] whatDoWeHave() {
		// TODO Auto-generated method stub
		return null;
	}

	private char[] putAny(Class<?> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	private char[] put(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
