package com.svkp.lambdaexpressions;
interface PrintNumber{
public void print(double String);
}
public class Squareroot {

	private static double squareroot;

	public static void main(String[] args) {
		squareroot=Math.pow(25, 0.5);
		PrintNumber p=n->System.out.println("square root is:"+ squareroot);
		p.print(squareroot);

	}

}
