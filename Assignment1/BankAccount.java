class BankAccount {
    protected String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double calculateInterest() {
        return 0;
    }

    public void displayAccountInfo() {
        System.out.println("Bank Account - Account No: " + accountNumber);
    }
}

class SavingsAccount extends BankAccount {
    private double balance;
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber);
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public void displayAccountInfo() {
        System.out.println("Savings Account - Account No: " + accountNumber + ", Balance: " + balance +
                ", Interest: " + calculateInterest());
    }
}

class CurrentAccount extends BankAccount {
    private double balance;
    private double overdraftLimit;
    private double interestRate;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit, double interestRate) {
        super(accountNumber);
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public void displayOverdraftAmount() {
        System.out.println("Overdraft Limit for Account " + accountNumber + ": " + overdraftLimit);
    }

    public void displayAccountInfo() {
        System.out.println("Current Account - Account No: " + accountNumber + ", Balance: " + balance +
                ", Interest: " + calculateInterest());
        displayOverdraftAmount();
    }
}

class AccountManager {
    private BankAccount[] accounts;
    private int count;

    public AccountManager(int capacity) {
        accounts = new BankAccount[capacity];
        count = 0;
    }

    public void addAccount(BankAccount account) {
        if (count < accounts.length) {
            accounts[count++] = account;
            System.out.println("Account added: " + account.getAccountNumber());
        } else {
            System.out.println("Cannot add more accounts. Capacity full.");
        }
    }

    public void verifyAccount(String accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                System.out.println("Account " + accountNumber + " exists.");
                return;
            }
        }
        System.out.println("Account " + accountNumber + " does not exist.");
    }

    public void displayAllAccounts() {
        if (count == 0) {
            System.out.println("No accounts found.");
        } else {
            for (int i = 0; i < count; i++) {
                accounts[i].displayAccountInfo();
                System.out.println();
            }
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager(10); // fixed capacity

        SavingsAccount sa = new SavingsAccount("SA001", 10000, 4.5);
        CurrentAccount ca = new CurrentAccount("CA001", 15000, 5000, 2.0);

        manager.addAccount(sa);
        manager.addAccount(ca);

        manager.verifyAccount("SA001");
        manager.verifyAccount("CA002");

        System.out.println("\nAll Accounts:");
        manager.displayAllAccounts();
    }
}
