package days;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num , mid,c=2;
		 
          char ch;
		do {
			System.out.println("Enter Number:"); 
	        num = sc.nextInt();
	         mid = num/2;
	         while(c <= mid)
	         {
	        	 if(num%c==0)
	        	 {
	        		 break;
	        	 }
	        	 c++;
	         }
	         if(c>mid)
	        	 System.out.println("Prime Number");
	         else
	        	 System.out.println("Not a prime number!!!");
	             System.out.println("Do you want to continue ??(y/n)");
	             ch = sc.next().charAt(0);
		}
		
         while(ch=='y' || ch=='Y');
        	 
	}

}
