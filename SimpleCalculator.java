package calculator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a = sc.nextInt();
		System.out.print("Enter the Second number:");
		int b = sc.nextInt();
		System.out.println("Enter operator");
		char c = sc.next().charAt(0);
		if(c == '+')
		{
			System.out.println("Sum is:" +(a+b));
		}
		else if(c == '-')
		{
			System.out.println("Subtract is: " +(a-b));
		}
		else if(c == '/')
		{
			System.out.println("division is:" +(a/b));
		}
		else if(c == '*')
		{
			System.out.println("multification is:"+(a*b));
		}
		else if(c == '%')
		{
			System.out.println("remender is :"+(a%b));
			
		}
		
		else {
			System.out.println("Invalid Operator!!");
		}
		
	}

}
