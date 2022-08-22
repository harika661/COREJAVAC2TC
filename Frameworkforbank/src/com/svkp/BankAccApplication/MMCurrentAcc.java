package com.svkp.BankAccApplication;

import com.svkp.BankAccFramework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accno, String accname, float accbalance, float creditLimit) {
		super(accno, accname, accbalance, creditLimit);
		// TODO Auto-generated constructor stub
	}
public void withdraw(Float charges) {
	System.out.println("Dear customer,your withdraw charges is:"+""+charges+"with charges"+charges);
}
@Override
public String toString() {
	return "MMCurrentAcc []";
}

}
