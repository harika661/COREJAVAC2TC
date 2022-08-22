package com.svkp.BankAccFramework;

public class CurrentAcc extends BankAcc{
public final float creditLimit;
	public CurrentAcc(int accno, String accname, float accbalance,float creditLimit) {
		super(accno, accname, accbalance);
		this.creditLimit=creditLimit;
	}
public void withdraw(float charges) {
	
}
@Override
public String toString() {
	return "CurrentAcc [creditLimit=" + creditLimit + "]";
}

}
