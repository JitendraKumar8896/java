package assignment;

import java.util.Scanner;

public class SquareOfNDigit {

	public static void main(String[] args) {
		System.out.print("Enter theb number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =1; i<=num;i++)
        {
        	int square = i*i;
        	System.out.println(i + "\t" + square );
        }
        		
	}

}
