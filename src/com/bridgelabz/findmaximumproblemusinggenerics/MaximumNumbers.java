package com.bridgelabz.findmaximumproblemusinggenerics;

import java.lang.*;

/*Refactor all the 3 to One Generic Method and find the maximum
 * Ensure the Generic Type extends Comparable
-* Write parameter constructor */

public class MaximumNumbers<M extends Comparable<M>> {

	private M a;
	private M b;
	private M c;
	private M d;

	public MaximumNumbers(M a, M b, M c, M d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;

	}

	public M max() {

		M max = a;

		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		if (d.compareTo(max) > 0) {
			max = d;
		}
		return max;
	}

	public static <M> void printMax(M a, M b, M c, M d, M max) {
		System.out.println("a value is: " + a + ", b value is: " + b + ", c value is: " + c + ", d value is: " + d
				+ ", max of three value is: " + max);
	}

	public static void main(String[] args) {

		MaximumNumbers<Integer> intmax = new MaximumNumbers<Integer>(50, 10, 30, 180);
		MaximumNumbers<Double> doublemax = new MaximumNumbers<Double>(3.5, 1.5, 1.0, 100.08);
		MaximumNumbers<String> stringmax = new MaximumNumbers<String>("apple", "peach", "grape", "orange");

		System.out.println(intmax.max());
		System.out.println(doublemax.max());
		System.out.println(stringmax.max());
	}
}
