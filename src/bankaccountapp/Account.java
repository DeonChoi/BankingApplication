package bankaccountapp;

public abstract class Account implements IBaseRate{
    //List common properties for savings and checking accounts
    private String name;
    private String ssn;
    private double balance;

    private static int unique5Digit = 10001;

    protected String accountNumber;
    protected double rate;


    //Constructor to set base properties and initialize the account
    public Account(String name, String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        this.balance = initDeposit;
        this.accountNumber = setAccountNumber();
        this.unique5Digit++;
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoSSN = this.ssn.substring(this.ssn.length()-2);
        String random3Digit = "";
        for (int i=0; i<3; i++){
            random3Digit += (int) Math.floor(Math.random() * 10);
        }
        this.accountNumber = lastTwoSSN + this.unique5Digit + random3Digit;
        return this.accountNumber;
    }

    public void compound() {
        double accruedInterest = this.balance * (this.rate/100);
        System.out.println("Accrued Interest: $" + accruedInterest);
        this.balance += accruedInterest;
        printBalance();
    }

    //List common methods
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Depositing $" + depositAmount);
        printBalance();
    }
    public void withdraw(double withdrawAmount){
        this.balance -= withdrawAmount;
        System.out.println("Withdrawing $" + withdrawAmount);
        printBalance();
    }
    public void transfer(String transferToAccount, double transferAmount){
        this.balance -= transferAmount;
        System.out.println("Transferring $" + transferAmount + " to " + transferToAccount);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now $" + this.balance);
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("SSN: " + ssn);
        System.out.println("Balance: $" + this.balance);
    }
}
