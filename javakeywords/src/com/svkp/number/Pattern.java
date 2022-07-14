package com.svkp.number;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) { 
	int i,j,n;
	System.out.println("Input number of n:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
			System.out.print(i);
		System.out.println("");
	}
}
}