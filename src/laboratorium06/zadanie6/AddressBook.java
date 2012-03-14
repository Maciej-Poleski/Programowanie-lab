package laboratorium06.zadanie6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class AddressBook {
	Map<String, ArrayList<String>> internalMap = new HashMap<String, ArrayList<String>>();

	public AddressBook() {
	}

	public void add(Number number, Name name) {
		if (internalMap.containsKey(name.toString())) {
			ArrayList<String> t = internalMap.get(name.toString());
			t.add(number.toString());
			internalMap.put(name.toString(), t);
		} else {
			ArrayList<String> t = new ArrayList<String>();
			t.add(number.toString());
			internalMap.put(name.toString(), t);
		}
	}

	public void del(Number number) {
		for (String name : internalMap.keySet()) {
			ArrayList<String> t = internalMap.get(name);
			if (t.contains(number.toString())) {
				t.remove(number.toString());
				internalMap.put(name, t);
			}
		}
	}

	public void del(Name name) {
		internalMap.remove(name.toString());
	}

	public LinkedList<Number> numberOfPerson(Name name) {
		LinkedList<Number> result = new LinkedList<Number>();
		if (!internalMap.containsKey(name.toString()))
			return result;
		for (String number : internalMap.get(name.toString())) {
			result.add(new Number(number));
		}
		return result;
	}

	public Name find(Number number) {
		for (String name : internalMap.keySet()) {
			ArrayList<String> numbers = internalMap.get(name);
			if (numbers.contains(number.toString()))
				return new Name(name);
		}
		return null;
	}
}
