package com.projects;

import java.awt.image.ConvolveOp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Barrile_code {
	
	 public static void convertCode (String line){
		 for (int i = 0; i < line.length() / 6; i++) {
				char[] charlist = new char[6];
				String letter = "";
				for (int j = 0; j < 6; j++) {

					if (i == 0) {
						charlist[j] = line.charAt(j);
					}else{
						charlist[j] = line.charAt((6*i)+j);
					}
					
					StringBuffer str = new StringBuffer();
					
					switch (String.valueOf(charlist)) {
					case "xooooo":
						letter = "a";
						break;
					case "xoxooo":
						letter = "b";
					case "xxoooo":
						letter = "c";
						break;
					case "xxoxoo":
						letter = "d";
						break;
					case "xooxoo":
						letter = "e";
						break;
					case "xxxooo":
						letter = "f";
						break;
					case "xxxxoo":
						letter = "g";
						break;
					case "xoxxoo":
						letter = "h";
						break;
					case "oxxooo":
						letter = "i";
						break;
					case "oxxxoo":
						letter = "j";
						break;
					case "xoooxo":
						letter = "k";
						break;
					case "xoxoxo":
						letter = "l";
						break;
					case "xxooxo":
						letter = "m";
						break;
					case "xxoxxo":
						letter = "n";
						break;
					case "xooxxo":
						letter = "o";
						break;
					case "xxxoxo":
						letter = "p";
						break;
					case "xxxxxo":
						letter = "q";
						break;
					case "xoxxxo":
						letter = "r";
						break;
					case "oxxoxo":
						letter = "s";
						break;
					case "oxxxxo":
						letter = "t";
						break;
					case "xoooxx":
						letter = "u";
						break;
					case "xoxoxx":
						letter = "v";
						break;
					case "oxxox":
						letter = "w";
						break;
					case "xxooxx":
						letter = "x";
						break;
					case "xxoxxx":
						letter = "y";
						break;
					case "xooxxx":
						System.out.println("z");
						letter = "z";
						break;

					}
				}
				System.out.print(letter);	
				}
		 
				
		 }
	public static void main(String[] args) {
		Scanner input;
		try {
			
			input = new Scanner(new File("C:/riju/rijuworkspace/Computerclub/src/com/projects/data.txt"));
			 while(input.hasNextLine()){
			    	String line = input.nextLine();
			    	convertCode(line);
			    }

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
   
		

	}

}
