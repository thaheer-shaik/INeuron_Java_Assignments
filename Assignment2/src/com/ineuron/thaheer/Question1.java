package com.ineuron.thaheer;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter the "+n+" values in an array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Array is having duplicate values "+arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("given Array doesn't have duplicate values");
		}
		
	}

}
