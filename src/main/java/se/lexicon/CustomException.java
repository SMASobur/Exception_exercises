package se.lexicon;

public class CustomException {
    public static void bankTest(){
        BankAccount account = new BankAccount();

        try {
            account.deposit(100);
            account.withdraw(110); // Will throw exception
        }catch (IllegalArgumentException e){
            System.err.println("Deposit failed: " + e.getMessage());
        }
        catch (InsufficientBalanceException e){
            System.out.println("Withdrawal failed: "+ e.getMessage());
        }
    }


}
