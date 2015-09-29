package com.projects;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int gates = input.nextInt();
		int planes = input.nextInt();
		boolean[] docks = new boolean[gates];
		int count = 0;
		int total=0;
		while(count<planes){			boolean founddock= false;
			int attempt = input.nextInt();
			for(int i=attempt-1;i>=0;i--){
			System.out.println("docks[i] is "+docks[i]+" founddock: "+founddock);
				if(!docks[i]){
					docks[i]=true;
					total=total+1;
				int x = i+1;					System.out.println("found dock "+x);
				founddock= true;
				System.out.println(founddock);
					break;
				}
				if(i==0){
					System.out.println("total: "+total);
					System.exit(0);
				}
				
			}
			
			count++;
		}
		System.out.println(total);
	}
}
