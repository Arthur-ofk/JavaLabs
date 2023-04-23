import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BankManager bm = new BankManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("choose operation");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    String name = sc.next();
                    int balance = sc.nextInt();
                    bm.addBankAccount(name, balance);
                    System.out.println(bm.countAverage());
                    break;
                case 2:
                    var list = bm.bank.getBankAccounts();
                    for (BankAccount item : list) {
                        System.out.println(item.getName());
                    }
                    String dname = sc.next();
                    bm.removeBankAccount(dname);
                default:
                    break;
            }
        }
    }
}
