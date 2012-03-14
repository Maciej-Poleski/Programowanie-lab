package laboratorium06.zadanie4;

public class Fib {
	static void fib(int i) {
	    try {
	        if(i==-1)
	        	throw new IllegalArgumentException("IllegalValueException");
	        if(i>=0)
	        {
	        	if(i<2)
	        		throw new IllegalArgumentException("1");
	        	int result=0;
	        	try{
	        		fib((-(i-2))-10);
	        	} catch(RuntimeException e)
	        	{
	        		result+=Integer.parseInt(e.getMessage());
	        	}
	        	try{
	        		fib((-(i-1))-10);
	        	} catch(RuntimeException e)
	        	{
	        		result+=Integer.parseInt(e.getMessage());
	        	}
	        	throw new IllegalArgumentException(""+result);
	        }
	        else
	        {
	        	// internal
	        	int argument=i+10;
	        	argument=-argument;
	        	if(argument<2)
	        		throw new RuntimeException("1");
	        	int result=0;
	        	try{
	        		fib((-(argument-2))-10);
	        	} catch(RuntimeException e)
	        	{
	        		result+=Integer.parseInt(e.getMessage());
	        	}
	        	try{
	        		fib((-(argument-1))-10);
	        	} catch(RuntimeException e)
	        	{
	        		result+=Integer.parseInt(e.getMessage());
	        	}
	        	throw new RuntimeException(""+result);
	        }
	    }
	    catch(IllegalArgumentException e)
	    {
	    	System.out.println(e.getMessage());
	    }
	}
	static public void main(String [] args) {
	    for(int i = -1; i < 12; ++i) {
	        fib(i);
	    }
	}

}
