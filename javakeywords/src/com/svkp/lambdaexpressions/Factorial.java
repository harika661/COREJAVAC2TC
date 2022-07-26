package com.svkp.lambdaexpressions;

import java.util.stream.LongStream;

public class Factorial {
private static long factorialStreams(long n) {
		
		return LongStream.rangeClosed(2, n).reduce(1,(long x,long y)->x*y);
}
	public static void main(String[] args) {
		long n=6;
		long fact;
		fact=factorialStreams(n);
System.out.println("The factorial using for lambda expression of "+n+" is "+fact);
	}

	
	}


