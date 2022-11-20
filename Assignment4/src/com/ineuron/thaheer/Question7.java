package com.ineuron.thaheer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question7 {

	public static void main(String[] args) {
		
		String s= "INEURON";
		
		char[] arr=s.toCharArray();
		
		Map<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i])==false)
			{
				map.put(arr[i], 1);
			}
			else
			{
				int temp = map.get(arr[i]);
				int temp2=temp+1;
				map.put(arr[i],temp2);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println("String doesn't contain unique characters");
				System.exit(0);
			}
		}
		System.out.println("String contains all the unique characters");

	}

}
