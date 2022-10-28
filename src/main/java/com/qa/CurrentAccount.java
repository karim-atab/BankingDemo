package com.qa;

public class CurrentAccount extends BankAccount {
    public double getMaxWithdrawlLimit() {
        return maxWithdrawlLimit;
    }

    public void setMaxWithdrawlLimit(double maxWithdrawlLimit) {
        this.maxWithdrawlLimit = maxWithdrawlLimit;
    }

    private double maxWithdrawlLimit;

    public CurrentAccount(){
    }
    public CurrentAccount(double balance, double minBalance, String accountHolderName, double maxWithdrawlLimit){
        super(balance,minBalance,accountHolderName);
        this.maxWithdrawlLimit = maxWithdrawlLimit;
    }

    public void withdrawlCash(double amount){
        if(amount <= 0)  throw new IllegalArgumentException("The amount must be strictly positive");
        else if(super.getBalance() < (amount + this.getMinBalance())) throw new IllegalArgumentException("Insufficient funds");
        else if(amount > this.maxWithdrawlLimit) throw new IllegalArgumentException("The amount to withdrawl exceeds the limit");
        else{
            super.setBalance(super.getBalance()-amount);
        }
    }
    public String toString(){
        return super.toString() + " In addition, this current account has a withdrawl limit of " + this.maxWithdrawlLimit;
    }

}
