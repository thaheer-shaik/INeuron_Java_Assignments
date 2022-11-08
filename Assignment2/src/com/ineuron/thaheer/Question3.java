package com.ineuron.thaheer;

import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
	public void bubbleSort(int arr[]) {
		
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) 
		{
			for (int j = 0; j < n - i - 1; j++) 
			{	 
				if (arr[j] > arr[j + 1]) 
				{
					int temp = arr[j];					
					arr[j] = arr[j + 1];					
					arr[j + 1] = temp;
				}
			}
		}
	}
}

public class Question3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array");

		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter the " + n + " values in an array");

		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("unsorted data...");
		System.out.println(Arrays.toString(arr));
		
		BubbleSort bubbleSort = new BubbleSort();
		
		bubbleSort.bubbleSort(arr);
		
		System.out.println("Sorted Array in ascending order using bubble sort...");
		
		System.out.println(Arrays.toString(arr));
	}

}
