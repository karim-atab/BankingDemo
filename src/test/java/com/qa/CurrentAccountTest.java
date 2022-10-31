package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentAccountTest {
    @Test
    public void test_withdrawl_cash_method_50(){
        //Arrange
        double amount = 24;
        double expectedAccount = 51;
        CurrentAccount account = new CurrentAccount();
        account.setBalance(75);
        account.setMaxWithdrawlLimit(25);
        // Act
        account.withdrawlCash(amount);
        double actualAccount = account.getBalance();

        //Assert
        assertEquals(expectedAccount, actualAccount);
    }
    @Test
    public void test_set_minBalance(){
        //ARRANGE
        double amount = 60;
        double expectedAmount = 60;
        CurrentAccount account = new CurrentAccount();
        //ACT
        account.setMinBalance(amount);
        double actualAmount = account.getMinBalance();
        // ASSERT
        assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void test_set_name(){
        //ARRANGE
        String name = "John Snow";
        String expectedValue = "John Snow";
        CurrentAccount account = new CurrentAccount();
        // ACT
        account.setAccountHolderName(name);
        String actualValue =  account.getAccountHolderName();
        // ASSERT
        assertEquals(expectedValue, actualValue);
    }
}
