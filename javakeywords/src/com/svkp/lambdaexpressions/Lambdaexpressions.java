package com.svkp.lambdaexpressions;
interface addinf{
	public void add(int a,int b);
}

public class Lambdaexpressions {

	public static void main(String[] args) {
		
addinf obj=(int a,int b)-> System.out.println(a+b);
obj.add(25, 12);
	}

}
