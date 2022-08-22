package com.svkp.BankAccApplication;

import com.svkp.BankAccFramework.BankFactory;
import com.svkp.BankAccFramework.CurrentAcc;
import com.svkp.BankAccFramework.SavingAcc;

public class MMBankFactory implements BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accno, String accnam, float accBalance, boolean isSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno, String accname, float accBalance, float creditLimt) {
		// TODO Auto-generated method stub
		return null;
	}

}
