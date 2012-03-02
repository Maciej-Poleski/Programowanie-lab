package laboratorium03.zadanie1;

public class Cyclic {
	public Cyclic(int a) {
		this('a');
	}
	
	public Cyclic(char b)
	{
		this(1);
	}
	
	public static void main(String... args)
	{
		new Cyclic(1);
	}
}
