package com.svkp.lambdaexpressions;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Double>randomNumberSupplier=()->new Random(10).nextDouble();
		System.out.println(randomNumberSupplier.get());
		

	}

}
