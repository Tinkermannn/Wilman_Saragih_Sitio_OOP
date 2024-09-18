public class ConventionalAccount extends Account {
    private double credit;
    private double creditInterestRate;

    public ConventionalAccount(int accountNumber, double balance, Bank bank, AccountType accountType, double creditInterestRate) {
        super(accountNumber, balance, bank, accountType);
        this.credit = 0;
        this.creditInterestRate =creditInterestRate;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void payCredit() {
        if (getBalance() > credit) {
            setBalance(getBalance() - credit);
            setCredit(0);
        } else {
            System.out.println("Balance tidak cukup");
        }
    }

    public void addCredit(double amount) {
        if (amount > 0) {
            setCredit(getCredit() + (amount * creditInterestRate/100));
        } else {
            System.out.println("Balance tifdak cukup");
        }
    }

    public void addCredit(double amount,  double discountRate) {
        if (amount < 0) {
            System.out.println("Error");
        } else {
            double tempCredit = (amount * creditInterestRate/100) - (amount * discountRate/100);
            setCredit(getCredit() + (amount * creditInterestRate/100));
        }
    }

    public void showDetail() {
        super.showDetail();
        System.out.println("Credit: " + this.credit);
        System.out.println("Credit Rate: " + creditInterestRate);
    }
}
