package days;

import java.util.Scanner;

public class DoWhileLoopThali {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  char ch;
	  do 
	  {
		  System.out.println("MENU");
		  System.out.println("1.Vegaterian ");
		  System.out.println("2.Non-Vegaterian "); 
		  System.out.print("Enter your choice...");
		  int th = sc.nextInt();
		  switch(th)
			{
			case 1:
				  System.out.print("Enter price:");
			      int a = sc.nextInt();
			      System.out.println("Enter Thali");
			      int b= sc.nextInt();
				  System.out.println("Total Price is:" +(a*b));
			break;
			
			case 2:
				  System.out.print("Enter price:");
			      a = sc.nextInt();
			      System.out.println("Enter Thali");
			      b= sc.nextInt();
				  System.out.println("Total Price is:" +(a*b));
			break;	  
		} 
		  System.out.println("Do you want to continue ???(y/n)");
		  ch = sc.next().charAt(0);
	  }
	 
	  while(ch == 'y' || ch=='Y');

	}

}
