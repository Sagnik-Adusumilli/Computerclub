package com.projects;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		boolean isPrime = false;
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		while (isPrime == false) {
			double root = Math.sqrt(number);
			if (number == 2)
				isPrime = true;
				if (number % 2 != 0 && number % 3 != 0 && root % 1 != 0) {
					isPrime = true;
					System.out.println(number);
					return;
				}
				number++;
		}
	}

}
