package day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String num = "121", reverse = "";
	    
	    int Length = num.length();

	    for (int i = (Length - 1); i >=0; --i) {
	      reverse = reverse + num.charAt(i);
	    }

	    if (num.toLowerCase().equals(reverse.toLowerCase())) {
	      System.out.println(num + " is a Palindrome number.");
	    }
	    else {
	      System.out.println(num + " is not a Palindrome number.");
	    }

	}

}
