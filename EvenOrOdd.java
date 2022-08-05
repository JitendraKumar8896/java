package days;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to check even or odd:");
		int num = sc.nextInt();
		switch(num%2)
		{
		case 0:
			System.out.println("Its Even Number:" +num);
			break;
			
		case 1:
			System.out.println("Its Odd Number:" +num);
			break;
		}
		

	}

}
