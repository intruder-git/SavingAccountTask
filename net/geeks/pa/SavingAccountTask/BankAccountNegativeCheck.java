package net.geeks.pa.SavingAccountTask;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.runners.Parameterized.*;

@RunWith(value = Parameterized.class)
public class BankAccountNegativeCheck {
    private BankAccount ba = BankAccount.getInstance();

    @Parameters
    public static Iterable<? extends Object> data() {
        return Arrays.asList(-1.0, -0.001, -100000);
    }

    @Parameter
    public double balance;

    @Test(expected = BankAccountException.class)
    public void exceptionCheck() throws Exception, BankAccountException {
        ba.setBalance(balance);
    }

}