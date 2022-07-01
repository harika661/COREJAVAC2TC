package com.svkp.inheritance;
class Department
{
	int dept_id;
	String deptname;
}
class CSE extends Department
{
	int totalintake;
}
class MCA extends Department
{
	int totalintake;
}
public class multipleinheritance {

	public static void main(String[] args) {
		System.out.println("****CSE****");
		CSE ob=new CSE();
		MCA ob1=new MCA();
	    System.out.println(ob.dept_id=101);
		System.out.println("****MCA****");
		System.out.println(ob1.deptname="abc");
	}

}
