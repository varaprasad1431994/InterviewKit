import java.util.Scanner;

public class FindLargestSmallestNumber {
	public static void main(String[] args) 
	{
				
		Scanner s = new Scanner(System.in);

		System.out.println("enter number of elements");

		int n = s.nextInt();

		int num[] = new int[n];

		System.out.println("enter elements");

		for (int i = 0; i < n; i++) {// for reading array
			num[i] = s.nextInt();

		}
		s.close();
		int min = num[0]; // assume first elements as smallest number
		int max = num[0]; // assume first elements as largest number

		for (int i = 1; i < num.length; i++) // iterate for loop from arrays 1st index (second element)
		{
			if (num[i] > max) {
				max = num[i];
			}
			if (num[i] < min) {
				min = num[i];
			}
		}

		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
	}
}
