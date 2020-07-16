package bankaccountapp;

public class BankAccountApp {
    public static void main(String[] args) {

        Checking checking1 = new Checking("Deon Choi", "123456789", 1500);
        Savings savings1 = new Savings("Julia Waterstreet", "987654321", 2500);

        checking1.showInfo();
        savings1.showInfo();


        //Read a CSV File then create new accounts based on that data
    }
}
