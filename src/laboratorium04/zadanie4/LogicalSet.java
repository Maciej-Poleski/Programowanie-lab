package laboratorium04.zadanie4;

import java.util.ArrayList;
import java.util.List;

public class LogicalSet implements SetTheory {

	List<Integer> content = new ArrayList<Integer>();

	public LogicalSet(int[] code) {
		for (int i : code)
			content.add(i);
	}

	public LogicalSet() {

	}

	private class Iterator implements STIterator {
		int i = 0;

		@Override
		public boolean hasNext() {
			return content.size() > i;
		}

		@Override
		public int next() {
			return content.get(i++);
		}

	}

	@Override
	public SetTheory add(SetTheory X) {
		LogicalSet result = new LogicalSet();
		STIterator i = iterator();
		while (i.hasNext()) {
			int next = i.next();
			if (!result.content.contains(next))
				result.content.add(next);
		}
		i = X.iterator();
		while (i.hasNext()) {
			int next = i.next();
			if (!result.content.contains(next))
				result.content.add(next);
		}
		return result;
	}

	@Override
	public SetTheory subtract(SetTheory X) {
		LogicalSet result = new LogicalSet();
		STIterator i = iterator();
		while (i.hasNext()) {
			int next = i.next();
			if (!result.content.contains(next))
				result.content.add(next);
		}
		i = X.iterator();
		while (i.hasNext()) {
			int next = i.next();
			if (result.content.contains(next))
				result.content.remove(Integer.valueOf(next));
		}
		return result;
	}

	@Override
	public SetTheory conjunct(SetTheory X) {
		LogicalSet result = new LogicalSet();
		LogicalSet temp=(LogicalSet) add(new LogicalSet());
		STIterator i = temp.iterator();
		while (i.hasNext()) {
			int next = i.next();
			STIterator j = X.iterator();
			boolean exist = false;
			while (j.hasNext()) {
				int nextJ = j.next();
				if (next == nextJ) {
					exist = true;
					break;
				}
			}
			if (exist)
				result.content.add(next);
		}
		return result;
	}

	@Override
	public STIterator iterator() {
		return new Iterator();
	}
	
	@Override
	public String toString() {
		StringBuilder result=new StringBuilder("{");
		STIterator i=iterator();
		while(i.hasNext())
		{
			result.append(""+i.next()+",");
		}
		result.replace(result.length()-1,result.length() , "}");
		return result.toString();
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 1 };
		int[] b = { 2, 3, 4, 5, 6, 6, 5, 4, 3, 2 };
		SetTheory setA = new LogicalSet(a);
		SetTheory setB = new LogicalSet(b);
		System.out.println(setA.subtract(setB).toString());
		System.out.println(setA.add(setB).toString());
		System.out.println(setA.conjunct(setB).toString());
	}

}
