package com.svkp.demoabstract;
abstract class APtraffic_rules
{
	abstract void speedLimit();
	abstract void rashdriving();
	void display()
	{
		System.out.println("Traffic_rules");
	}
}
 public class Demoabstract extends APtraffic_rules{
 void speedLimit()
{
	System.out.println("The speed Limit is 80 km");
}
void rashdriving()
{
	System.out.println("Alert with voice message");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demoabstract obj=new Demoabstract();
obj. speedLimit();
obj.rashdriving();
	}

}
