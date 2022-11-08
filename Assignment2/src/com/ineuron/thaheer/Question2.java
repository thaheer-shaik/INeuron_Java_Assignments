package com.ineuron.thaheer;

import java.util.Arrays;
import java.util.Scanner;

class QuickSort
{
	public void quickSort(int[] arr, int low, int high)
	{
		if(low< high)
		{
			int part=partition(arr, low, high);
			
			quickSort(arr, low, part-1);
			
			quickSort(arr, part+1, high);
		}
	}

	private int partition(int[] arr, int low, int high) 
	{
		int pivot = arr[high];
		
		int i=low-1;
		
		for(int j = low; j < high; j++)
		{
			if(arr[j]<=pivot)
			{
				i++;
				
				int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;
		
		
	    return (i + 1);
	}
}

public class Question2 {

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
		
		
		QuickSort quickSort = new QuickSort();
		
		quickSort.quickSort(arr, 0, n-1);
		
		System.out.println("Sorted Array in ascending order using quick sort...");
		
		System.out.println(Arrays.toString(arr));
		
	}

}
