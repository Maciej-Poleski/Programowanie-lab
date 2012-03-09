package laboratorium05.zadanie5;

public interface Queue extends Iterable<Integer> {
	Queue add(int value);
	int remove();
	
	boolean isEmpty();
}
