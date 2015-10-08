package com.projects;

import java.util.Scanner;

public class WinningChances {
	public static void main(String[] args) {
		int[] teams = new int[4];
		Scanner input = new Scanner(System.in);
		int favTeam = input.nextInt();
		int rounds = input.nextInt();
		int[][] matchRecord = new int[rounds][2];
		int[] roundsPlayed = new int[4];

		for (int i = 0; i < rounds; i++) {
			int pointer1 = input.nextInt();
			int pointer2 = input.nextInt();
			int score1 = input.nextInt();
			int score2 = input.nextInt();
			roundsPlayed[pointer1 - 1] += 1;
			roundsPlayed[pointer2 - 1] += 1;

			if (score1 > score2) {
				teams[pointer1 - 1] += 3;
				matchRecord[i][0] = pointer1 - 1;
				matchRecord[i][1] = pointer2 - 1;
			} else if (score1 == score2) {
				teams[pointer1 - 1] += 1;
				teams[pointer2 - 1] += 1;
				matchRecord[i][0] = pointer1 - 1;
				matchRecord[i][1] = pointer2 - 1;
			} else {
				teams[pointer2 - 1] += 3;
				matchRecord[i][1] = pointer2 - 1;
				matchRecord[i][0] = pointer1 - 1;
			}
		}

		 for(int i =0;i<roundsPlayed.length;i++){
		 System.out.print(roundsPlayed[i]+" ");
		 }

		int favMax = (3 * (3 - roundsPlayed[favTeam - 1])) + teams[favTeam - 1];
		int chances = 0;
		int localMax = 0;
		for(int i =0;i<rounds;i++){
			if((i+1)!=favTeam){
				if(teams[i]>favMax){
					System.out.println(0);
					return;
				}else{
				}
			}
		}
	}
}
