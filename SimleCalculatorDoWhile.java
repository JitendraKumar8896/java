package days;

import java.util.Scanner;

public class SimleCalculatorDoWhile {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  
	      char c;
	      
 do {
	 System.out.println("MENU");
     System.out.println("1.Addition ");
     System.out.println("2.Subtraction ");
     System.out.println("3.Multiplication ");
     System.out.println("4.Division ");
     System.out.print("Enter your choice...");
     int ch = sc.nextInt();
	 switch(ch)
		{
		case 1:
			 System.out.print("Enter first and  second number:");
		      int a = sc.nextInt();
		      
		      int b= sc.nextInt();
			System.out.println("Addition is:" +(a+b));
		break;
		
		case 2:
			System.out.print("Enter first and  second number:");
		       a = sc.nextInt();
		      
		      b= sc.nextInt();
			System.out.println("Subtrction is:" +(a-b));
		break;
		
		case 3:
			System.out.print("Enter first and  second number:");
		      a = sc.nextInt();
		      
		      b= sc.nextInt();
			System.out.println("Multiplication is:" +(a*b));
		break;
		
		case 4:
			System.out.print("Enter first and  second number:");
		      a = sc.nextInt();
		      
		      b= sc.nextInt();
		      if(b==0)
		      {
		    	  System.out.println("Denominator cannot be zero");
		    	  System.out.println("Enter the denominator:");
		    	  b= sc.nextInt();
		      }
		            
		    	  System.out.println("Division is:"+(a/b));
		      
		      /*
		      if(b != 0) {
			   System.out.println("Division is:" +(a/b));
		      }
		      else {
		    	  System.out.println("Please do not enter dinominator zero !!");
		      }  */
		          
		    			  
		break;
		default:System.out.println("You Enter wrong choice .......");
		
	}
	 System.out.println("Do you want to continue ??(y/n)");
		c =sc.next().charAt(0);
 }	 
	while(c =='y' || c == 'Y') ;
	 
	 
 
	
	}

}
