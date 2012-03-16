package laboratorium07.zadanie4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Useless {
	public static <T> T newInstance(Class<T> kind) {
		for (Constructor<?> constructor : kind.getConstructors()) {
			ArrayList<Object> args = new ArrayList<Object>();
			try {
				for (Class<?> cc : constructor.getParameterTypes()) {
					args.add(null);
				}
				return (T) constructor.newInstance(args.toArray());
			} catch (Exception e) {

			}
		}
		throw new InstantiationError();
	}

	public static void main(String... args) {
		System.out.println(newInstance(Integer.class));
	}
}
