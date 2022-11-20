package com.ineuron.thaheer;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {

		String s1 = "LISTEN";
		String s2 = "SILENT";

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		boolean result = areAnagram(a, b);

		if (result) 
		{
			System.out.println("Both Strings are Anagrams");
		} 
		else {
			System.out.println("Both Strings are Not Anagrams");
		}

	}

	private static boolean areAnagram(char[] a, char[] b) {
		
		if(a.length != b.length)
		{
			return false;
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				return false;
			}
		}

		return true;
	}

}
