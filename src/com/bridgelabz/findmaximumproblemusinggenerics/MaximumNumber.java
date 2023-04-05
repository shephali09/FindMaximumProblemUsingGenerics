package com.bridgelabz.findmaximumproblemusinggenerics;

//Given 3 floats find the maximum numbers 

public class MaximumNumber {

	public void floatMax(double d, double e, double f) {
		Double max = d;
		if (Double.compare(e, max) > 0.0) {
			max = e;
		}
		if (Double.compare(f, max) > 0.0) {
			max = f;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		MaximumNumber maximumNumber = new MaximumNumber();
		maximumNumber.floatMax(2.2, 25.8, 100.08);
	}

}
