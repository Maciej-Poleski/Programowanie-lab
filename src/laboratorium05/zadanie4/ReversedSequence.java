package laboratorium05.zadanie4;

import java.util.Random;

public class ReversedSequence implements CharSequence {
	String string;
	public ReversedSequence(String string) {
		this.string=string;
	}

	public static void main(String[] args) {
		Random r = new Random();
		ReversedSequence s = new ReversedSequence(
				"Napisz klase implementujaca interfejs z java.lang.CharSequence");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		int start = r.nextInt(s.length() - 1);
		int end = r.nextInt(s.length() - 1 - start) + start;
		System.out.println(s.subSequence(start, end));
		System.out.println(s);
	}

	@Override
	public char charAt(int index) {
		return string.charAt(string.length()-index-1);
	}

	@Override
	public int length() {
		return string.length();
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return new ReversedSequence(string.subSequence(end+1, start+1).toString());
	}

}
