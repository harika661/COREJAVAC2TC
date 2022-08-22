package com.svkp.BankAccFramework;

public class SavingAcc extends BankAcc{
public SavingAcc(int accno, String accname, float accbalance,boolean isSalary) {
		super(accno, accname, accbalance);
		this.isSalary=isSalary;
	}

public boolean isSalary;
public void withdraw(float charges) {
	
}
@Override
public String toString() {
	return "SavingAcc [isSalary=" + isSalary + "]";
}

}
