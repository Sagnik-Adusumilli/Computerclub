package com.projects;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Party {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int partylist = input.nextInt();
	Set<Integer> partynumb = new TreeSet<>();
		for (int i = 1; i <= partylist; i++) {
			partynumb.add(i);
		}
		System.out.println(partynumb.size());
		int rounds = input.nextInt();
		int count = 0;
		while (count < rounds) {
			int exefactor = input.nextInt();
			for (int i = 1; i <= partylist; i++) {
				System.out.println("i="+i);
				if (i % exefactor == 0) {
				partynumb.remove(i);
				}
			}
			System.out.println("********************");
			count++;
		}

		System.out.println(partynumb.toString());
		System.out.println("you can't break this algorithm");
	}
}
