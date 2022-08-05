package days;

import java.util.Scanner;

public class GivenDigitGrater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c ;
		
      do {		
		System.out.print("Enter digit:");
		int num = sc.nextInt();
		
		int r,larg=0;
		
		while(num>0)
		{
		   r = num % 10;
		   if(larg < r)
		   {
			   larg = r;
		   }
		  
		   
			num = num/10;   
		}
      System.out.println("Maximum Number Is:"+larg);
     
      System.out.println("Do you want to continue ??(y/n)");
      c= sc.next().charAt(0);
      } while(c == 'y' || c == 'Y'); 
      
	}

}
