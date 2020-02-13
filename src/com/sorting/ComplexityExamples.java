package com.sorting;

public class ComplexityExamples {

	public static void main(String[] args) {

		// int[] simpleArray = new int[10];
		int[][][] threeDimArray = new int[101][101][101];
		int counter = 0;

		// populate threeDimArray with values;
		// i + j + k

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < threeDimArray.length; i++) {
			for (int j = 0; j < threeDimArray[i].length; j++) {
				for (int k = 0; k < threeDimArray[i][j].length; k++) {
					threeDimArray[i][j][k] = i + j + k;
					counter++;
				}
			}
		}
		for (int i = 0; i < threeDimArray.length; i++) {
			for (int j = 0; j < threeDimArray[i].length; j++) {
				for (int k = 0; k < threeDimArray[i][j].length; k++) {
					System.out.print(threeDimArray[i][j][k] + " ");
				}
				System.out.println();
			}
		}

		long endTime = System.currentTimeMillis();

		System.out.println("Operations: " + counter);
		System.out.println("Start Time: " + startTime);
		System.out.println("End Time: " + endTime);
		System.out.println("Duration miliseconds: " + (endTime - startTime));
		System.out.println("Duration seconds: " + (endTime - startTime) / 1000);
	}
}