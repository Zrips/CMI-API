package com.Zrips.CMI.Containers;

public class CMINumber {

    public static double sum(double number1, double number2) {
	return sum(number1, number2, 2);
    }

    public static double sum(double number1, double number2, int precision) {
	double decimals = (long) Math.pow(10, precision);
	return ((long) (number1 * decimals) + (long) (number2 * decimals)) / decimals;
    }

}
