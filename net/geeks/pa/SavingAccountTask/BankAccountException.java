package net.geeks.pa.SavingAccountTask;

public class BankAccountException extends Throwable{
    private String message;

    BankAccountException (String s) {
        message = s;
    }

    @Override
    public String getMessage() {
        return "Application is terminate. Cause: " + message;
    }
}
