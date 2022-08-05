package classesobjects;

import java.util.Scanner;

public class NationalGame {
	
	void india() {
		System.out.println(" Indian National Game: Hockey");
		
	}
	void china() {
		System.out.println("Chineas  National Game: Table Tennis ");
	}
	void bangladesh() {
		System.out.println("Bangladesh  National Game: Kabaddi ");
	}
	void italy() {
		System.out.println("Italy National Game: Football ");
	}
	void unitedState() {
		System.out.println("United State National Game: baseball ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NationalGame n = new NationalGame();
		System.out.println("India");
		System.out.println("China");
		System.out.println("Bangldesh");
		System.out.println("Italy");
		System.out.println("United State");
		System.out.println("Enter your choice:");
		String ch = sc.next();
		switch(ch)
		{
		   case "India":
			  n.india();
			  break;
			  
		   case "China":
			   n.china();
			   break;
			   
		   case "Bangladesh":
			   n.bangladesh();
			   break;
			   
		   case "Italy":
			   n.italy();
			   break;
			   
			   
		   case "United State":
			   n.unitedState();
			   break;	   
			   
	       default:
	    	   System.out.println("You Enter Invalid Choice...!!! ");
		}
			
	}

}
