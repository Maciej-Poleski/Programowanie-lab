package laboratorium07.zadanie2;

import java.lang.reflect.Modifier;

import laboratorium04.zadanie4.LogicalSet;

public class IAmWriter {
	public static void iWriteYouOut(Object o) {
		impl(o.getClass());
	}

	private static void impl(Class<?> c) {
		System.out.println(c.getName());
		Class<?> d = c.getSuperclass();
		if (d == null)
			return;
		if (!Modifier.isStatic(d.getModifiers()))
			impl(d);
	}

	public static void main(String... args) {
		iWriteYouOut(new LogicalSet());
	}
}
