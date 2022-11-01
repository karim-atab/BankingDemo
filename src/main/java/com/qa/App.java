package com.qa;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CurrentAccount current = new CurrentAccount(500,10,"Karim A",35);
        SavingAccount saving = new SavingAccount(500,10,"Karim A",0.1);
        CurrentAccount reneCurrent = new CurrentAccount(200, 0, "Rene Louis", 300);

        ArrayList<BankAccount> karims_accounts = new ArrayList();
        karims_accounts.add(current);
        karims_accounts.add(saving);

        for(BankAccount ba : karims_accounts){
            System.out.println(ba.toString());
        }
       BankAccount saving1 =  karims_accounts.get(1);
        if(saving1 instanceof SavingAccount){
            SavingAccount saving2 = (SavingAccount) saving1;
            saving2.addInterest();
        }
        for(BankAccount ba : karims_accounts){
            System.out.println(ba.toString());
        }
    }
}
