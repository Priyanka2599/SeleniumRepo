package week3.day1;

import java.util.Arrays;
public class ArraysJava 
{
	public static void main(String[] args) 
	 {
	 /*
	 * Arrays --> collection of items of same datatype
	 * declarations: 1) Array Literals->based on data
	 * syn: datatype name = {values};
	 * 2) Array Instantations-> based on size
	 * syn: datatype obj[] = new datatype[size];
	 */
	 //array literals
	 int marks[]= {98, 87, 91, 78, 96}; //index starts from 0
	 //length of the array
	 int arraylength = marks.length;
	 System.out.println(arraylength); //length of the marks
	 //iterate all values
	 for (int i = 0; i < marks.length; i++) 
	 {
	 Arrays.sort(marks);
	 System.out.println(marks[i]);
	 }
	 
	 //sort an array
	 //Arrays.sort(marks); // 78,87,91,96,98
	 //System.out.println(marks); // will give the address of the marks.
	 
	 //max value
	 System.out.println(marks[arraylength-1]);
	 
	 //Array instantiation 
	 int marks1[] = new int[4]; //1,2,3,4
	 System.out.println(marks1[1]);
	 
	 marks1[0]=99;
	 marks1[1]=98;
	 System.out.println(marks1[3]); //0 //default value of int is 0
	 
	 String learners[] = new String[3]; 
	 learners[0]="Tom";
	 learners[1]="Jerry";
	 learners[2]="Priya";
	 System.out.println(learners[2]); //default value of String is null
	 

	 }


}
