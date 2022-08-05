package leapyear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year to check leap year:");
		int year = sc.nextInt();
		if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))
		{
			System.out.println(year +" Is A Leap Year");
        }
		else
		{
			System.out.println(year +" Is Not A Leap Year");
		}
	}

}
