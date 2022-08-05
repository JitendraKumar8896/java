package assignment;

import java.util.Scanner;

public class CalculateTheNmberOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int product=1;
		int rem;
		
		System.out.print("Enter Number of digit :");
        int num =sc.nextInt();
        int num2 = num;
        for(int i =1;i<= num; i++)
        {
           rem = num%10;
           product = product*rem;
           num = num/10;
        	
        
        }
       
        System.out.println(num2+ " The product of digits : "+ product);
	}
	
}