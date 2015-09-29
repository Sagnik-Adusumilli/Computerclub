package com.projects;

import java.util.Scanner;

public class Halloween_Party_Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		String[] list = new String[value];
		String costume = "";
		for ( int j=0;j< value;j++) {
			 costume = input.next();
			list[j] = costume;
			checkCostume(list, costume);
		}
		
		if(!checkCostume(list, costume)){
			System.out.println("spooky");
		}
	}
	private static boolean checkCostume (String[]costumes, String costume){
		for(int i=0; i< costumes.length;i++){
			if(costume.equals(costumes[i])){
				System.out.println(costume);
				return true;
			}
		}
		return false;
	}
}
