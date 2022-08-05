package days;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in); 
		    int level = 0; 
		   
		    System.out.println("MENU");
		    
		    System.out.println("1.Beginner");
		    System.out.println("2.Intermediate");
		    System.out.println("3.Expert");
		    
		    System.out.println("PLease Enter Your Choice....");
		    String levelString= sc.next();  
		     
		      
		    switch(levelString){    
		      
		    case "Beginner": level=1;  
		    break;    
		    case "Intermediate": level=2;  
		    break;    
		    case "Expert": level=3;  
		    break;    
		    default : level=0;
		    	break;
	      }   
		    System.out.println("Your Level is: "+level);  
		   

  
	}

}
