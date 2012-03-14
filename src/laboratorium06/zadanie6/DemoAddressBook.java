package laboratorium06.zadanie6;

class DemoAddressBook {
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		Name name = new Name("Pan Zakrecony");
		Number number = new Number("+1-555-555-555");
		addressBook.add(number, name);
		number = new Number("+1-555-515-555");
		addressBook.add(number, name);
		name = new Name("Pan Odkrecony");
		addressBook.add(number, name);
		System.out.println("Pan Zakrecony: "
				+ addressBook.numberOfPerson(new Name("Pan Zakrecony"))
						.toString());
		System.out.println("Pan Odkrecony: "
				+ addressBook.numberOfPerson(new Name("Pan Odkrecony"))
						.toString());
		number = new Number("+2-555-515-555");
		addressBook.add(number, name);
		System.out.println("Pan Odkrecony: "
				+ addressBook.numberOfPerson(new Name("Pan Odkrecony"))
						.toString());
		addressBook.del(new Number("+1-555-555-555"));
		System.out.println("Pan Zakrecony: "
				+ addressBook.numberOfPerson(new Name("Pan Zakrecony"))
						.toString());
		number = new Number("+3-555-515-555");
		name = new Name("Pan Zakrecony");
		addressBook.add(number, name);
		System.out.println("Pan Zakrecony: "
				+ addressBook.numberOfPerson(new Name("Pan Zakrecony"))
						.toString());
		addressBook.del(new Name("Pan Zakrecony"));
		System.out.println("Pan Zakrecony: "
				+ addressBook.numberOfPerson(new Name("Pan Zakrecony"))
						.toString());
		System.out.println(addressBook.find(new Number("+2-555-515-555")));
	}
}
