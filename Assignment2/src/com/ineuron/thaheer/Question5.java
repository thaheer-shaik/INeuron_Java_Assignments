package com.ineuron.thaheer;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {

	public void selectionSort(int[] array) {
		int size = array.length;

		for (int step = 0; step < size - 1; step++) {
			int min_idx = step;

			for (int i = step + 1; i < size; i++) {
				if (array[i] < array[min_idx]) {
					min_idx = i;
				}
			}

			int temp = array[step];
			array[step] = array[min_idx];
			array[min_idx] = temp;
		}
	}
}

public class Question5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array");

		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the " + n + " values in an array");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("unsorted data...");
		System.out.println(Arrays.toString(arr));

		SelectionSort selectionSort = new SelectionSort();
		
		selectionSort.selectionSort(arr);
		
		System.out.println("Sorted Array in ascending order using selection sort...");
		
		System.out.println(Arrays.toString(arr));

	}

}
