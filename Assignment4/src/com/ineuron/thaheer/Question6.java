package com.ineuron.thaheer;

public class Question6 {

	public static void main(String[] args) 
	{
		String s="the Quick brown fox jumps over a lazy dog";
		
		s=s.replace(" ","").toUpperCase();
				
		char[] str = s.toCharArray();
		
		int size=str.length;
		
		int[] arr = new int[26];
		
		int i=0;
		
		while(i!=size)
		{
			int index=str[i]-65;
			
			arr[index]=1;
			
			i++;
		}
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]!=1)
			{
				System.out.println("Non-Pangram");
				System.exit(0);
			}
		}
		System.out.println("Anagram");
	}

}
