package classesobjects;

import java.util.Scanner;

public class SubjectMarks {
       int id,hin,eng,math,phy,chem;
       String name,dep;
       void setData(int i,String n,String d,int h,int e,int m,int p,int c)
       {
    	   id = i;
    	   name = n;
    	   dep = d;
    	   hin = h;
    	   eng = e;
    	   math = m;
    	   phy = p;
    	   chem = c;
       }
	  int add()
	  {
		int total = hin+eng+math+phy+chem;
		return total;
	  }
	  float percentage(int total) {
		  
		float per = total/5;
		return per;
	  }
	  
	  void grade(float per)
	  {
		  if(per >= 85)
	        {
	        	System.out.println(per+ " he should get A+ grade");
	        }
	        else if (per >= 75 && per < 85)
	        {
	        	System.out.println(per +" he should get A grade");
	        }
	        else if (per >= 65 && per < 75)
	        {
	        	System.out.println(per+ " he should get B grade");
	        }
	        else if (per >= 55 && per < 65)
	        {
	        	System.out.println(per+ " he should get C grade");
	        }
	        else if (per>= 45 && per < 55)
	        {
	        	System.out.println(per+ " he should get D grade");
	        }
	        else if (per >= 35 && per < 45)
	        {
	        	System.out.println(per+ " he should get pass ");
	        }
	        else if(per < 35)
	        {
	        	System.out.println("percentage is less than"+ per+" fail ");
	        }
	  }
	  void display(float per)
	  {
		  
		System.out.println(id+ "\t " +name+ "\t "+ dep+"\t"+per); 
	  }
	
	public static void main(String[] args) {
		int id, hin,eng, math, phy, chem;
		String name,dep;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID:");
		id = sc.nextInt();
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter Stream:");
		dep = sc.next();		
		System.out.print("Enter marks of hindi:");
	    hin = sc.nextInt();
	    System.out.print("Enter marks of english:");
	    eng = sc.nextInt();		
	    System.out.print("Enter marks of math:");
	    math = sc.nextInt();		
	    System.out.print("Enter marks of physics:");
	    phy =sc.nextInt();		
	    System.out.print("Enter marks of chemestry:");
	    chem = sc.nextInt();
	    
	    SubjectMarks s1 = new SubjectMarks();
	    s1.setData(id, name, dep, hin, eng, math, phy, chem);
	    int total = s1.add(); 
	    float per  = s1.percentage(total);
	    s1.grade(per);
	    
	    System.out.println("Enter ID:");
		id = sc.nextInt();
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter Stream:");
		dep = sc.next();		
		System.out.print("Enter marks of hindi:");
	    hin = sc.nextInt();
	    System.out.print("Enter marks of english:");
	    eng = sc.nextInt();		
	    System.out.print("Enter marks of math:");
	    math = sc.nextInt();		
	    System.out.print("Enter marks of physics:");
	    phy =sc.nextInt();		
	    System.out.print("Enter marks of chemestry:");
	    chem = sc.nextInt();
	    
	    SubjectMarks s2 = new SubjectMarks(); 
	    s2.setData(id, name, dep, hin, eng, math, phy, chem);
	    int total1 = s2.add();
	    float per1  = s2.percentage(total1);
	    
	    System.out.println("\n....Student Details...\n");
	    s1.display(per);
	    System.out.println("----------------------*******----------------------- ");
	    s2.display(per1);
	    System.out.println("----------------------*******----------------------- ");
	    
	}

}
