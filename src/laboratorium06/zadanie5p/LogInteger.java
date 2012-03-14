package laboratorium06.zadanie5p;

import java.io.IOException;
import java.util.Random;

public class LogInteger {
	private int value;
	private static Random server = new Random();

	public LogInteger() {
	}

	public LogInteger(int v) {
		value = v;
	}

	public void add(LogInteger a) throws IOException {
		if (server.nextInt() % 50 == 0)
			throw new IOException(); // próba komunikacji z serwerem
		value = value + a.value;
	}

	public void increseByOne() throws IOException {
		if (server.nextInt() % 50 == 0)
			throw new IOException(); // próba komunikacji z serwerem
		value = value + 1;
	}

	public boolean less(LogInteger a) throws IOException {
		if (server.nextInt() % 50 == 0)
			throw new IOException(); // próba komunikacji z serwerem
		return value < a.value;
	}

	@Override
	public String toString() {
		return "" + value;
	}

	public static void main(String... args) {
		LogInteger i = new LogInteger();
		LogInteger n = new LogInteger();
		w: while (true) {
			for (;;) {
				try {
					if (!i.less(new LogInteger(100)))
						break w;
					break;
				} catch (IOException e) {
				}
			}
			for (;;)
				try {
					n.add(i);
					break;
				} catch (IOException e) {
				}
			for (;;)
				try {
					i.increseByOne();
					break;
				} catch (IOException e) {
				}
		}
		System.out.println(n);

	}
}