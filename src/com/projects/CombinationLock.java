package com.projects;

import java.util.Scanner;

public class CombinationLock {
	public static void main(String[] args) {
		int count=0;
	Scanner input = new Scanner(System.in);
	int[] combo= new int[3];
		int digits= input.nextInt();
		
		int digit1 = digits/100;
         int digit2 = digits/10;
         int digit3 = digits%10;
         for (int i= 0; i<10; i ++){
    	 combo[0] = Math.abs(i-digit1);
    	 if (combo[0]<=3){
//    		 System.out.println(combo[0]);
    		 count++;
    	 }
    	 for (int j=0;j<10;j++){
    		 combo[1]= Math.abs(j-digit2);
    		 if (combo[1]+combo[0]<3){
    		 count++;
    		 }
    		for(int k=0; k<10; k++){
    			combo[2]= Math.abs(k-digit3);
    			if (combo[0]+combo[1]+combo[2]<=3){
    				count++;
    			}
    		}
    		
    	 }
     }

         System.out.println(count);
}
}
