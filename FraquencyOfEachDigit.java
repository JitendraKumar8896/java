package assignment;

import java.util.Scanner;

public class FraquencyOfEachDigit {

	public static void main(String[] args) {
		int num ,i,count,digit,rem;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        num = sc.nextInt();
        
        System.out.println("Digit \t Frequency");
        for(i =0; i<=9;i++)
        {
        	count =0;
        	rem = num;
        	while(rem!=0)
        	{
        		digit =rem%10;
        		if(digit == i)
        		{
        			count++;
        		}
        		rem = rem/10;
        	}
        	if(count!=0)
        	{
        		System.out.println(i+ "\t" +count);
        	}
        	
        }
	}

}
