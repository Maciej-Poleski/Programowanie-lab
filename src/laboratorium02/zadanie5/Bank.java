package laboratorium02.zadanie5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
	static class Client
	{
		String password;
		String pin;
		boolean hasCard;
	}
	Map<Klient,Client> clientInformations=new HashMap<Klient, Bank.Client>();
	Map<Card,Client> cardInformations;
	int cash;
	List<Bankomat> terminals;
	
	
}
