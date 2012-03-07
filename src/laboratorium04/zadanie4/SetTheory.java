package laboratorium04.zadanie4;

public interface SetTheory {
	SetTheory add(SetTheory X);

	SetTheory subtract(SetTheory X);

	SetTheory conjunct(SetTheory X);

	STIterator iterator();

}
