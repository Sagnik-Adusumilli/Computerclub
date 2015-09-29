package com.projects;

import java.util.Scanner;

public class ScoreRank2 {
	public static void main(String[] args) {
		int rank1 =0, rank2=0, rank3=0;
		Scanner input = new Scanner(System.in);
		int canidates = input.nextInt();
		                      // creating two arrays one to store the candidates (cList) and one to store the scores (scoreList)
		int[] scoreList = new int[canidates];
		int[] cList = new int[canidates];

		for (int i = 0; i < canidates; i++) {

			int traits = input.nextInt();
			int score = 1;

			for (int k = 0; k < traits; k++) {
				score = score * input.nextInt();
			}
                        // storing stores and candidates
			scoreList[i] = score;
			cList[i] = score;

		}

		for (int k = 0; k < canidates; k++) {
			 // sorting the scores from largest to smallest by switching places
			int max = scoreList[k];
			for (int l = k + 1; l < canidates; l++) {
				if (scoreList[l] > max) {
					int storedNumb = max;
					max = scoreList[l];
					scoreList[k] = max;
					scoreList[l] = storedNumb;
				}
			}
		}

		for (int i = 0; i < canidates; i++) {
			// finding top candidates by in the cList based on the scores
			if (scoreList[0] == cList[i]) {
				rank1 = i+1;
			}
			if (scoreList[1] == cList[i]) {
				rank2 = i+1;
			}
			if (scoreList[2] == cList[i]) {
				rank3 = i+1;
			}
		}
		   // printing out the candidates
		System.out.printf("%d\n%d\n%d",rank1,rank2,rank3);

	}
}
