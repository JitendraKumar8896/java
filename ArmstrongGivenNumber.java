package assignment;

import java.util.Scanner;

public class ArmstrongGivenNumber {

	public static void main(String[] args) {
		int num , temp, rem, pw = 0;
		double sum = 0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter number to Check Armstrong : ");
        num = sc.nextInt();

		
		temp = num;
		while (temp != 0) {
			pw = pw + 1;
			temp = temp / 10;
		}
		   
		temp = num;
		while( temp > 0)  {
		    rem = temp %10;
		    sum = sum + Math.pow(rem, pw);
		    temp = temp /10;
		}
		
		
		if (sum == num) {
			System.out.println("It Is An Armstrong Number : " + num);
		}
		else {
			System.out.println(" Not A Armstong number: " + num);
		}

	}

}
