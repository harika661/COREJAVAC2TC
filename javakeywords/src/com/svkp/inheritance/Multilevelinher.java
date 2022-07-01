package com.svkp.inheritance;
class A
{
	void display()
	{
	System.out.println("Welcome to Inheritance concept");	
	}
}
class B extends A
{
	void show()
	{
	System.out.println("This is class B");
	}
}
class C extends B
{
	void print()
	{
		System.out.println("This is class C");	
	}
}
public class Multilevelinher {

	public static void main(String[] args) {
		C obj=new C();
		obj.display();
		obj.show();
		obj.print();
		

	}

}
