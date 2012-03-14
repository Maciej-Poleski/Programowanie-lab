package laboratorium06.zadanie3a;

public class SingletonPrime {
	private static long tryCount=0L;
	
	public SingletonPrime() {
		++tryCount;
		if(!canInstantiate())
			throw new InstantiationError();
	}
	
	private static boolean canInstantiate()
	{
		if(tryCount<2)
			return false;
		for(long i=2;i<tryCount;++i)
		{
			if(tryCount%i==0)
				return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "I'm lonely Bond "+tryCount;
	}
}
