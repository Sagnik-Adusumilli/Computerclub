package com.projects;

import java.util.Scanner;

public class AssignPartners {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int studentsNumb = input.nextInt();
		if (studentsNumb % 2 != 0) {
			System.out.println("bad");
			return;
		}
		String[] group1 = new String[studentsNumb];
		String[] group2 = new String[studentsNumb];

		for (int i = 0; i < group1.length; i++) {
			group1[i] = input.next();
		}

		for (int i = 0; i < group2.length; i++) {
			group2[i] = input.next();
		}
		for (int i = 0; i < group1.length - 1; i++) {
			for (int j = i + 1; j < group1.length; j++) {
				if (group1[i].equals(group1[j]) || group2[i].equals(group2[j])) {
					System.out.println("bad");
					return;
				}
			}
		}
		for (int i = 0; i < group1.length; i++) {
			for (int j = i; j < group2.length; j++) {
				if (group1[i].equals(group2[j])&& i==j) {
					System.out.println(group1[i]+ " "+group2[i]);
					System.out.println("bad");
					return;
				} else if (group1[i].equals(group2[j])&& !group1[j].equals(group2[i]) ) {
//					System.out.println("group1[j] != group2[i]");
//					System.out.println(group1[j]+ " "+group2[i]);
					System.out.println("bad");
					return;
				}
			}
		}
		System.out.println("good");
	}
}


