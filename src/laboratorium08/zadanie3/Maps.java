package laboratorium08.zadanie3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> temp1 = new HashMap<Integer, String>();
		temp1.put(1, "Ala");
		temp1.put(2, "ma");
		Map<String, String> temp2 = new TreeMap<String, String>();
		temp2.put("Ala", "Ala");
		temp2.put("ma", "ma");
		System.out.println(disjointIm(temp1, temp2));
	}

	private static boolean disjointIm(Map<?, ?>... args) {
		List<Object> set = new ArrayList<Object>();
		if (args.length < 2)
			return false;
		set.addAll(args[0].values());
		for (Map<?, ?> arg : args) {
			for (Object o : set) {
				if (!arg.values().contains(o)) {
					set.remove(o);
				}
			}
		}
		return set.isEmpty();
	}

}
