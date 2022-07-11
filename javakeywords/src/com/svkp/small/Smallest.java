package com.svkp.small;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a<b)
		{
			if(a<c)
			{
				System.out.println("Smallest number is:"+a);
			}
			else
			{
				System.out.println("Smallest number is:"+c);
			}
		}
			else
			{
				if(b<c)
				{
					System.out.println("Smallest number is:"+b);
			}
				else
				{
					System.out.println("Smallest number is:"+c);
				}
		}

	}

}
