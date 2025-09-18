public class lab3aq2 {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        double saver1Balance = saver1.getSavingsBalance();
        double saver2Balance = saver2.getSavingsBalance();

        System.out.println("Savings Accounts");
        System.out.println("Your savings balance saver1 is " + saver1Balance);
        System.out.println("Your savings balance saver2 is " + saver2Balance);

        //New Rate
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        saver1Balance = saver1.getSavingsBalance();
        saver2Balance = saver2.getSavingsBalance();

        System.out.println("After the new rate savings balance saver1 is " + saver1Balance);
        System.out.println("After the new rate savings balance saver 2 is " + saver2Balance);

         BankCustomer b1 = new BankCustomer("Damola", "Carlow");
        b1.addAccount(saver1);
        b1.addAccount(saver2);

        System.out.println("Bank Customer 1");
         System.out.println(b1.toString1());
        System.out.println("Corresponding balance for accounts: " + b1.balance(b1.getAccounts()));
    }
}
