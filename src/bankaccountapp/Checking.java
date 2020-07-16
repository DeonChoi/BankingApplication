package bankaccountapp;

public class Checking extends Account{
    //List properties specific to a checking account
    private long debitCardNumber;
    private int debitCardPin;
    private double checkingInterestRate;


    //Constructor to initialize the checking account properties
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        this.accountNumber = "1" + this.accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate(){
        this.checkingInterestRate = 0.15 * this.getBaseRate();
    }

    //List any methods specific to the checking account
    private void setDebitCard(){
        this.debitCardNumber = (long) (Math.random() * Math.pow(10, 12));
        this.debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo(){
        super.showInfo("Checking Account");
        System.out.println("Your Checkings Account Features: ");
        System.out.println("\tDebit Card Number: " + this.debitCardNumber);
        System.out.println("\tDebit Card PIN: " + this.debitCardPin);
        System.out.println("\tInterest Rate: " + this.checkingInterestRate + "%");
    }
}
