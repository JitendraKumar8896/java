package days;

import java.util.Scanner;

public class PrimeSecond {

	public static void main(String[] args) {
		int num , mid,c=2;
		Scanner sc = new Scanner(System.in);
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
	}
	

}