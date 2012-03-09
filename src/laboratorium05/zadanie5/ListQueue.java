package laboratorium05.zadanie5;

import java.util.Iterator;

public class ListQueue implements Queue {

	private static class Node {
		int value;
		Node next;
		Node back;

		public Node(int value) {
			this.value = value;
		}
	}

	Node headGuard = new Node(0);
	Node tailGuard = new Node(0);
	{
		headGuard.next = tailGuard;
		tailGuard.back = headGuard;
	}

	@Override
	public Queue add(int value) {
		Node node = new Node(value);
		node.next = tailGuard;
		node.back = tailGuard.back;
		node.next.back = node;
		node.back.next = node;
		return this;
	}

	@Override
	public int remove() {
		Node node = headGuard.next;
		node.next.back = node.back;
		node.back.next = node.next;
		return node.value;
	}

	@Override
	public boolean isEmpty() {
		return headGuard.next == tailGuard;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			Node i = headGuard.next;

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}

			@Override
			public Integer next() {
				int result = i.value;
				i = i.next;
				return result;
			}

			@Override
			public boolean hasNext() {
				return i != tailGuard;
			}
		};
	}

}
