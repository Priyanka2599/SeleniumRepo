package week3.day1;

public class ReverseString 
{
	public static void main(String[] args) 
	 {
	 String str = "Welcome";
	 int count =0; //0 1 2 3 4 5 6
	 char[] charArray = str.toCharArray(); //"W", "E", "L", "C", "O", "M", "E"
	 for (int i = charArray.length - 1 ; i>=0; i--) //7-1=6; 6>=0; TRUE-> charArray[6];==> E; i--(6--)=5;
	 //i=5;5>=0;charArray[5];==>M; 
	 {
	 System.out.println(charArray[i]);
	 count++;
	 }
	 System.out.println("count " +count);
	 
	 }

}
