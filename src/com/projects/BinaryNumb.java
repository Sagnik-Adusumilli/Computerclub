package com.projects;

import java.util.Scanner;

public class BinaryNumb {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int limit = input.nextInt();
		int countRounded =0;
		for(int i=1;i<=limit;i++){
			if(isRound(getBinary(i))){
				countRounded++;
			}
		}
		System.out.println("There are "+ countRounded+ " round numbers less than or equal to "+ limit+".");
		
	}

	public static int[] getBinary(long number) {
		int[] binary = new int[31];
		long numb = number;
		int remainder = 2;
		int power = 1;
		while (remainder > 1) {
			while ((int) Math.pow(2, power) <= numb) {
				power++;
			}
			numb = numb - (int) Math.pow(2, power - 1);
			binary[power - 1] = 1;
			power = 1;
			if (numb == 1) {
				binary[0] = 1;
				remainder = 1;
			} else if (numb == 0) {
				remainder = 0;
			}
		}
		return binary;
	}

	private static boolean isRound(int[] binary) {
		int index = 0;
		int count0 = 0, count1 = 0;
		for (int i = binary.length-1; i >=0 ; i--) {
			if (binary[i] == 1) {
				index = i;
				break;
			}
		}
		int size =  index+1;
		for (int i = 0; i < size; i++) {
			if (binary[i] == 0) {
				count0++;
			} else {
				count1++;
			}
		}
		return count0 >= count1;
	}


}
