public class IslamicAccount extends Account{
    private double mudhorobahRate;

    public IslamicAccount(int accountNumber, double balance, Bank bank, AccountType accountType, double mudhorobahRate){
        super(accountNumber, balance, bank, accountType);
        this.mudhorobahRate = mudhorobahRate;
    }

    public double getMudhorobahRate() {
        return mudhorobahRate;
    }

    public void addInterest() {
        double temp = getBalance() * mudhorobahRate/100;
        setBalance(getBalance() + temp);
    }
}
