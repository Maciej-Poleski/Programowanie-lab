package laboratorium03.zadanie2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Controlled {
	static Object lock = new Object();
	static AtomicInteger  count = new AtomicInteger(0);
	static long total=0;
	static AtomicBoolean gc=new AtomicBoolean(false);
	public Controlled()
	{
		if(gc.get())
		{
			System.out.println("Stworzono: "+count);
			synchronized(lock) {
				gc.set(false);
				count.set(0);
			}
		}
		count.incrementAndGet();
	}
	
	public void finalize()
	{
		synchronized(lock){
			gc.set(true);
			++total;
		}
	}
	
	public static int howManySoFar() {
		return count.get();
	}
	
	public static void main(String... args)
	{
		for(int i=0;i<1000000;++i)
			new Controlled();
		System.out.println("Koniec: "+total);
	}

}
