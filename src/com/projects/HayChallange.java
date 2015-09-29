package com.projects;

import java.util.Scanner;

public class HayChallange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int value = input.nextInt();
		int count = 0;
		int moves = 0;
		int[] stacks = new int[value];
		while (count < value) {
			stacks[count] = input.nextInt();
			count++;
		}
		for (int i = 0; i < stacks.length; i++) {
			sum += stacks[i];
		}
		int height = sum/value;
		for(int k = 0; k<stacks.length;k++){
		 moves += Math.abs(height-stacks[k]);
		}
		System.out.println(moves/2);
		
	}

}
