package com.jose.parser;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		final Scanner in = new Scanner(System.in);
		final String stringNumber = in.nextLine();
		
		int total = 0;
		
		for(int i = 0; i < stringNumber.length(); i++){
			final char c = stringNumber.charAt(i);
			final int number = c - '0';
			total =  total + number * (int) Math.pow(10, stringNumber.length() - 1 - i);
		}
		
		System.out.println("The final number is: " + total);
		System.out.print("To prove it is a number, his value multiplied by 2 is: " + total*2);

	}

}
