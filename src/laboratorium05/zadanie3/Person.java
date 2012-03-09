package laboratorium05.zadanie3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> 
{
	private String name1;
	private String name2;
	private int value;

	public Person(String string, String string2, int i) {
		name1 = string;
		name2 = string2;
		value = i;
	}

	@Override
	public int compareTo(Person o) {
		if (value > o.value
				|| (value == o.value && name2.compareTo(o.name2) < 0)
				|| (value == o.value && name2.compareTo(o.name2) == 0 && name1
						.compareTo(o.name1) < 0))
			return -1;
		else if (value == o.value && name2.compareTo(o.name2) == 0
				&& name1.compareTo(o.name1) == 0) {
			return 0;
		} else
			return 1;
	}

	@Override
	public String toString() {
		return "" + name1 + " " + name2 + " (" + value + ")";
	}

	public static void main(String args[]) {
		Person t[] = new Person[] { new Person("Jan", "Kowalski", 31),
				new Person("Piotr", "Buczek", 10),
				new Person("Piotr", "Adamczyk", 10),
				new Person("Adam", "Kowalski", 31) };
		System.out.println(Arrays.toString(t));
		Arrays.sort(t);
		System.out.println(Arrays.toString(t));

		Person y[] = new Person[] { new Person("Jan", "Kowalski", 31),
				new Person("Piotr", "Buczek", 10),
				new Person("Piotr", "Adamczyk", 10),
				new Person("Adam", "Kowalski", 31) };
		List<Person> Tsorted = Arrays.<Person> asList(y);
		System.out.println(Tsorted);
		Collections.sort(Tsorted);
		System.out.println(Tsorted);

	}

}
