package assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.print("Enter number to check Fibonacci Series :");
        int num = sc.nextInt();
        int a, b=1,fibo=0;
        int c= fibo;
        
        for(int i = 1; i<=num;i++)
        {
        	System.out.print(fibo+ " ");
        	a = b;
        	b = fibo;
        	fibo  = a+b;
        	
        	
        }
        
        
	}

}
