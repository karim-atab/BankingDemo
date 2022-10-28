package com.qa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankAccount {
    private double Balance = 0;
    private double MinBalance = 50;
    private String AccountHolderName;
    public BankAccount(){

    }
    public BankAccount(double balance, double minBalance, String accountHolderName) {
        Balance = balance;
        MinBalance = minBalance;
        AccountHolderName = accountHolderName;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getMinBalance() {
        return MinBalance;
    }

    public void setMinBalance(double minBalance) {
        if(minBalance < 50) throw new IllegalArgumentException("The minBalance must be greater than 50");
        else
            MinBalance = minBalance;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        String regexPattern = "^[a-zA-Z]+ [a-zA-Z]+";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher match = pattern.matcher(accountHolderName);
        if(!match.matches()) throw new IllegalArgumentException("Please enter firstname and lastname separated by a space. Only Alphanumeric Characters are allowed!");
        else AccountHolderName = accountHolderName;
    }
    public void depositCash(double amount){
        if(amount > 0){
            this.Balance += amount;
        }
    }
    public void withdrawlCash(double amount){
        if(amount <= 0)  throw new IllegalArgumentException("The amount must be strictly positive");
        else if(this.Balance < (amount + this.getMinBalance())) throw new IllegalArgumentException("Insufficient funds");
        else{
            this.Balance -= amount;
        }

//        if(amount >0 && this.Balance >= (amount + this.getMinBalance())){
//            this.Balance -= amount;
//        }
    }
}
