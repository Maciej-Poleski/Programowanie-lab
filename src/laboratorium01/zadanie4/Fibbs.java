package laboratorium01.zadanie4;

/**
 * User: evil
 * Date: 24.02.12
 * Time: 19:10
 */
public class Fibbs {
    public static void main(String[] args) {
        for(int i=0; i<10; i++)
            System.out.println("rec: " + recursiveFibb(i) + "    nonrec: " + nonrecursiveFibb(i));
    }

    private static int nonrecursiveFibb(int n) {
        if(n<2)
            return n;
        int [] tab=new int[n+1];
        tab[0]=0;
        tab[1]=1;
        for(int i=2;i<=n;++i)
            tab[i]=tab[i-1]+tab[i-2];
        return tab[n];
    }

    private static int recursiveFibb(int i) {
        return i<2?i:recursiveFibb(i-1) +recursiveFibb(i-2);
    }
}
