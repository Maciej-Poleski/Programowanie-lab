package laboratorium05.zadanie5;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayQueue implements Queue {
	int[] data = new int[1];
	int end = 0;
	int begin = 0;

	@Override
	public Queue add(int value) {
		if (data.length == end) {
			data = Arrays.copyOfRange(data, begin, (end - begin) * 2);
		}
		data[end++] = value;
		return this;
	}

	@Override
	public int remove() {
		return data[begin++];
	}

	@Override
	public boolean isEmpty() {
		return begin == end;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			int i = begin;

			@Override
			public boolean hasNext() {
				return i < end;
			}

			@Override
			public Integer next() {
				return data[i++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}

		};
	}

}
