package net.geeks.pa.SavingAccountTask;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.runners.Parameterized.*;

@RunWith(value = Parameterized.class)
public class BankAccountPositiveCheck {
    private BankAccount ba = BankAccount.getInstance();
    private double delta = 0.0;


    @Parameters(name = "{index} - balance = {0}, rate of interest = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0.0,0.0},{1.0,3.0},{100.0,3.0},{101.0,5.0},{1000.0,5.0},{1001.0,7.0},{1000000.0,7.0}
        });
    }

    @Parameter
    public double balance;

    @Parameter(value = 1)
    public double rateOfInterest;

    @Test
    public void balanceCheck() throws Exception, BankAccountException {
        ba.setBalance(balance);
        assertEquals(balance, ba.getBalance(), delta);
    }

    @Test
    public void rateOfInterestCheck() throws Exception, BankAccountException {
        ba.setBalance(balance);
        assertEquals(rateOfInterest, ba.getRateOfInterest(), delta);
    }
}