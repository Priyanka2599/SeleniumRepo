package week3.day1;

public class OddIndexToUppercase 
{
	public static void main(String[] args) 
	 {
	 //Given input
	 String test = "changeme";
	 
	 //convert String to an array
	 char[] charArray = test.toCharArray();
	 //find the length of an character array
	 for (int i = 0; i < charArray.length; i++)
	 {
	 //if odd change to uppercase
	 if(i % 2 !=0)
	 {
	 charArray[i] = Character.toUpperCase(charArray[i]);
	 //System.out.println(charArray[i]);
	 }
	 }
	 // to create a string from an array of characters. create object of string
	 String withUppercase = new String(charArray);
	 System.out.println(withUppercase);
	 }

}
