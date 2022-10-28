package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    public void test_deposit_cash_method_50(){
        //Arrange
        double amount = -50;
        double expectedAccount = 50;
        SavingAccount account = new SavingAccount();

        // Act
        account.depositCash(amount);
        double actualAccount = account.getBalance();

        //Assert
        assertEquals(expectedAccount, actualAccount);


    }
    @Test
    public void test_withdrawl_cash_method_50(){
        //Arrange
        double amount = 25;
        double expectedAccount = 50;
        SavingAccount account = new SavingAccount();
        account.setBalance(75);
        // Act
        account.withdrawlCash(amount);
        double actualAccount = account.getBalance();

        //Assert
        assertEquals(expectedAccount, actualAccount);


    }
    @Test
    public void test_set_minBalance(){
        //ARRANGE
        double amount = 40;
        double expectedAmount = 40;
        SavingAccount account = new SavingAccount();
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
        SavingAccount account = new SavingAccount();
        // ACT
        account.setAccountHolderName(name);
        String actualValue = account.getAccountHolderName();
        // ASSERT
        assertEquals(expectedValue, actualValue);
    }


}
