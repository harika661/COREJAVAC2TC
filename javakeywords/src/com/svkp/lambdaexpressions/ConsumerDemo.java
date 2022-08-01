package com.svkp.lambdaexpressions;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer>multiplier=num->System.out.println(num*num);
		multiplier.accept(15);
		multiplier.accept(4);

	}

}
