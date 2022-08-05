package pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to row:");
		int r = sc.nextInt();
		for(int i =1;i<=r;i++)
		{
			for(int j = 1;j<=i;j++)
				
			{
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
		

	}

}
