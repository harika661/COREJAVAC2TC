package com.svkp.inheritance;
class parent
{
	final int a=20;
	final void display()
	{
		System.out.println("This is parent class");
	}
}
public class Singleinheritance extends parent{
	void show()
	{
		System.out.println("This is child class");
		super.display();
	}
public static void main(String[] args) { 
	int a=30;
		Singleinheritance obj=new Singleinheritance();
obj.display();

	}

}
