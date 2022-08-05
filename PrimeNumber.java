package days;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = sc.nextInt();
        boolean flag = false;
        int i =2;
        while(i <= n/2)
        {
        	if(n%i == 0)
        	{
        		flag = true;
        		break;
        		
        	}
        	i++;
        }
        if(!flag)
        	System.out.println("Prime Number Is:" +n);
        else
        	System.out.println("Is Not A Prime Number: " +n);

	}

}
