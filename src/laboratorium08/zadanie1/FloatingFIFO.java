package laboratorium08.zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FloatingFIFO<T extends Floatable> {
	static class Pair<T extends Floatable> {
		int priority;
		T object;
	}

	List<Pair<T>> list = new ArrayList<Pair<T>>();

	public void offer(T e) {
		Pair<T> p = new Pair<T>();
		p.priority = 0;
		p.object = e;
		list.add(p);
		changePriority();
	}

	private void changePriority() {
		for (Pair<T> p : list) {
			p.priority += p.object.getDisplacement();
		}
	}

	public T poll() {
		if (list.size() == 0)
			return null;
		Pair<T> p = list.get(0);
		for (Pair<T> o : list) {
			if (o.priority > p.priority)
				p = o;
		}
		list.remove(p);
		changePriority();
		return p.object;
	}

	public T peek() {
		if (list.size() == 0)
			return null;
		Pair<T> p = list.get(0);
		for (Pair<T> o : list) {
			if (o.priority > p.priority)
				p = o;
		}
		changePriority();
		return p.object;
	}

	@Override
	public String toString() {
		Map<Integer, T> map = new TreeMap<Integer, T>();
		for (Pair<T> p : list) {
			map.put(p.priority, p.object);
		}
		List<T> resultList = new ArrayList<T>(map.values());
		changePriority();
		return "" + resultList;
	}
}
