package classesobjects;

import java.util.Scanner;

public class GreadeCalculat {
	int totalCal(int m1,int m2,int m3,int m4,int m5)
	{
		int total = m1+m2+m3+m4+m5;
		return total;
	}
	int  percentCal(int total) 
	{
	    int  percent = total/5;
		System.out.println("Percent is:"+percent);
	    return percent;
	}
	
	void grade(int  total)
	{
		if(percentCal(total) >= 85)
		{
			System.out.println("Distinction");
		}
		else if(percentCal(total) >= 75 && percentCal(total) < 85)
		{
		System.out.println("A Grade ");	
		}
		
		else if(percentCal(total) >= 65 && percentCal(total) < 75)
		{
			System.out.println("B Grade");
		}
		else if(percentCal(total) >= 55 && percentCal(total) < 65)
		{
			System.out.println("C Grade");
		}
		else if(percentCal(total) >= 45 && percentCal(total) < 55){
			System.out.println("C Grade ");
		}
		else {
			System.out.println(" Fails...!!!");
		}
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReturnMethod pc= new ReturnMethod();
		int m1,m2,m3,m4,m5;
		System.out.println("Enter the marks:");
         m1 = sc.nextInt();
         m2 = sc.nextInt();
         m3 = sc.nextInt();
         m4 = sc.nextInt();
         m5 = sc.nextInt();
        
         int total = pc.totalCal(m1, m2, m3, m4, m5);
        // int percentage = (int) pc.percentCal(total);
         pc.grade(total);

	}

}
