package days;

import java.util.Scanner;

public class FiveNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to 5 Number:");
		int num = sc.nextInt();
		 switch(num)
	        {
	            case 1:
	                System.out.println("One");
	            case 2:
	                System.out.println("Two");
	           
	            case 3:
	                System.out.println("Three");
	            case 4:
	                System.out.println("Four");
	            case 5:
	            	System.out.println("Five");
	            default:
	                System.out.println("hii"); 
	        }

	}

}
