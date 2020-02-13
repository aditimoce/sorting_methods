package com.sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {

		for (int arrayDim = 100; arrayDim <= 100; arrayDim += 10) {
			int[] array = new int[arrayDim];
			for (int i = 0; i < array.length; i++) {
				Random myRandomNumber = new Random();
				array[i] = myRandomNumber.nextInt(10000);
			}
			System.out.println(Arrays.toString(array));
		}

//		int[] myArray = { 3, 5, 7, 4, 6 };
//		int[] sortedArray = bubbleSort(myArray);
//		System.out.println(Arrays.toString(sortedArray));
	}

	static int[] bubbleSort(int[] array) {
		int[] arraySorted = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					arraySorted[i] = array[j];
					arraySorted[j] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}

		return arraySorted;

	}

}
