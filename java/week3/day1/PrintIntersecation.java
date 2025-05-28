package week3.day1;

public class PrintIntersecation 
{
	public static void main(String[] args) 
	 {
	 int num[] = {1,2,3,4,5};
	 int num1[]= {2,4};
	 
	 for (int i = 0; i < num.length; i++) 
	 {
	 for (int j = 0; j < num1.length; j++) 
	 {
	 if(num[i]==num1[j])
	 {
	 System.out.println(num[i]);
	 }
	 }
	 }
	 

	 }

}
