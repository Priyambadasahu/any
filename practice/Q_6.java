package com.kodnest.practice;

public class Q_6 
{
	//Reverse the each word in a given string
	public static void main(String[] args) 
	{
		String str="Ram is good";
		String []split=str.split(" ");
		for (int i = 0; i <=split.length-1; i++)
		{
			StringBuffer s=new StringBuffer(split[i]);
		   System.out.print(s.reverse()+" ");
			
		}

		
	}

}
