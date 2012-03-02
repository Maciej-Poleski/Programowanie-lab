package laboratorium03.zadanie6;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Controlled {
	
	static int count=0;
	static List<WeakReference<Controlled>> references=new ArrayList<WeakReference<Controlled>>();
	
	Controlled()
	{
		++count;
		references.add(new WeakReference<Controlled>(this));
	}
    private static java.util.Random myGen = new java.util.Random();
    private final long myFavoriteNumber = myGen.nextLong();
    public static int howManySoFar() {
    	return count;
    }
    public static Controlled giveMeRandomOne() {
    	int rand=myGen.nextInt(references.size());
    	WeakReference<Controlled> temp=references.get(rand);
    	references.set(rand, references.get(references.size()-1));
    	references.remove(references.size()-1);
    	return temp.get();
    }
}
