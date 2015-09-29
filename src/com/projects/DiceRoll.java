package com.projects;

import java.util.Scanner;

public class DiceRoll {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int rolls = input.nextInt();
		int points1 = 100;
		int points2 = 100;
		
		int[] p1 = new int[rolls];
		int[] p2 = new int[rolls];
		
		for(int i=0;i<rolls;i++){
			p1[i] = input.nextInt();
			p2[i]= input.nextInt();
		}
		
		for(int i=0; i<rolls; i++){
			if(p1[i]>p2[i]){
				points2 = points2 - p1[i];
			}else if(p2[i]>p1[i]){
				points1 = points1 - p2[i];
			}
		}
		System.out.println(points1);
		System.out.println(points2);
		
	}

}
