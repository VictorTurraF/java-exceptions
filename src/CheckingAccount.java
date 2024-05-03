public class CheckingAccount {
    public Currency balance;

    public CheckingAccount() {
        this.balance = new Currency(0);
    }

    public void deposit(Integer amountInCents) {
        this.balance.addCents(amountInCents);
    }

    public void withdraw(Integer amountInCents) throws InsufficientFoundsException {
        if (this.balance.getAmountInCents() < amountInCents)
            throw new InsufficientFoundsException(this.balance, new Currency(amountInCents));

        this.balance.subtractCents(amountInCents);
    }

}
