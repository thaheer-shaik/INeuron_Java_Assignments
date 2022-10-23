package com.ineuron;

public class Question4 {
	
	public static void main(String[] args) 
	{
		int n=14;
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<=i-n/2 || j>=n+n/2-1-i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
