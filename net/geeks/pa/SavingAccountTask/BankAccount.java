package net.geeks.pa.SavingAccountTask;

public class BankAccount {
    private static BankAccount instance = null;
    private double balance = 0;
    private double rateOfInterest = 0;

    public double getBalance() {
        return balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    private void setRateOfInterest() {
        if (balance == 0) {
            rateOfInterest = 0;
        } else if ( balance > 0 && balance < 101) {
            rateOfInterest = 3;
        } else if (balance > 100 && balance < 1001) {
            rateOfInterest = 5;
        } else if (balance > 1000) {
            rateOfInterest = 7;
        }
    }

    public void setBalance(double balance) throws BankAccountException {
        if (balance >= 0) {
            this.balance = balance;
            setRateOfInterest();
        } else {
            throw new BankAccountException("setBalance: Incorrect balance");
        }
    }

    private BankAccount() {
        System.out.println("Bank Account Instance created");
    }

    public static BankAccount getInstance() {
        if (instance == null) {
            instance = new BankAccount();
        }
        return instance;
    }
}
