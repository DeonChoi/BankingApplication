package bankaccountapp;

import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        String filePath = "/Users/deonchoi/Documents/GitHub/BankApplication/src/bankaccountapp/NewBankAccounts.csv";

        //Read a CSV File then create new accounts based on that data
        List<String[]> newAccountHolders = utilities.CSV.read(filePath);

        for (String[] accountHolder: newAccountHolders) {
            if (accountHolder[2].equals("Checking")) {
                Checking checking = new Checking(accountHolder[0], accountHolder[1], Double.parseDouble(accountHolder[3]));
                checking.showInfo();
                System.out.println("\n**************\n");
            } else if (accountHolder[2].equals("Savings")) {
                Savings savings = new Savings(accountHolder[0], accountHolder[1], Double.parseDouble(accountHolder[3]));
                savings .showInfo();
                System.out.println("\n**************\n");
            }
        }
    }
}
