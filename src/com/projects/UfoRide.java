/**
 * PROB NAME: ride
 */
package com.projects;

import java.util.Scanner;

public class UfoRide {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ufo = input.next();
		String group = input.next();

		char[] UFO = ufo.toCharArray();
		char[] Group = group.toCharArray();
		if(Number(UFO)==Number(Group)){
			System.out.println("GO");
		}else{
			System.out.println("STAY");
		}
	}
	
	public static int Number(char[] array){
		int number =1;
		int[]value = new int[array.length];
		for (int i = 0; i < array.length; i++) {
           			
	     value[i]= (int)array[i] - 64;
			  number =  number * (value[i]);
		}
		System.out.println(number);
		if (value.length == 1) {
			number = value[0];
		}
		return number;
			
	}
}

