package laboratorium05.zadanie1;

public class One {
	public static class SubStatic { SubStatic(){ System.out.println("Substatic"); } }
    public class Sub { Sub(){ System.out.println("Sub"); } }
    One(){ System.out.println("One"); }
    public static void main(String[] args){
        new One().new Sub();
        new SubStatic();
    }

}
