package com.svkp.number;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		System.out.println("Enter num:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		

	}

}
