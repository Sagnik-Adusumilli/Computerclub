package com.projects;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
			
			 System.out.println("how many anetnas");
			 int antena = input.nextInt();
			 System.out.println("how many eyes");
			 int  eyes = input.nextInt();
			 if(antena>3  && eyes<=4){
				 System.out.println("TroyMartian");
			 } else if(antena<=6&& eyes>=2){
				 System.out.println("VladSaturnian");
			 }else if(antena<=2&&eyes<=3){
				 System.out.println("GraemeMercurian,");
			 }
			 
			 
		 
			
		}
		
		
	

}

