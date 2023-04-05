package com.bridgelabz.findmaximumproblemusinggenerics;

//Given 3 strings find the maximum numbers 

public class MaximumNumber {

	public static void stringMax(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		MaximumNumber maximumNumber = new MaximumNumber();
		maximumNumber.stringMax("Apple", "Peach", "Banana");
	}

}
