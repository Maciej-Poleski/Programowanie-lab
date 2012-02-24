package laboratorium01.zadanie6;

/**
 * User: evil
 * Date: 24.02.12
 * Time: 20:58
 */
public class FibLong {
    private static long recursiveFibb(int i) {
        return i<2?i:recursiveFibb(i-1) +recursiveFibb(i-2);
    }

    public static void main(String... args)
    {
        for(int i=0;i<50;i++)
        {
            System.out.println(recursiveFibb(i));
        }
    }
}
