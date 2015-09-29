package com.projects;

import java.util.Scanner;

public class CowMessages {
	static int mLoopyCows = 0;

	/**
	 * sample input 9 0 4 1 5 4 3 2 3 1
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int loopyCows = 0;
		int cowsNumb = input.nextInt();
		int[] cowList = new int[cowsNumb];

		for (int i = 0; i < cowsNumb; i++) {
			cowList[i] = input.nextInt();
		}
		mapLoop(cowList);
	}

	public static void mapLoop(int[] cowLoop) {
		int loopyCows = 0;
		int count = 0;
		while (count < cowLoop.length) {
			int pointer = cowLoop[count];
			int[] path = new int[cowLoop.length];
			for (int i = 0; i < path.length; i++) {
                if(pointer==0){
                	break;
                }
				path[i] = pointer;
				pointer = cowLoop[pointer - 1];

//				System.out.print(cowLoop[pointer-1] + " ");
				if (pointer > 0 && i>0) {
					if (checkLoop(path) == true){
						loopyCows = loopyCows + mLoopyCows;
						System.out.println(loopyCows);
						for(int j=0;j<path.length;j++){
							System.out.print(path[j]+" ");
						}
						return;
					}
				}
			}
			count++;
//			System.out.println("count "+count);
		}

	}

	public static boolean checkLoop(int[] path) {
		// System.out.println("entering loop");
		boolean loopy = false;
		for (int i = 0; i < path.length; i++) {
			for (int k = i + 1; k < path.length; k++) {
				if (path[i] != 0 && (path[i] == path[k])) {
					System.out.println("true");
					loopy = true;
					// System.out.println(loopy);
					mLoopyCows = k+1;
					System.out.println(mLoopyCows);
					return loopy;
				}
			}
		}
		return loopy;
	}
}
