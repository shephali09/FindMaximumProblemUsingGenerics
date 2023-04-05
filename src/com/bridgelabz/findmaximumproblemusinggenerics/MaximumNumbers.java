package com.bridgelabz.findmaximumproblemusinggenerics;
import java.lang.*;

/*Refactor all the 3 to One Generic Method and find the maximum
 * Ensure the Generic Type extends Comparable
-* Write parameter constructor */

public class MaximumNumbers<M extends Comparable<M>> {

	private M a;
	private M b;
	private M c;

	public MaximumNumbers(M a, M b, M c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public M max() {

		M max = a;

		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {

		MaximumNumbers<Integer> intmax = new MaximumNumbers<Integer>(50, 10, 30);
		MaximumNumbers<Double> doublemax = new MaximumNumbers<Double>(3.5, 1.5, 1.0);
		MaximumNumbers<String> stringmax = new MaximumNumbers<String>("apple", "orange", "grape");

		System.out.println(intmax.max());
		System.out.println(doublemax.max());
		System.out.println(stringmax.max());
	}
}
