package positivenegative;

import java.util.Scanner;

public class PositiveAndNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		int number = sc.nextInt();
		if(number >=1 && number <=9)
		{
			System.out.println(number + " Is Positive number ");
		}
		else if(number == 0)
		{
			System.out.println(" Is zero");
		}
		else
		{
			System.out.println(number +" Is Negative Number");
		}
	}

}
