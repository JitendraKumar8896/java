package days;

import java.util.Scanner;

public class MaxMinInDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       char ch;
	do {	
		System.out.print("Enter A Digit:");
		int num = sc.nextInt();
		int max = 0,min =0;
		int r;
		while(num != 0)
		{
			r = num%10;
			if(r < min)
			{
				min = r;
			}
			if(r > max) {
				max = r;
			}	
		 num = num/10;	
		 
		}
		 System.out.println("Maximum Number Is:"+max);
		 System.out.println("Minimum Number Is:"+min);
	      System.out.println("Do you want to continue ??(y/n)");
	     ch= sc.next().charAt(0);
	}
	while(ch == 'y' || ch == 'Y');
	}

}
