package pattern;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to row:");
		int r = sc.nextInt();
		for(int i =0;i<=r;i++)
		{
			for(int j = 0;j<=i;j++)
				
			{
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
		


	}

}
