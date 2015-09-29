package com.projects;

import java.util.Scanner;

public class NumbMatch {
	public static void main(String[] args) {
		new NumbMatch().checkNumb(6);
	}
		
	public boolean checkNumb(int number){
		int numb = number;
		int numbLength = String.valueOf(numb).length();
		for(int i = 1;i<=numbLength;i++){
			int dividor = (int) Math.pow(10, i);
			int remainder = numb%dividor;
			if(i==1){
				remainder = numb%dividor;
				if(remainder>4){
					System.out.println("invalid");
					return false;
				}
			} else if(i>1){
				dividor = (int) Math.pow(10,(i-1));
				if((remainder/dividor)>4){
					System.out.println("invalid");
					return false;
				}
			
			}
			
		}
		System.out.println("valid");
		return true;
	
	
}

}
