package classesobjects;

import java.util.Scanner;

public class FactorialByMethod {
	 
	void factorial(int n)
	{
		int fact =1;
		for(int i =1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial:"+fact);
	}
	void power(int num, int power)
	{
		int product = 1;
		for(int i=1; i<=power;i++)
		{
			product = product*num;
		}
		System.out.println(num +"^"+power+":"+product);
	}
	

	public static void main(String[] args) 
	{
		FactorialByMethod f1 = new FactorialByMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.factorial");
		System.out.println("2.power");
		System.out.println("Enter your choice:");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter number:");
			int n = sc.nextInt();
			f1.factorial(n);
			break;
		case 2:
			System.out.println("Enter a number to find the power:");
			int num = sc.nextInt();
			System.out.println("Enter the power:");
			int p = sc.nextInt();
			f1.power(num, p);
			break;
	   default:
		   System.out.println("Enter valid number...!!!!");
		}
	}

}
