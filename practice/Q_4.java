package com.kodnest.practice;
//count the number of word present in a given string
public class Q_4 {
	public static void main(String[] args) {
		String str= "helloWorld";
		String [] word= str.split("\\s+");
		int length = word.length;
		System.out.println("total word count = " + length);	
	}
}
