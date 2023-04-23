import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BankManager {
    public Bank bank;

    public BankManager() {
        this.bank = new Bank();

    }

    public void addBankAccount(String name, int balance)

    {
        if (bank.getBankAccounts() == null) {
            ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
            bank.setBankAccounts(bankAccounts);

        }
        BankAccount account = new BankAccount(name, balance);
        bank.getBankAccounts().add(account);
    }

    public void removeBankAccount(String name) {
        bank.getBankAccounts().removeIf(x -> x.getName() == name);
    }

    public float countAverage() {
        int balance = 0;
        int count = 0;
        Iterator<BankAccount> it = bank.getBankAccounts().iterator();
        while (it.hasNext()) {
            BankAccount ba = (BankAccount) it.next();
            balance += ba.getBalance();
            count++;

        }
        return balance / count;
    }

}
