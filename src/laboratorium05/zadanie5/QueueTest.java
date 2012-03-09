package laboratorium05.zadanie5;

public class QueueTest {
	public static void main(String args[]) {
		Queue q1 = new ArrayQueue();
		Queue q2 = new ListQueue();
		q1.add(5).add(7).add(15).add(-3).add(100);
		for (int i : q1)
			System.out.print(i + " ");
		System.out.println();
		while (!q1.isEmpty())
			System.out.print(q1.remove() + " ");
		System.out.println();
		q2.add(5).add(7).add(15).add(-3).add(100);
		for (int i : q2)
			System.out.print(i + " ");
		System.out.println();
		while (!q2.isEmpty())
			System.out.print(q2.remove() + " ");
		System.out.println();
	}

}
