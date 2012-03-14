package laboratorium06.zadanie3;

public class Singleton {
	  static boolean instance=false;
	  public Singleton() {
	    if(instance)
	    	throw new IllegalStateException();
	    instance=true;
	    System.out.println("Utworzono Singleton");
	  }
	}
