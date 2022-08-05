package assignment;

import java.util.Scanner;

public class UserOfPower {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);		
     System.out.print("Enter Base:");
     int base = sc.nextInt();
     System.out.print("Enter Power:");
     int power = sc.nextInt();
     int res =1;
   //  double res = Math.pow(base, power);
     for( ;power!=0;--power)
     {
    	 res *= base; 
     }
     System.out.println("Result:" +res);
     
	}
 
}
