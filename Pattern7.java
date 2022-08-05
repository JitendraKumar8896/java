package pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Char:");
        char ch = sc.next().charAt(0);
        for(char c = 'a'; c<=ch;c++)
        {
        	for(char j = 'a'; j<=c; j++)
        	{
        		System.out.print(j+ " ");
        	}
        	System.out.println(" ");
        }

	}

}
