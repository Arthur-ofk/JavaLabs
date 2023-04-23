import java.util.ArrayList;
import java.util.List;

public class Bank {
    public String bankName;
    public String location;
    public ArrayList<BankAccount> bankAccounts;

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<BankAccount> getBankAccounts() {
        return this.bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

}
