package week3.day1;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		 // Defined two input strings
		 String str="stops";
		 String str1="potss";

		 //compare the length of the String
		 int length = str.length();
		 int length2 = str1.length();

		 //== represents here, as the length's are in integer
		 if(length == length2)
		 {
		 System.out.println("Given Strings matched");

		 //convert the str to Array
		 char[] charArray = str.toCharArray();
		 Arrays.sort(charArray);

		 char[] charArray2 = str1.toCharArray();
		 Arrays.sort(charArray2);
		 if(charArray == charArray2)
		 {
		 System.out.println("The given strings are Anagram");
		 }
		 else
		 {
		 System.out.println("The given strings are not an Anagram.");
		 }
		
		 }
	}
}

	
	 
