package laboratorium05.zadanie2;

class Plus {
	public String toString() {
		return "+";
	}
}

class ProducePlusOrStar {
	public static Plus producePlus() {
		return new Plus();
	}

	public static Plus produceStar(){ return new Plus(){
		@Override
		public String toString() {
			return "*";
		}
	}; }
}

public class Anon {
	public static void main(String[] args) {
		System.out.println("" + ProducePlusOrStar.producePlus() + " "
				+ ProducePlusOrStar.produceStar());
	}
}
