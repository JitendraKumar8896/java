package pattern;

import java.util.Scanner;

public class Pattern24ch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alphabet = 97;
		System.out.print("Enter Row:");
		int rows = sc.nextInt();
		
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++) 
            { 
				System.out.print((char) (alphabet + j - 1) + " ");
            } 
              System.out.println(); 
         }
            for (int i = rows; i >= 1; i--)
		    {
			    for (int j = 1; j <= i-1; j++)
			    {
			    	System.out.print((char) (alphabet + j - 1) + " ");
			    }
		      System.out.println();
		    }

	}

}
