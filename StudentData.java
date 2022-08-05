package classesobjects;

import java.util.Scanner;

public class StudentData {
	
	int id, marks;
	String name, dept;
	void setData(int i, String n, String d, int m)
	{
		id =i;
		name = n;
		dept = d;
		marks = m;
	}
	void display()
	{
		System.out.println(id+ " " +name+ " "+dept+ " "+marks );
	}
           
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id:");
		int id = sc.nextInt();
		System.out.println("Enter the Name:");
		String name = sc.next();
		System.out.println("Enter the Department:");
		String dept = sc.next();
		System.out.println("Enter Marks:");
        int marks = sc.nextInt();
       
        StudentData s1  = new StudentData();
        s1.setData(id, name, dept, marks);
        
        
        System.out.println("Enter the Id:");
	    id = sc.nextInt();
		System.out.println("Enter the Name:");
	    name = sc.next();
		System.out.println("Enter the Department:");
	    dept = sc.next();
		System.out.println("Enter Marks:");
        marks = sc.nextInt();
       
        StudentData s2  = new StudentData();
        s2.setData(id, name, dept, marks);
        
        System.out.println("------Student Details------ ");
        s1.display();
        s2.display();
       
	}

}
