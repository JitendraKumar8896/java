package classesobjects;

import java.util.Scanner;

public class ReturnMethod {
	int totalCal(int m1,int m2,int m3,int m4,int m5)
	{
		int total = m1+m2+m3+m4+m5;
		return total;
	}
	float percentCal(int total) 
	{
		float percent = total/5;
		System.out.println("Percent is:"+percent);
	    return percent;
	}
	
	void grade(float p)
	{
		if(p>75)
		{
			System.out.println("Distinction");
		}
		else if(p>65 && p<=75)
		{
		System.out.println("First Division");	
		}
		
		else if(p>55 && p<=65)
		{
			System.out.println("Second division");
		}
		else if(p>45 && p<=55)
		{
			System.out.println("Third division");
		}
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReturnMethod r= new ReturnMethod();
		int m1,m2,m3,m4,m5;
		System.out.println("Enter the marks:");
         m1 = sc.nextInt();
         m2 = sc.nextInt();
         m3 = sc.nextInt();
         m4 = sc.nextInt();
         m5 = sc.nextInt();
        
        int total = r.totalCal(m1, m2, m3, m4, m5);
        float percentage = r.percentCal(total);
        r.grade(percentage);
	}

}
