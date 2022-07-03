package com.svkp.demoabstract;
abstract class parent
{
	void show()
	{
		System.out.println("This is a normal method");
	}
	abstract void show1();
}
class child extends parent
{
	void show1()
	{

		System.out.println("This is a abstract method");
	}
}
public class DemoAbstraction {

	public static void main(String[] args) {
		child obj=new child();
		//obj.show();
          obj.show1();
	}

}
