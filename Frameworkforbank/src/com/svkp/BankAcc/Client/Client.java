package com.svkp.BankAcc.Client;

import com.svkp.BankAccApplication.MMBankFactory;

public class Client {

	public static void main(String[] args) {
		MMBankFactory mmbfactory=new MMBankFactory();
		mmbfactory.getNewSavingAccount(0, null, 0, true);
mmbfactory.getNewCurrentAccount(123," sekhar", 38765,90000);
	}

}
