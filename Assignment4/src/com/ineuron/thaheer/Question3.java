package com.ineuron.thaheer;

public class Question3 {

	public static void main(String[] args) 
	{
		String s ="2552";
		String t="";
		
		for(int i=0;i<s.length();i++)
		{
			t=s.charAt(i)+t;
		}
		
		if(s.equals(t))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
