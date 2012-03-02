package laboratorium03.zadanie3;

public class TheChickenOrTheEgg {
	int i=f();
	int j=g();
	static int k=h();
	static int l=ii();
	
	int f()
	{
		System.out.println("i="+i);
		return i;
	}
	
	int g()
	{
		System.out.println("j="+j);
		return j;
	}
	
	static int h()
	{
		System.out.println("k="+k);
		return k;
	}
	
	static int ii()
	{
		System.out.println("l="+l);
		return l;
	}
	
	static {
		new TheChickenOrTheEgg();
	}
	
	public static void main(String... args)
	{
	}
}
