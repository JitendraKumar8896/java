package part;

import java.util.Scanner;

public class PartOfTime {

	public static void main(String[] args) {
		System.out.print("Enter hours : ");

	       Scanner in = new Scanner(System.in);

	       double totalHours = in.nextInt();

	       double standardWage = 100;

	       int day = 365;

	       double totalWage;

	     

	       if (totalHours >= 1 || totalHours <=24) {

	          totalWage = day *standardWage*totalHours; 

	          System.out.println("Your total salary of the year is: " + totalWage);
	       }              

	       else
	        System.out.println("Unable to calculate the earnings");
        }
        
	}


