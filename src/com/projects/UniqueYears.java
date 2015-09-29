package com.projects;

import java.util.Scanner;

public class UniqueYears {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		boolean uniqueYear = true;
		while (uniqueYear == true) {

			String yearString = String.valueOf(year);
			int[] digits = new int[yearString.length()];
			for (int i = 0; i < yearString.length(); i++) {
				
				digits[i] = (Integer.parseInt(String.valueOf(yearString.charAt(i))));
			}
			for (int i = digits.length - 1; i >= 1; i--) {
				if (uniqueYear == false) {
					break;
				}
				for (int k = i - 1; k >= 0; k--) {
					if (digits[k] == digits[i]) {
						uniqueYear = false;
						break;
					} else if (digits[k] != digits[i] && k == 0 && i == 1) {
						System.out.println(year);
						return;
					}
				}

			}
			uniqueYear = true;
			year++;
		}
	}
}
