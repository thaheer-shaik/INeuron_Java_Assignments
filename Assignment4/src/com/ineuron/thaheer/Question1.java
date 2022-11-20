package com.ineuron.thaheer;

public class Question1 {

	public static void main(String[] args) 
	{
		String s = "aabbccdeffgghijj";
		String t="";
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			
			if(count ==1)
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t); //abcdefghij
	}

}
