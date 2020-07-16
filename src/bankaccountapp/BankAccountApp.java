package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {

        //Data Structure to hold new account objects
        List<Account> accounts = new LinkedList<Account>();

        String filePath = "/Users/deonchoi/Documents/GitHub/BankApplication/src/bankaccountapp/NewBankAccounts.csv";

        //Read a CSV File then create new accounts based on that data
        List<String[]> newAccountHolders = utilities.CSV.read(filePath);

        for (String[] accountHolder: newAccountHolders) {
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble((accountHolder[3]));

            if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, ssn, initDeposit));

            } else if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, ssn, initDeposit));

            } else {
                System.out.println("Error reading account type!");
            }

        }

        for (Account acc: accounts) {
            acc.showInfo();
            System.out.println("\n**************\n");
        }

    }
}
