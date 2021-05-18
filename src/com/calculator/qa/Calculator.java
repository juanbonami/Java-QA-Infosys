package com.calculator.qa;

public class Calculator {
	
	public static void division(double num1, double num2) {
		if (num1 < num2) {
			System.out.println(num1 /  num2);
		}else {
			System.out.println("can not divide");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division(25,7);
	}

}
