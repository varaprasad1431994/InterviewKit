import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindromenumeric {

	public static void main(String args[]) {
		/*
		 * This reads the input provided by user using keyboard
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = 0;
		try {
			// This method reads the number provided using keyboard
			num = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please provide Integer as Input");
		}
		// Closing Scanner after the use
		scan.close();
		Palindromenumeric object= new Palindromenumeric();
		boolean checkPalindrome=object.isPalindrome(num);
		if (checkPalindrome) {
			System.out.println("palindrome number ");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	
	public  boolean isPalindrome(int num) {
		
		int r, sum = 0, temp = 0;
		// Displaying the number
		System.out.println("The number entered by user: " + num);
		// It is the number variable to be checked for palindrome
		temp = num;
		while (num > 0) {
			r = num % 10; // getting remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (temp == sum) {
			return true;
		}
		else {
			return false;
	    }
	}
}
