package days;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
        int num = sc.nextInt();
        int table;
        int i = 1;
        while(i<=10)
        {
        	 table = num*i;
        	 System.out.println(table);  
        	i++;
        }
	 
	}

}
