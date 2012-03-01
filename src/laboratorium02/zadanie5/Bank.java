package laboratorium02.zadanie5;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Maciej Poleski
 * Date: 01.03.12
 * Time: 18:49
 */
public class Bank {
    private List<ClientInfo> clients = new ArrayList<ClientInfo>();
    private List<Bankomat> bankomats = new ArrayList<Bankomat>();
    private int cash = 0;

    public void registerKlient(Klient klient) {
    }

    public void unregisterKlient(Klient klient) {
    }

    public long createAccount(Klient klient) {
        return 0;
    }

    public void removeAccount(long accountId) {
    }

    public long createInvestment(Klient klient) {
        return 0;
    }

    public void removeInvestment(long investmentId) {
    }

    public void setKlientPin(Klient klient, String pin) {
    }

    public void makeKlientCard(Klient klient, String pin) {
    }

    public void registerBankomat(Bankomat bankomat) {
    }

    public void unregisterBankomat(Bankomat bankomat) {
    }

    public void putMoney(Klient klient, int cash) {
    }

    public void getMoney(Klient klient, int cash) {
    }

    public void makeTransfer(Klient klient, long sourceAccountId, long destinationAccountId, int cash) {
    }

    public void moveToInvestment(Klient klient, long accountId, long investmentId, int cash) {
    }

    public void removeInvestment(Klient klient, long investmentId, long accountId) {
    }

    private class ClientInfo {
        private Klient klient;
        private boolean hasCard;
        private String pin;
        private List<Account> accounts = new ArrayList<Account>();
        private List<Investment> investments = new ArrayList<Investment>();
        private long id;
    }

    private class Account {
        private int cash;
        private long id;
    }

    private class Investment {
        private int cash;
        private long id;
    }
}
