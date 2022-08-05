package assignment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter Number to check Armstrong:");	
	    int num = sc.nextInt();
	    int rem,arm=1,sum=0;
	    arm =num;
	    while(num !=0)
	    {
	    	rem = num%10;
	    	num = num/10;
	    	sum = sum+(rem*rem*rem);
	    	
	    }
	    if(sum == arm) {
	    	System.out.println("Is A Armstrong Number: "+ arm);
	    }
	    else {
	    	System.out.println("Is Not Armstrong Number:" + arm);
	    }
	}

}
