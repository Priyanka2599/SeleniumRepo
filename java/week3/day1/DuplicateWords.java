package week3.day1;

import java.util.Arrays;
public class DuplicateWords
{
	public static void main(String[] args) 
	 {
	 String text = "We learn Java basics as part of java sessions in java week1";
	 int count =0;
	 
	 String[] splitArray= text.split(" ");
	 System.out.println("SplitArray= "+Arrays.toString(splitArray)); 
	 
	 
	 for (int i = 0; i < splitArray.length; i++) 
	 {
	 System.out.println(splitArray[i]);
	 for(int j = i+1; j < splitArray.length; j++ ) 
	 {
	 if(splitArray[i].equalsIgnoreCase(splitArray[j]))
	 {
	 splitArray[j]=" ";
	 count ++;
	 }
	 }
	 }
	 if(count>0)
	 {
	 System.out.println("the modified words array where duplicates have been replaced with empty strings");
	 }
	 /*for (int i = 0; i < splitArray.length; i++) 
	 {
	 System.out.println(splitArray[i]);
	 }*/
	 }

}
