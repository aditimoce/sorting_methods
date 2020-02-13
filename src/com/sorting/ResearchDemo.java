package com.sorting;

import java.util.Random;
import java.util.Arrays;

public class ResearchDemo {

	public static void main(String[] args) {

		for (int arrayDim = 100; arrayDim <= 100; arrayDim += 10) {
			int[] myArray = new int[arrayDim];
			for (int i = 0; i < myArray.length; i++) {
				Random myRandomNumber = new Random();
				myArray[i] = myRandomNumber.nextInt(10000);
			}
			System.out.println(Arrays.toString(myArray));
		}
	}
}
