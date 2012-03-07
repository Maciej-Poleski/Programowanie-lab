package laboratorium04.zadanie2;

public final class Singleton {
	private static Singleton instance=new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance()
	{
		return instance;
	}
}
