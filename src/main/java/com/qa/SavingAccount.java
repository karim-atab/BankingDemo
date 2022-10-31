package com.qa;

public class SavingAccount extends BankAccount {
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate <= 0) throw new IllegalArgumentException("Interest rate must be positive.");
        else this.interestRate = interestRate;
    }

    private double interestRate;

    public SavingAccount(){}

    public SavingAccount(double balance, double minBalance, String accountHolderName, double interestRate){
        super(balance,minBalance,accountHolderName);
        this.interestRate = interestRate;
    }
    public void addInterest(){
        super.setBalance(super.getBalance()*(1+this.interestRate));
    }
}
