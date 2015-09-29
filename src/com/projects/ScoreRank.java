package com.projects;

import java.util.Scanner;

public class ScoreRank {

	public static void main(String[] args) {
		// declaring variables
		int rank1 = 1, rank2 = 1, rank3 = 1;
		int c1 = 0, c2 = 0, c3 = 0;
		// taking input
		Scanner input = new Scanner(System.in);
		int canidates = input.nextInt();
		// first loop takes one candidate at a time to calculate the score
		for (int i = 1; i <= canidates; i++) {

			int traits = input.nextInt();
			int score = 1;
			// loops through the candidate's trait points to multiply them to the
			// score
			for (int k = 0; k < traits; k++) {
				score = score * input.nextInt();
			}
			// the conditions to determine the top three candidates
			if (i == 1) {
				// the first score is set as the default max
				rank1 = score;
				c1 = 1;
			}
			if (score > rank1) {
				// if the program finds a new max, rank1 becomes new max, rank2
				// becomes rank 3
				// same goes for the candidates c1, c2, c3
				rank3 = rank2;
				rank2 = rank1;
				rank1 = score;
				c3 = c2;
				c2 = c1;
				c1 = i;
			} else if (score > rank3) {
				// second case if score is less than than the greatest score but
				// is bigger than the least
				if (score > rank2) {
					// if score is greater than rank3 and rank2
					rank3 = rank2;
					rank2 = score;
					c3 = c2;
					c2 = i;

				} else {
					// if the number is less than numb2 but greater than numb3
					rank3 = score;
					c3 = i;
				}
			}

		}

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}
}
