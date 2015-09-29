package com.projects;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numb = input.nextInt();
		boolean isPrime = false;
		while (!isPrime) {
			if(numb ==1){
				System.out.println(2);
				return;
			}
			isPrime = true;
			for (int i = 2; i < Math.sqrt(numb); i++) {
				
				if (numb % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (!isPrime) {
				numb++;
			} else {
				System.out.println(numb);
			}

		}

	}

}