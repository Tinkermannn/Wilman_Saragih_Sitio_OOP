public class Account {
    private int accountNumber;
    private double balance;
    private Bank bank;
    private AccountType accountType;

    public Account(int accountNumber, double balance, Bank bank, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
        this.accountType = accountType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit failed");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Withdraw failed");
        }
    }

    public void addInterest() {
        this.balance += this.balance * this.bank.getInterestRate()/100;
    }

    public void showDetail() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank: " + getBank().getCode());
        System.out.println("Account Type: " + accountType);
        System.out.println("");
    }
}
