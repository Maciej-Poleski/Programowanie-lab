package laboratorium08.zadanie2;

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
		changePriority();
		Pair<T> p = new Pair<T>();
		p.priority = 0;
		p.object = e;
		list.add(p);

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
		List<T> result = new ArrayList<T>();
		List<Pair<T>> copy = new ArrayList<Pair<T>>(list);
		while (!copy.isEmpty()) {
			Pair<T> max = copy.get(0);
			for (Pair<T> p : copy) {
				if (max.priority < p.priority)
					max = p;
			}
			result.add(max.object);
			copy.remove(max);
		}
		changePriority();
		return "" + result;
	}

	public void pour(FloatingFIFO<? extends T> fakeTest) {
		for (Pair<? extends T> s : fakeTest.list) {
			Pair<T> p = new Pair<T>();
			p.priority = s.priority;
			p.object = s.object;
			list.add(p);
		}
		changePriority();
	}

}
