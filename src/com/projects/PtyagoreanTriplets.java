package com.projects;

public class PtyagoreanTriplets {
	public static void main(String[] args) {
		boolean[] hyp = new boolean[101];
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				for (int k = 1; k <= 100; k++) {
					if (hyp[k] == false && Math.pow(k, 2) == Math.pow(j, 2) + Math.pow(i, 2)) {
						System.out.println(i + " " + j + " " + k);
						hyp[k] = true;
					}
				}
			}
		}
	}

}
