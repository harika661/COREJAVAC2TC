package com.svkp.lambdaexpressions;
interface Addition{
	public int operate(int num1,int num2);
}
public class OperatorDemo2 {

	public static void main(String[] args) {
		Addition op=(num1,num2)->num1+num2;
		int sum=op.operate(10, 20);
		System.out.println("sum:"+sum);

	}

}
