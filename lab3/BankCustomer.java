class BankCustomer{
    private String name;
    private String address;
    private SavingsAccount accounts[] = new SavingsAccount[3];
    private int noOfAccs = 0;

    //Constructor
    public BankCustomer(String newName, String newAddress) {
        this.name = newName;
        this.address = newAddress;
    }

    //Getters and Setters
    public void setName(String custName){
        this.name = custName;
    }

    public void setAddress(String custAddress){
        this.address = custAddress;
    }

    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }

    public SavingsAccount[] getAccounts(){
        return accounts;
    }

    public void setAccounts(SavingsAccount[] acc){
        this.accounts = acc;
    }

    public void setNoOfAccs(int no){
        this.noOfAccs = no;
    }

    public int getNoOfAccs(){
        return this.noOfAccs;
    }
//Methods
    public void addAccount(SavingsAccount acc){
        if(getNoOfAccs() <= 2){
            accounts[getNoOfAccs() + 1] = acc;
            setNoOfAccs(getNoOfAccs() + 1);
        }
        else{
            System.out.println("You have reached the limit of three savings account");
        }
    }

    public double balance(SavingsAccount[] arr){
        double balance = 0;
        for(SavingsAccount sav : arr){
            if(sav != null){
                balance += sav.getSavingsBalance();
            }
        }
        return balance;
    }
}