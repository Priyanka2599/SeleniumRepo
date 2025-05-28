package week3.day1;

import java.util.Arrays;

public class ReverseOddString 
{
	public static void main(String[] args) 
	 {
	 String test = "I am a software tester";
	 String rev="";
	 String[] split=test.split(" ");
	 System.out.println("Split "+Arrays.toString(split));
	 
	 for(int i = 0; i < split.length; i++) //0<4
	 {
	 //System.out.println(i);
	 if(i%2 == 0)
	 {
	 System.out.println(split[i]);
	 }
	 else
	 {
	 char[] split2 = split[i].toCharArray();
	 for(int j =split2.length-1; j>=0;j--)
	 {
	 rev = rev+split2[j];
	 }
	 System.out.println(rev);
	 rev = "";
	 }
	 }

	 }

}
