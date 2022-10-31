package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingAccountTest {
    @Test
    public void test_deposit_cash_method_50(){
        //Arrange
        double amount = 50;
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
        double amount = 51;
        double expectedAmount = 51;
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

    @Test
    public void test_add_interest_saving_account(){
        //ARRANGE
        SavingAccount saver = new SavingAccount();
        saver.setBalance(100);
        saver.setInterestRate(0.125);
        double expectedValue = 112.5;

        // ACT
        saver.setAccountHolderName("John Snow");
        saver.addInterest();
        double actualValue = saver.getBalance();
        // ASSERT
        assertEquals(expectedValue, actualValue);
    }

}
