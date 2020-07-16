package bankaccountapp;

public class Savings extends Account {
    //List properties specific to a savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    private double savingsInterestRate;

    //Constructor to initialize the savings account properties
    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        this.accountNumber = "2" + this.accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate(){
        this.savingsInterestRate = this.getBaseRate() - 0.25;
    }

    //List any methods specific to the savings account
    private void setSafetyDepositBox(){
        this.safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Savings Account");
        System.out.println("Your Savings Account Features: ");
        System.out.println("\tSafety Deposit Box ID: " + this.safetyDepositBoxID);
        System.out.println("\tSafety Deposit Box Key: " + this.safetyDepositBoxKey);
        System.out.println("\tInterest Rate: " + this.savingsInterestRate + "%");
    }

}
