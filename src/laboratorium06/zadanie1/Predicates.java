package laboratorium06.zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Predicates {
	/**
	 * usuwa każdy obiekt o z kolekcji c spełniający p.test(o) 
	 * @param c
	 * @param p
	 */
    public static void remove(Collection c, Predicate p)
    {
    	ArrayList tmp=new ArrayList();
    	for(Object o : c)
    		if(p.test(o))
    			tmp.add(o);
    	c.removeAll(tmp);
    }
    
    /**
     * zostawia w kolekcji c każdy obiekt o spełniający p.test(o)
     * @param c
     * @param p
     */
    public static void retain(Collection c, Predicate p)
    {
    	ArrayList tmp=new ArrayList();
    	for(Object o : c)
    		if(p.test(o))
    			tmp.add(o);
    	c.retainAll(tmp);
    }
    
    /**
     * zwaraca liste wszystkich obiektów spełniających predykat p
     * @param c
     * @param p
     * @return
     */
    public static List collect(Collection c, Predicate p)
    {
    	ArrayList tmp=new ArrayList();
    	for(Object o : c)
    		if(p.test(o))
    			tmp.add(o);
    	return tmp;
    }
    
    /**
     * zwraca indeks pierwszego elementu listy l, dla którego predykat p jest spełniony
     * jeśli takiego nie ma, zwraca -1
     * @param l
     * @param p
     * @return
     */
    public static int find(List l, Predicate p)
    {
    	for(int i=0;i<l.size();++i)
    	{
    		if(p.test(l.get(i)))
    			return i;
    	}
    	return -1;
    }
    
    public static void main(String[] args) {
        Integer[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1000, 1001, 1002};
        List test = new ArrayList(Arrays.asList(temp));

        System.out.println(test);
        retain(test, new Even());
        System.out.println(test);
        remove(test, new Big());
        System.out.println(test);
        remove(test, new Even());
        System.out.println(test);
    }

}
