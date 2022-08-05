package days;

import java.util.Scanner;

public class EvenOddSumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Digits:");
		int num =sc.nextInt();
        int  digit,  sum =0, sum1 = 0;
     while(num!=0)  
     { 
    	 digit = num%10;
           if(digit%2==0)
           {
             	sum = sum +digit;
           }
          else
          {
        	sum1 = sum1+digit;
          }
         num= num/10;  
     }
        System.out.println("Even Sum Is:"+sum);
        System.out.println("Odd Sum Is:"+sum1);
	}

}
