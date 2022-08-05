package days;

import java.util.Scanner;

public class SumOfTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
        int num = sc.nextInt();
        int sum =0;
        while(num!=0)
        {
        	int r = num%10;
        	sum = sum+r;
        	num = num/10;
        }
        System.out.println("Additind of digits is:"+sum);
	}

}
