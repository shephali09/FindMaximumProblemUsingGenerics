package com.bridgelabz.findmaximumproblemusinggenerics;

/*Refactor all the 3 to One Generic Method and find the maximum
 * Ensure the Generic Type extends Comparable */
public class MaximumNumbers {

	public static <M extends Comparable<M>> M maximum(M a, M b, M c) {

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

		System.out.println(maximum(10, 20, 30));
		System.out.println(maximum(2.5, 5.5, 1.5));
		System.out.println(maximum("apple", "orange", "grape"));
	}
}
