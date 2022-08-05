package classesobjects;

import java.util.Scanner;

public class FibbonacciSeries {
	void fibonacci(int num) {
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
	void reverse(int n) {
		 int rev =0;
	        while(n!=0)
	        {
	        	int r = n%10;
	        	rev = rev*10+r;
	        	n = n/10;
	        }
	        System.out.println("Reverse digits is:"+rev);

		
	}

	public static void main(String[] args) {
		FibbonacciSeries f1 = new FibbonacciSeries();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num = sc.nextInt();
        f1.fibonacci(num);
        
        System.out.println("\nEnter number to reverse:");
		int n = sc.nextInt();
        f1.reverse(n);
	}

}
