package com.svkp.BankAccApplication;

import com.svkp.BankAccFramework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
public MMSavingAcc(int accno, String accname, float accbalance, boolean isSalary) {
		super(accno, accname, accbalance, isSalary);
		// TODO Auto-generated constructor stub
	}

public static final float accBalance=0;
public void withdraw(float charges) {
	System.out.println("Dear Customer,your withdraw charges are:"+charges);
}
@Override
public String toString() {
	return "MMSavingAcc []";
}

}
