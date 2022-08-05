// package basic;
import java.lang.*;

import java.util.Scanner;


public class Scanner1{

	public static void main(String[] args) {
		int a;
		Scanner sc;//sc is variable of type class
		sc=new Scanner(System.in);//new keyword allocate memory (sc is object)
		System.out.println("Enter Employee name");
		String name=sc.next();
		System.out.println("Enter Employee id");
	    int id=sc.nextInt();
	    System.out.println("Enter Employee salary");
	    int salary=sc.nextInt();
	    System.out.println("Enter Employee pf");
	    float pf=sc.nextFloat();
	    System.out.println("Enter Employee medical Allowances");
	    double ma=sc.nextDouble();
	    System.out.println("Enter gender");
	    char ch=sc.next().charAt(0);
	    String gender=sc.next();
	    
	    
	    System.out.println("Employee name is..."+name);
	    System.out.println("Employee id is..."+id);
	    System.out.println("Employee salary is..."+salary);
	    System.out.println("Employee pf is..."+pf);
	    System.out.println("Employee medical Allowances is..."+ma);
	    System.out.println("Employee gender is..."+gender);
	    
	    
		
		
		
		

	}

}
