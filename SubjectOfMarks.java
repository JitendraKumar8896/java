package subjectsmarks;

import java.util.Scanner;

public class SubjectOfMarks {

	public static void main(String[] args) {
		float hindi,english, math, physics, chemestry;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks of hindi:");
	    hindi = sc.nextFloat();
	    System.out.print("Enter marks of english:");
	    english = sc.nextFloat();		
	    System.out.print("Enter marks of math:");
	    math = sc.nextFloat();		
	    System.out.print("Enter marks of physics:");
	    physics =sc.nextFloat();		
	    System.out.print("Enter marks of chemestry:");
	    chemestry = sc.nextFloat();	
	     
        double total = hindi+english+math+physics+chemestry;
        double percentage = (total/500)*100;
        System.out.println("Total Is:" +total);
        System.out.println("Percentage Is:"+ percentage);
        if(percentage >= 85)
        {
        	System.out.println(percentage+ " he should get A+ grade");
        }
        else if (percentage >= 75 && percentage < 85)
        {
        	System.out.println(percentage +" he should get A grade");
        }
        else if (percentage >= 65 && percentage < 75)
        {
        	System.out.println(percentage+ " he should get B grade");
        }
        else if (percentage >= 55 && percentage < 65)
        {
        	System.out.println(percentage+ " he should get C grade");
        }
        else if (percentage >= 45 && percentage < 55)
        {
        	System.out.println(percentage+ " he should get D grade");
        }
        else if (percentage >= 35 && percentage < 45)
        {
        	System.out.println(percentage+ " he should get pass ");
        }
        else if(percentage < 35)
        {
        	System.out.println("percentage is less than"+ percentage +" fail ");
        }
	}
}
