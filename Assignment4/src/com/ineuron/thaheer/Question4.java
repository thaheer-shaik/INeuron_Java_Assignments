package com.ineuron.thaheer;

public class Question4 {

	public static void main(String[] args) 
	{
		String s = "artuinbo%v*&1";
		
		int vc=0;
		int cc=0;
		int scc=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)>=90 || s.charAt(i)>=97 && s.charAt(i)<=122)
			{
				if(s.charAt(i)=='a' || s.charAt(i)=='e' ||
			       s.charAt(i)=='i' || s.charAt(i)=='o' || 
			       s.charAt(i)=='u' || s.charAt(i)=='A' ||
				   s.charAt(i)=='E' || s.charAt(i)=='I' || 
				   s.charAt(i)=='O' || s.charAt(i)=='U')
				{
					vc++;
				}
				else {
					cc++;
				}
			}
			else if(!(s.charAt(i)>=48 && s.charAt(i)>=57 && s.charAt(i)!=' '))
			{
				scc++;
			}
		}
		
		System.out.println(" Vowel count : "+vc+ " Consonant count : "+cc+" special character count : "+scc);
	}

}
