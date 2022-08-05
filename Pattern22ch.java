package pattern;

import java.util.Scanner;

public class Pattern22ch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alphabet = 97;
		System.out.print("Enter Row:");
		int row = sc.nextInt();
		
		for (int i = 1; i <=row; i++)
		{
			for (int j = 1; j <= i; j++) 
            { 
				System.out.print((char) (alphabet + i - 1) + " ");
            } 
              System.out.println(); 
          }
            for (int i = row; i >= 1; i--)
		    {
			    for (int j = 1; j <= i; j++)
			    {
			    	System.out.print((char) (alphabet + i - 1) + " ");
			    }
		      System.out.println();
		    }


	}

}
