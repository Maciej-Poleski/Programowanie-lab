package laboratorium06.zadanie1;

public class Even implements Predicate {

	@Override
	public boolean test(Object o) {
		return ((Integer) o).intValue() % 2 == 0;
	}

}
