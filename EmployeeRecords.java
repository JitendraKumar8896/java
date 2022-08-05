package classesobjects;

import java.util.Scanner;

public class EmployeeRecords {
	int id, contect,salary;
	String name, dept;
	void setData(int i, String n, String d, int c,int s)
	{
		id =i;
		name = n;
		dept = d;
		contect = c;
		salary = s;
	}
	void display()
	{
		System.out.println(id+ "\t " +name+ "\t "+dept+ "\t\t "+contect+ " \t\t "+salary);
	}
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id:");
		int id = sc.nextInt();
		System.out.println("Enter the Name:");
		String name = sc.next();
		System.out.println("Enter the Department:");
		String dept = sc.next();
		System.out.println("Enter Contect:");
        int contect = sc.nextInt();
        System.out.println("Enter Salary:");
        int salary = sc.nextInt();
       
        EmployeeRecords s1  = new EmployeeRecords();
        s1.setData(id, name, dept, contect,salary);
         
        System.out.println("Enter the Id:");
	    id = sc.nextInt();
		System.out.println("Enter the Name:");
	    name = sc.next();
		System.out.println("Enter the Department:");
	    dept = sc.next();
		System.out.println("Enter Contect:");
		contect = sc.nextInt();
		System.out.println("Enter Salary:");
        salary = sc.nextInt();
       
        EmployeeRecords s2  = new EmployeeRecords();
        s2.setData(id, name, dept, contect,salary);
        
        System.out.println("Enter the Id:");
	    id = sc.nextInt();
		System.out.println("Enter the Name:");
	    name = sc.next();
		System.out.println("Enter the Department:");
	    dept = sc.next();
		System.out.println("Enter Contect:");
		contect = sc.nextInt();
		System.out.println("Enter Salary:");
        salary = sc.nextInt();
		
        EmployeeRecords s3  = new EmployeeRecords();
        s3.setData(id, name, dept, contect,salary);
        
        System.out.println("------Employees Details------ ");
        System.out.println("Id \t Name \t Department \t Contect \t Salary ");
        s1.display();
        System.out.println("/n----------------------*******----------------------- ");
        s2.display();
        System.out.println("/n----------------------*******----------------------- ");
        s3.display();
        System.out.println("/n----------------------*******----------------------- ");
	}

}
