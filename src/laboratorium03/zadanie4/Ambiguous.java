package laboratorium03.zadanie4;

public class Ambiguous {
	static void test(String a) {}
	static void test(Integer a) {}
	
	public static void main(String[] args) {
        test(null);
    }
}
