public class SavingsAccount {
    private int accNum;
    private static int nextAccNum = 0;
    private static double annualInterestRate = 0.0;
    private double savingsBalance;

    //Constructors
    public SavingsAccount(){
        ++nextAccNum;
        setAccNum(nextAccNum); //
    }

    //Getters and Setters
    public void setAccNum(int num){
        this.accNum = num;
    }

    public int getAccNum(){
        return this.accNum;
    }

    public void setAnnualInterestRate(double rate){
        SavingsAccount.annualInterestRate = rate;
    }

    public double getAnnualInterestRate(){
        return  SavingsAccount.annualInterestRate;
    }

    public void setSavingsBalance(double balance){
        this.savingsBalance = balance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    //Methods
    public void   calculateMonthlyInterest(){
        double monthlyInterest  = (getSavingsBalance() * SavingsAccount.annualInterestRate) / 12;
        this.savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newValue){
        SavingsAccount.annualInterestRate = newValue;
    }


}
