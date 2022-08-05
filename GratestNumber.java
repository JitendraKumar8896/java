package days;

import java.util.Scanner;

public class GratestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number a And b:");
		int a,b;
	     a = sc.nextInt();
		 b = sc.nextInt();
		
		switch(a > b)
		{
		case 0:
			System.out.println("Maximum number" +b);
			break;
		case 1:
			System.out.println("Maximum number" +a);
			break;
        default:
    	   System.out.println("Both OR Equal");
    	   break;
		}

	}

}
