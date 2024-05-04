package com.kodnest.practice;
//Palindrome Checker
public class Q_2 
{
	public static void main(String[] args) 
	{
		String str="wow";
		StringBuilder rev= new StringBuilder(str);
		String append = rev.reverse().toString();
		if(str.equals(append))
		{
			System.out.println(str+ " : is a pallindrome word");
		}else
		{
			System.out.println(str+ " : is not a pallindrome word");
		}

	}	
}
