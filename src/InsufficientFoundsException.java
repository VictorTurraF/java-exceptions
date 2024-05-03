public class InsufficientFoundsException extends Exception {
    public InsufficientFoundsException( Currency balance, Currency amountInCents ) {
        super("\nYou have not enough founds. \nYour balance is " + balance + " and you tried to withdraw " + amountInCents);
    }
}

