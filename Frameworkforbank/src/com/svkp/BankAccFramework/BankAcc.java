package com.svkp.BankAccFramework;

public class BankAcc {
public int accno;
public String accname;
public float accbalance;
public BankAcc(int accno, String accname, float accbalance) {
	super();
	this.accno = accno;
	this.accname = accname;
	this.accbalance = accbalance;
}
public void withdraw(float amount) {
	
}
public void deposit(float amount) {
	
}
@Override
public String toString() {
	return "BankAcc [accno=" + accno + ", accname=" + accname + ", accbalance=" + accbalance + "]";
}

}
