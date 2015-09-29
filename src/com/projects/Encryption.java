package com.projects;

import java.util.Scanner;

public class Encryption {
	public static void square(String word) {
		char[] charlist = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			charlist[i] = word.charAt(i);
		}

		for (int i = -1; i <= charlist.length; i++) {
			String line = "";
			if (i < 0) {
				line = "*";
				for (int j = 0; j < word.length(); j++) {
					line = line + " " + charlist[j] + " ";
				}
				line = line + "*";
				System.out.println(line);
			}
			if (i >= 0 && i < word.length()) {
				line = "" + charlist[word.length() - (i + 1)];
				for (int j = 0; j < word.length(); j++) {
					line = line + " * ";
				}
				line = line + charlist[i];
				System.out.println(line);
			}
			if (i == word.length()) {
				line = "*";
				for (int j = charlist.length - 1; j >= 0; j--) {
					line = line + " " + charlist[j] + " ";
				}
				line = line + "*";
				System.out.println(line);
			}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (true) {
			String words = input.next();
			square(words);
		}
	}

}
