package com.ineuron.thaheer;

import java.util.Arrays;
import java.util.Scanner;

class MergeSort {
	public void mergeSort(int[] arr, int l, int r) {

		if (l < r) 
		{
			int m = (l + r) / 2;

			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	void merge(int arr[], int p, int q, int r) {

		int n1 = q - p + 1;
		int n2 = r - q;

		int L[] = new int[n1];
		int M[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[p + i];
		}
		for (int j = 0; j < n2; j++) {
			M[j] = arr[q + 1 + j];
		}

		int i, j, k;
		i = 0;
		j = 0;
		k = p;

		while (i < n1 && j < n2) {
			if (L[i] <= M[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = M[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = M[j];
			j++;
			k++;
		}
	}
}

public class Question4 {

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

		MergeSort mergeSort = new MergeSort();

		mergeSort.mergeSort(arr, 0, n - 1);

		System.out.println("Sorted Array in ascending order using Merge sort...");

		System.out.println(Arrays.toString(arr));
	}

}
