package laboratorium06.zadanie1;

public class Big implements Predicate {

	@Override
	public boolean test(Object o) {
		return ((Integer) o).intValue()>1000;
	}

}
