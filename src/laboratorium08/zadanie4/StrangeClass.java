package laboratorium08.zadanie4;

public class StrangeClass<T extends StrangeClass<S, T>, S extends StrangeClass<T, S>> {
	public static <T extends StrangeClass<S, T>, S extends StrangeClass<T, S>> void test(
			StrangeClass<T, S> i) {
		if (i == null)
			throw new RuntimeException("NOT ACCEPTABLE");
		System.out.println("OK");
	};
	
	public static void main(String... args)
	{
		test(new Test());
	}
	
	static class Test extends StrangeClass<Test, Test> {}
}
