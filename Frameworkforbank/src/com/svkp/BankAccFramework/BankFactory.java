package com.svkp.BankAccFramework;

public interface BankFactory {
public abstract SavingAcc getNewSavingAccount(int accno,String accnam,float accBalance,boolean isSalary);
public abstract CurrentAcc getNewCurrentAccount(int accno,String accname,float accBalance,float creditLimit);
}
