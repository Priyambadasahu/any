package com.kodnest.practice;

public class Q_5 
{
	//Reverse the word
	public static void main(String[] args) 
	{
		String str="Ram is good";
		String [] split=str.split(" ");
		
		for (int i = split.length-1; i>=0; i--) {
			System.out.print(split[i]+" ");
			
		}
		
	}

}
















































