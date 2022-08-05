package assignment;

import java.util.Scanner;

public class ArmstrongNumber22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
        int num = sc.nextInt();
        int temp,sum=0,r,cnt=1;
        temp = num;
        while(temp !=0)
        {
        	cnt++;
        	temp = temp/10;
        }
        int product = 1;
        temp = num;
        while(temp!=0)
        {
        	
        	r = temp%10;
        	for(int i=1;i<=cnt;i++)
        	{
        		product = product*r;
        	}
        	sum =sum+product;
        	temp = temp /10;
        }
        if(num == sum)
        	System.out.println("Is A armstrong number: " +product);
        else
        	System.out.println("Is  not  A armstrong number: " +product);
	}

}
