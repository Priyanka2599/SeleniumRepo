package day2;

public class IsPrime {

	public static void main(String[] args) {
		int prime = 13;
		
		int num = 0;

		// For Loop Iteration

		for (int i = 2; i <= prime / 2; i++) {
			if (prime % i == 0) {
				// when the above condition satisfies the num will set to 1
				num = 1;
				System.out.println(prime + " is not a prime number.");
				break;
			}
		}

		if (num == 0) 
		{
			System.out.println(prime + " is a prime number.");
		}

	}

}
