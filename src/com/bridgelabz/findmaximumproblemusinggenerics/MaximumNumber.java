package com.bridgelabz.findmaximumproblemusinggenerics;

//Given 3 integers find the maximum numbers 

public class MaximumNumber {

	public void maxNumber(int a, int b, int c) {

		int max = a;

		if (Integer.compare(b, max) > 0) {
			max = b;
		}
		if (Integer.compare(c, max) > 0) {
			max = c;
		}
		System.out.println("Maximum Number: " + max);

	}

	public static void main(String[] args) {

		MaximumNumber maximumNumber = new MaximumNumber();
		maximumNumber.maxNumber(20, 130, 10);
	}

}
