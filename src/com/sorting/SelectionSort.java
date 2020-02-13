package com.sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {

		// Based on https://visualgo.net/bn/sorting implement SELECTION SORT
		// https://en.wikipedia.org/wiki/Selection_sort

		for (int arrayDim = 100; arrayDim <= 100; arrayDim += 10) {
			int[] array = new int[arrayDim];
			for (int i = 0; i < array.length; i++) {
				Random myRandomNumber = new Random();
				array[i] = myRandomNumber.nextInt(10000);
			}
			System.out.println(Arrays.toString(array));

//		int[] myArray = { 3, 44, 38, 5, 47, 15 };
			int minimum;

			for (int i = 0; i < array.length - 1; i++) {
				minimum = i;
				for (int j = i + 1; j < array.length; j++) {
					if (array[j] < array[minimum]) {
						minimum = j;

					}
				}

				int temp = array[i];
				array[i] = array[minimum];
				array[minimum] = temp;
				System.out.print(array[i] + ", ");
			}

		}
	}
}