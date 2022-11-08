package com.ineuron.thaheer;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array 1 ");

		int n1 = sc.nextInt();

		int[] arr1 = new int[n1];

		System.out.println("Enter the " + n1 + " values in an array 1");

		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of Array 2 ");

		int n2 = sc.nextInt();

		int[] arr2 = new int[n2];

		System.out.println("Enter the " + n2 + " values in an array 2");

		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i] = sc.nextInt();
		}
		
		boolean value = isSubset(arr1,arr2,n1,n2);
		
		System.out.println(value);
	}
	
	private static boolean isSubset(int[] arr1, int[] arr2, int n1, int n2)
	{
		int i=0;
		int j=0;
		
		for (i=0; i< n2; i++)
		{
	        for (j = 0; j< n1; j++)
	        {
	           if(arr2[i] == arr1[j])
	           {
	        	   break;
	           }	             
	        }
	        if (j == n1)
	        {
	        	return false;
	        }           
	    }
	    return true;		
	}
}
