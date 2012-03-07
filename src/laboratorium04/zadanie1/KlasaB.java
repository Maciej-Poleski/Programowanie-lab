package laboratorium04.zadanie1;

public class KlasaB extends KlasaA {
	
	  //public static void metodaPierwsza(int i) { 
	//	  System.out.println("B.1");
	 // }
	    public void metodaDruga(int i) { 
	    	System.out.println("B.2");
	    }
	   // public void metodaTrzecia(int i) { 
	   // 	System.out.println("B.3");
	  //  }
	    public static void metodaCzwarta(int i) { 
	    	System.out.println("B.4");
	    }



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KlasaA o=new KlasaB();
		o.test();
	}

}
