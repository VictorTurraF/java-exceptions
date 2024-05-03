public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();

        checkingAccount.deposit(10000);

        try {
            checkingAccount.withdraw(10004);
        } catch (InsufficientFoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Your balance is: " + checkingAccount.balance);
    }
}