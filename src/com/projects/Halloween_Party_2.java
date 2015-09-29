package com.projects;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Halloween_Party_2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numb = input.nextInt();
		String[] guests = new String [numb];
		int count = 0;
		while (count < numb) {
			String value = input.next();
			 guests[count]=value;
//			System.out.println(guests[count]);
			count++;
		}
		

		for (int i = 0; i < guests.length; i++) {
			for(int j =0; j <i;j++){
				
			if (guests[i].equals(guests[j])) {
				System.out.println("not unique");
			}
			}
		}

	}

}
