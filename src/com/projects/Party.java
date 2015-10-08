package com.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Party {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int partylist = input.nextInt();
		ArrayList<Integer> partyList = new ArrayList<>();
		for (int i = 1; i <= partylist; i++) {
			partyList.add(i);
		}
		int rounds = input.nextInt();
		int count = 0;
		ArrayList<Integer> removeList = new ArrayList<>();
		while (count < rounds) {
			int exefactor = input.nextInt();
			for (int i = 1; i <= partylist; i++) {
					if((exefactor*i)<= partyList.size()){
						int index =exefactor*i-1;
						int value = partyList.get(index);
						removeList.add(value);						
					}
				}
			partyList.removeAll(removeList);
			count++;
			}
		for(int i=0;i<partyList.size();i++){
			System.out.println(partyList.get(i));
		}
	}
}