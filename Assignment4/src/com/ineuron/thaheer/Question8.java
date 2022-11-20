package com.ineuron.thaheer;

import java.util.HashMap;
import java.util.Map;

public class Question8 {

	public static void main(String[] args) {
		
		String s= "INEURON_THAHEER_SHAIK";
		
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
		char maxkey=' ';
		int maxval=0;
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>maxval)
			{
				maxval=entry.getValue();
				maxkey=entry.getKey();
			}
		}
		System.out.println("Key "+maxkey+" occurred "+maxval+" times");

	}

}
