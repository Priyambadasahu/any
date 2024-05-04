package com.kodnest.practice;
//Vowels, Digit , Special character, Consonant count
public class Q_1
{
	public static void main(String []args)
	{
		
		String input = "Write2javaproGrams4H.W!";
		int vowelscount= 0;
		int consonantscount =0;
		int numbercount = 0;
		int specialcharcount =0;
		// converting the string in to lowercase to case insensitive
		input = input.toLowerCase();
		// loop the sting for each char 
		for(int i=0;i<input.length();i++)
		{
			char currentchar = input.charAt(i); 

			if ((currentchar=='a')||(currentchar=='e')
					||(currentchar=='i')||(currentchar=='o')||
					(currentchar=='u'))
			{
				vowelscount++;
				
			}else if(!Character.isLetterOrDigit(currentchar))
			{
				specialcharcount++;
				
			}else if(Character.isLetter(currentchar))
			{
				consonantscount++;
				
			}else if(Character.isDigit(currentchar))
			{
				numbercount++;
			}
		}
		System.out.println("Total vowels ="+" "+vowelscount+" ");
		System.out.println("Total Consonants ="+" "+consonantscount+" ");
		System.out.println("Total Numbers ="+" "+numbercount+" ");
		System.out.println("Total Special Charecters ="+" "+specialcharcount+" ");
	}
}


